package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CommenMethodsWait {

    private WebDriver driver;

    public CommenMethodsWait(WebDriver driver) {
        this.driver = driver;
    }

    // Set implicit wait globally
    public void setImplicitWait(int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    // Wait until element is visible
    public WebElement waitForVisibility(WebElement element, int timeoutSeconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
                .until(ExpectedConditions.visibilityOf(element));
    }

    // Wait until element is clickable
    public WebElement waitForClickability(WebElement element, int timeoutSeconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    // Wait until element is present in DOM
    public WebElement waitForPresence(By locator, int timeoutSeconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
                .until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    // Wait until element is invisible
    public boolean waitForInvisibility(WebElement element, int timeoutSeconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
                .until(ExpectedConditions.invisibilityOf(element));
    }

    // Wait until text is present in element
    public boolean waitForText(WebElement element, String text, int timeoutSeconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
                .until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    // Wait until alert is present
    public Alert waitForAlert(int timeoutSeconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
                .until(ExpectedConditions.alertIsPresent());
    }

    // Wait until title contains specific text
    public boolean waitForTitleContains(String partialTitle, int timeoutSeconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
                .until(ExpectedConditions.titleContains(partialTitle));
    }

    // Wait until URL contains specific text
    public boolean waitForURLContains(String partialURL, int timeoutSeconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
                .until(ExpectedConditions.urlContains(partialURL));
    }

    // Wait until frame is available and switch to it
    public WebDriver waitForFrameAndSwitch(By frameLocator, int timeoutSeconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
    }

    // Wait until number of windows equals expected count
    public boolean waitForWindowCount(int expectedCount, int timeoutSeconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
                .until(ExpectedConditions.numberOfWindowsToBe(expectedCount));
    }
}
