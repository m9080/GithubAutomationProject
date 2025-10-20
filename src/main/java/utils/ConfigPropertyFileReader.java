package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.TreeMap;

import io.github.cdimascio.dotenv.Dotenv;

public class ConfigPropertyFileReader {

    private static final Dotenv dotenv = Dotenv.load();
    private static final String CONFIG_PATH = "src/main/resources/config.properties";

    public static void main(String[] args) {
        System.out.println(getAllConfigDetails());
    }

    public static String getConfigDetail(String key) {
        String value = null;
        try {
            Properties prop = new Properties();
            FileInputStream file = new FileInputStream(CONFIG_PATH);
            prop.load(file);
            value = prop.getProperty(key);
            value = resolveEnvVariable(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }

    public static TreeMap<String, String> getAllConfigDetails() {
        TreeMap<String, String> configMap = new TreeMap<>();
        try {
            Properties prop = new Properties();
            FileInputStream file = new FileInputStream(CONFIG_PATH);
            prop.load(file);

            for (String key : prop.stringPropertyNames()) {
                String rawValue = prop.getProperty(key);
                String resolvedValue = resolveEnvVariable(rawValue);
                configMap.put(key, resolvedValue);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return configMap;
    }

    private static String resolveEnvVariable(String rawValue) {
        if (rawValue != null && rawValue.startsWith("${") && rawValue.endsWith("}")) {
            String envKey = rawValue.substring(2, rawValue.length() - 1);
            return dotenv.get(envKey);
        }
        return rawValue;
    }
}
