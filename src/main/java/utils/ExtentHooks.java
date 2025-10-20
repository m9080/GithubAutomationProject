package utils;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.ExtentReports;
import io.cucumber.java.*;

public class ExtentHooks {
    private static ExtentReports report = ExtentManager.getInstance();
    private static ExtentTest test;

    @Before
    public void beforeScenario(Scenario scenario) {
        test = report.createTest(scenario.getName());
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        if (scenario.isFailed()) {
            test.fail("Step failed: " + scenario.getStatus());
        } else {
            test.pass("Step passed: " + scenario.getStatus());
        }
    }

    @After
    public void afterScenario() {
        report.flush();
    }

    public static ExtentTest getTest() {
        return test;
    }
}
