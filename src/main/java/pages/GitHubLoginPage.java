package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigPropertyFileReader;

public class GitHubLoginPage {
	WebDriver driver;
	
	
	public static void main(String [] args) {
		try {
		String LoginPageUrl =ConfigPropertyFileReader.getConfigDetail("LOGINPAGEURL");
		System.out.println(LoginPageUrl);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	@FindBy(id="login_field")
	WebElement LoginPagePassWordBoxId;
	
	@FindBy(id="//input[@id='login_field']")
	WebElement LoginPagePassWordBoxXpath;
	
	@FindBy(id="password")
	WebElement LoginPageUserNameBoxId;
	
	@FindBy(id="//input[@id='password']")
	WebElement LoginPageUserNameBoxXpath;
	
	@FindBy(name="commit")
	WebElement LoginPageSignInButtonName;
	
	@FindBy(xpath="//input[@name='commit']")
	WebElement LoginPageSignInButtonXpath;

	@FindBy(id="forgot-password")
	WebElement LoginPageForgetPassWordId;
	
	@FindBy(xpath="//a[@id='forgot-password']")
	WebElement LoginPageForgetPassWordXpath;

	public  void GitHubLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
