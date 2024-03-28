package stepdefnitation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Loginpage2;

public class Steps2 
{
	public WebDriver driver;
	
	Loginpage2 log;
	


@Given("open the browser")
public void open_the_browser() 
{
	driver=new ChromeDriver();
	log=new Loginpage2(driver);
	
}
	

@Given("user enter the url1 {string}")
public void user_enter_the_url1(String url) 
{


	driver.get(url);
	driver.manage().window().maximize();
}

@When("user enter the as {string} and as {string}")
public void user_enter_the_as_and_as(String email, String password) 
{

	log.enteremail(email);
	log.enterpass(password);
	
}
	

@When("user click login button")
public void user_click_login_button() 
{
	log.buttonclick();
}
	

@When("log out the page")
public void log_out_the_page() 
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	log.logout();
}
    
@Then("user navigate the home page")
public void user_navigate_the_home_page() 
{
 System.out.println("Done");
 driver.quit();

}
}
