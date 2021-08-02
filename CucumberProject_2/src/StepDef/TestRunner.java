package StepDef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/CucumberProject_2"},
		glue= {"StepDef"},
		plugin= {"pretty", ""}
	
		)

public class TestRunner {

}
