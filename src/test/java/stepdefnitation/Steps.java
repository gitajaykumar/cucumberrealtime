package stepdefnitation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Loginpage;

public class Steps 
{
	public WebDriver driver;
	Loginpage lp;


@Given("user open browser")
public void user_open_browser() 
{
	driver=new ChromeDriver();
	lp=new Loginpage(driver);
	
}
  

@When("user enter the url {string}")
public void user_enter_the_url(String url1) 
{
	
	driver.get(url1);
}


@When("user enter the username {string} password {string}")
public void user_enter_the_username_password(String name, String password) 
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	lp.enterusername(name);
	lp.enterpassword(password);
    
}
@When("click the button")
public void click_the_button() 
{
	lp.clickbutton();
   
}
@Then("user navigate page")
public void user_navigate_page() 
{
	System.out.println("navigate the page");
    
}
}
