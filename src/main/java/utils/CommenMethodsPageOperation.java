package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class CommenMethodsPageOperation {

    // 🔽 Scroll down by pixels using JavaScript
    public void scrollDownJS(WebDriver driver, int pixels) {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0," + pixels + ")");
    }

    // 🔼 Scroll up by pixels using JavaScript
    public void scrollUpJS(WebDriver driver, int pixels) {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-" + pixels + ")");
    }

    // 🎯 Scroll to specific element using JavaScript
    public void scrollToElementJS(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    // ⌨️ Page Down using SendKeys
    public void pageDownSendKeys(WebDriver driver) {
        new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
    }

    // ⌨️ Page Up using SendKeys
    public void pageUpSendKeys(WebDriver driver) {
        new Actions(driver).sendKeys(Keys.PAGE_UP).perform();
    }

    // ⌨️ Arrow Down using SendKeys
    public void arrowDownSendKeys(WebDriver driver) {
        new Actions(driver).sendKeys(Keys.ARROW_DOWN).perform();
    }

    // ⌨️ Arrow Up using SendKeys
    public void arrowUpSendKeys(WebDriver driver) {
        new Actions(driver).sendKeys(Keys.ARROW_UP).perform();
    }

    // 🤖 Page Down using Robot
    public void pageDownRobot() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    // 🤖 Page Up using Robot
    public void pageUpRobot() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_UP);
            robot.keyRelease(KeyEvent.VK_PAGE_UP);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    // 🤖 Arrow Down using Robot
    public void arrowDownRobot() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    // 🤖 Arrow Up using Robot
    public void arrowUpRobot() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_UP);
            robot.keyRelease(KeyEvent.VK_UP);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
