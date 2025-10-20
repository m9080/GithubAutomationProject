package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CommenScreenshot {

    // Capture screenshot and return its path
    public static String captureScreenshot(WebDriver driver, String screenshotName) {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String path = "Screenshorts" + screenshotName + ".png";
        File dest = new File(path);
        dest.getParentFile().mkdirs(); // Ensure directory exists

        try {
            Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Screenshot saved at: " + path);
        } catch (IOException e) {
            System.err.println("Failed to save screenshot: " + e.getMessage());
        }

        return path;
    }
}
