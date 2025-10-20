package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigPropertyFileReader;

public class GitHubLoginPage {
public	WebDriver driver;

	
	
	@FindBy(id = "login_field")
	public WebElement LoginPageUserNameBoxId;
	
	@FindBy(xpath = "//input[@id='login_field']")
	public WebElement LoginPageUserNameBoxXpath;

	@FindBy(id = "password")
	public WebElement LoginPagePassWordBoxId;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement LoginPagePassWordBoxXpath;

	
	
	@FindBy(name = "commit")
	public WebElement LoginPageSignInButtonName;
	
	@FindBy(xpath = "//input[@name='commit']")
	public WebElement LoginPageSignInButtonXpath;

	@FindBy(id = "forgot-password")
	public WebElement LoginPageForgetPassWordId;
	
	@FindBy(xpath = "//a[@id='forgot-password']")
	public WebElement LoginPageForgetPassWordXpath;
 
	public GitHubLoginPage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}

}
