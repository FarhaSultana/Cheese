package cucmberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\Feature\\Ty.feature",glue="stepDefinition",dryRun=false
		)
public class TestRunner {

}
