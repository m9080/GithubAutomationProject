package stepdefinition.githubstepfile;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.DriverfactoryManager;
import utils.Log;
public class Hooks {

 public   WebDriver driver;

    @Before
    public void tearUp(Scenario scenario) {
        Log.info("🔄 Starting scenario: " + scenario.getName() +" Before Hooks Starts");
     

        Log.info("Completed setup for scenario: " + scenario.getName() +" Before Hooks completed");
        
    }

    @After
    public void tearDown(Scenario scenario) {
        Log.info("🧹 Tearing down scenario: " + scenario.getName()+" After Hooks Starts");

        DriverfactoryManager.quitBrowser();
        Log.debug("🔒 Browser session ended."+" After Hooks");
        Log.info("Completed teardown for scenario: " + scenario.getName()+" After Hooks ends");
    }
}
