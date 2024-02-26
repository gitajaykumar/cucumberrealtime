package runnerpackage;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Features//Googlesearch.feature",glue={"cucumberstepDefnitation"})
public class Cucumberrunner3 
{

}
