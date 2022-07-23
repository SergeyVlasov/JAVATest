package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/Resources/TestGoogle.feature",
        glue = {"StepDefinitions"}
)
public class Run extends AbstractTestNGCucumberTests {
}
