package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Log;

import java.time.Duration;

public class DriverfactoryManager {
    private static WebDriver driver;

    public static WebDriver launchBrowser(String browserName) {
        Log.info("Launching browser: " + browserName);

        try {
            switch (browserName.toLowerCase()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--headless", "--disable-gpu");
                    driver = new ChromeDriver(options);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;

                default:
                    throw new IllegalArgumentException("Unsupported browser: " + browserName);
            }


            Log.debug(browserName + " launched successfully.");
        } catch (Exception e) {
            Log.error("Error launching browser: " + e.getMessage());
        }

        return driver;
    }

    public static void closeBrowser(WebDriver driver) {
        if (driver != null) {
            try {
                driver.close();
                Log.info("Browser closed successfully.");
            } catch (Exception e) {
                Log.error("Error while closing browser: " + e.getMessage());
            }
        }
    }

    public static void quitBrowser(WebDriver driver) {
        if (driver != null) {
            try {
                driver.quit();
                Log.info("Browser quit successfully.");
            } catch (Exception e) {
                Log.error("Error while quitting browser: " + e.getMessage());
            }
        }
    }

    // ✅ Overloaded method for convenience
    public static void quitBrowser() {
        quitBrowser(driver);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void resetDriver() {
        driver = null;
        Log.debug("Driver reset to null.");
    }
}
