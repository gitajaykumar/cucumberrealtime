package runnerpackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C://Users//admin//eclipse-workspace//Cucumberrealtimeframework//src//test//resources//Features//customer.feature",
                               glue="stepdefnitation",
                               tags="@tgs1",
                              dryRun=false,
                              monochrome=true
)

public class AddcustomerTestRunner {


	}


