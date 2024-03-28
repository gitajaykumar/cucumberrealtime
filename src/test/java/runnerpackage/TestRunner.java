package runnerpackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C://Users//admin//eclipse-workspace//Cucumberrealtimeframework//src//test//resources//Features//login.feature",
                  glue="stepdefnitation",
		         dryRun=false,
		         monochrome=true,
		         plugin= {"pretty", "html:test-output"})
		         
		public class TestRunner {

	
	

}
