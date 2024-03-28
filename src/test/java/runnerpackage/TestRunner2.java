package runnerpackage;




import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C://Users//admin//eclipse-workspace//Cucumberrealtimeframework//src//test//resources//Features//nploginpage.feature",
 glue="stepdefnitation",
 tags="@test1",
 dryRun=false,
 monochrome=true
		)

public class TestRunner2 
{

	
	

}
