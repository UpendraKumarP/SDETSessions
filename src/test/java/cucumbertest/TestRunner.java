package cucumbertest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = { "src\\test\\java\\cucumbertest\\FeatureTest.feature" },
	//	glue= {"CucumberTest", "Stepdefinition.java"},
	//	glue= {"src\\test\\java\\cucumbertest\\Stepdefinition.java"},
		format= {"pretty","html:target/cucumber"},
		tags= {"@SmokeTest3"}
		)

public class TestRunner {

}
