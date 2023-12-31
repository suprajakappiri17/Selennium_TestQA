package runnerClass;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features ="/MavenTest/src/test/resources/login.feature",
glue = "/MavenTest/src/test/java/StepDefinition/StepdefinitionLogin.java",
dryRun = true,
monochrome = true
	)

public class RunnerClassTest {

}
