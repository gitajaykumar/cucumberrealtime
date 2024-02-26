package cucumberstepDefnitation.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Googlesearch 
{
	WebDriver driver=null;
	

@Given("browser is open")
public void browser_is_open() 
{
	System.out.println("browser is open");
	driver=new ChromeDriver();
    
}
@And("user is on google search page")
public void user_is_on_google_search_page() 
{
	System.out.println("google search page");
	driver.get("https://www.google.com/");
   
}
@When("user enter a text in search box")
public void user_enter_a_text_in_search_box() throws InterruptedException 
{
	System.out.println("enter the text");
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(3000);
   
}
@And("hits enter")
public void hits_enter() throws InterruptedException 
{
	System.out.println("click enter");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);

}
@Then("user is navigated to search results")
public void user_is_navigated_to_search_results() 
{
	System.out.println("open the page");
	driver.getPageSource().contains("About Selenium");
	
   
}

}
