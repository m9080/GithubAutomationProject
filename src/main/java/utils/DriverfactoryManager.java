package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverfactoryManager {
    private static WebDriver driver;

    public static WebDriver launchBrowser(String browserName) {

		        switch (browserName.toLowerCase()) {
		            case "chrome":
		                WebDriverManager.chromedriver().setup();
		                driver = new ChromeDriver();
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

		        driver.manage().window().maximize();
		        return driver;
		    }

		    public static void closeBrowser(WebDriver driver) {
		        if (driver != null) {
		            try {
		                driver.close();
		            } catch (Exception e) {
		                System.out.println("Error while closing browser: " + e.getMessage());
		            }
		        }
		    }

		    public static void quitBrowser(WebDriver driver) {
		        if (driver != null) {
		            try {
		                driver.quit();
		            } catch (Exception e) {
		                System.out.println("Error while quitting browser: " + e.getMessage());
		            }
		        }
		    }

		    public static WebDriver getDriver() {
		        return driver;
		    }

		    

	}

}
