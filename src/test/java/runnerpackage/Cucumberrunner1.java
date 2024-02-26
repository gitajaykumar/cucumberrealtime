package runnerpackage;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/Features/Googlesearch.feature",glue= {"cucumberstepDefnitation"},

 monochrome=true,

 plugin= {"pretty","junit:target/JUNITReports/reports.xml",
		 
		 "json:target\\JSONReports\\report.json",
		 "html:target\\HtmlReports"},
 
 tags="@smoketest"

)

public class Cucumberrunner1 
{

}
