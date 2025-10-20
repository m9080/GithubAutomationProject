package stepdefinition.githubstepfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utils.DriverfactoryManager;
import utils.CommenMethods;
import utils.CommenMethodsWait;
import utils.Log;
import io.cucumber.java.en.*;
import utils.ConfigPropertyFileReader;
import pages.GitHubLoginPage;

public class LoginAndLogoutCheck {

    public WebDriver driver;
    public GitHubLoginPage loginPage;
    public CommenMethods cc;

    public String LOGINPAGEURL = ConfigPropertyFileReader.getConfigDetail("LOGINPAGEURL");
    public String GITHUB_USERNAME = ConfigPropertyFileReader.getConfigDetail("GITHUB_USERNAME");
    public String GITHUB_PASSWORD = ConfigPropertyFileReader.getConfigDetail("GITHUB_PASSWORD");
    public String GITHUB_BASE_URL = ConfigPropertyFileReader.getConfigDetail("GITHUB_BASE_URL");

    @Given("I launch the GitHub login page")
    public void i_launch_the_git_hub_login_page() {
        Log.info("Launching browser and navigating to GitHub login page");
        driver = DriverfactoryManager.launchBrowser("chrome");

        // Initialize utilities after driver is ready
        cc = new CommenMethods(driver);
        loginPage = new GitHubLoginPage(driver);

        driver.get(LOGINPAGEURL);
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getCurrentUrl(), LOGINPAGEURL);
        Log.info("GitHub login page loaded");
    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        Log.info("Entering valid GitHub credentials");
        WebElement username = cc.waits.waitForVisibility(loginPage.LoginPageUserNameBoxId, 10);
        WebElement password = cc.waits.waitForVisibility(loginPage.LoginPagePassWordBoxId, 10);
        username.sendKeys(GITHUB_USERNAME);
        password.sendKeys(GITHUB_PASSWORD);
    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        Log.info("Clicking login button");
        WebElement loginBtn = cc.waits.waitForClickability(loginPage.LoginPageSignInButtonXpath, 10);
        loginBtn.click();
        
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        Log.info("Verifying successful login");
        cc.waits.waitForURLContains(GITHUB_BASE_URL, 3);
        Assert.assertTrue(driver.getCurrentUrl().contains(GITHUB_BASE_URL));
        cc.waits.setImplicitWait(2);
    }

    @Then("I log out from GitHub")
    public void i_log_out_from_git_hub() {
        Log.info("Logging out from GitHub");
        // Add logout steps here using loginPage elements
    }

    @Then("I clear browser cookies")
    public void i_clear_browser_cookies() {
        Log.info("Clearing browser cookies");
        driver.manage().deleteAllCookies();
    }
}
