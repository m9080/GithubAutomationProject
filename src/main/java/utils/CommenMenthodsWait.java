package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CommenMenthodsWait {

    // Set implicit wait globally
    public static void setImplicitWait(WebDriver driver, int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }
    // Wait until element is visible
    public static void waitForVisibility(WebDriver driver, WebElement element, int timeoutSeconds) {
        new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
            .until(ExpectedConditions.visibilityOf(element));
    }

    // Wait until element is clickable
    public static void waitForClickability(WebDriver driver, WebElement element, int timeoutSeconds) {
        new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
            .until(ExpectedConditions.elementToBeClickable(element));
    }

    // Wait until element is present in DOM
    public static void waitForPresence(WebDriver driver, By locator, int timeoutSeconds) {
        new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
            .until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    // Wait until element is invisible
    public static void waitForInvisibility(WebDriver driver, WebElement element, int timeoutSeconds) {
        new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
            .until(ExpectedConditions.invisibilityOf(element));
    }

    // Wait until text is present in element
    public static void waitForText(WebDriver driver, WebElement element, String text, int timeoutSeconds) {
        new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
            .until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    // Wait until alert is present
    public static void waitForAlert(WebDriver driver, int timeoutSeconds) {
        new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
            .until(ExpectedConditions.alertIsPresent());
    }

    // Wait until title contains specific text
    public static void waitForTitleContains(WebDriver driver, String partialTitle, int timeoutSeconds) {
        new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
            .until(ExpectedConditions.titleContains(partialTitle));
    }

    // Wait until URL contains specific text
    public static void waitForURLContains(WebDriver driver, String partialURL, int timeoutSeconds) {
        new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
            .until(ExpectedConditions.urlContains(partialURL));
    }

    // Wait until frame is available and switch to it
    public static void waitForFrameAndSwitch(WebDriver driver, By frameLocator, int timeoutSeconds) {
        new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
            .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
    }

    // Wait until number of windows equals expected count
    public static void waitForWindowCount(WebDriver driver, int expectedCount, int timeoutSeconds) {
        new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
            .until(ExpectedConditions.numberOfWindowsToBe(expectedCount));
    }
    
    
    
    
}
