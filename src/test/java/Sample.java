import org.openqa.selenium.WebDriver;

import utils.CommenMethods;
public class Sample {

	public static void main(String[] args) {
		WebDriver driver;
		// TODO Auto-generated method stub
		
		CommenMethods cm = new CommenMethods();
		cm.ScreenShort.captureScreenshot(driver, "failurescreenshort");
		
		

	}

}
