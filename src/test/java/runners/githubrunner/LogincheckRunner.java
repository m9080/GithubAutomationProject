package runners.githubrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/Github_Features",
    glue = {"stepdefinition.githubstepfile"},
    plugin = {"pretty", "html:target/cucumber-report.html"},
    monochrome = true
)
public class LogincheckRunner extends AbstractTestNGCucumberTests {
    static {
        System.setProperty("runner", LogincheckRunner.class.getSimpleName());
        
    }
}
