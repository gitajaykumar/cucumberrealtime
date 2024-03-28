package stepdefnitation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.AddcusLoginpage3;

public class Tags3 extends Base
{



	@Given("user open the browser")
	public void user_open_the_browser() 
	{
		driver=new ChromeDriver();
		als=new AddcusLoginpage3(driver);


	}

	@Given("user enter the url2 {string}")
	public void user_enter_the_url2(String url2) 
	{
		driver.get(url2);
		driver.manage().window().maximize();


	}

	@When("user enter the as email {string} and as password {string}")
	public void user_enter_the_as_email_and_as_password(String mail, String pass) throws InterruptedException 
	{
		Thread.sleep(5000);
		als.enteremail(mail);
		als.enterpass(pass);


	}

	@When("user click the button")
	public void user_click_the_button() throws InterruptedException 
	{
		Thread.sleep(2000);
		als.clickbutton();
	}

	@When("user click the customer menu")
	public void user_click_the_customer_menu() throws InterruptedException 
	{
		Thread.sleep(2000);
		als.clickcustomer();
    }

	@Then("user click the customer item")
	public void user_click_the_customer_item() 
	{
		als.addnewcustomer();

	}

	@Then("user click the add new customer")
	public void user_click_the_add_new_customer() 
	{
		als.addnewbutton();
     }

	@When("user enter the customer info")
	public void user_enter_the_customer_info() throws InterruptedException 
	{
		als.enternewemail("ajay@gmail.com");
		als.enternewpass("test123");
		als.enterfirstname("ajay");
		als.enterlastname("kumar");
		als.clickmalebutton();
		als.enterdateofbirth("17/04/2000");
		als.entercompany("aws");
		als.istaxclick();
		als.newsletter();
		Thread.sleep(2000);
		als.storename();
		
		//als.rigistersdelete();
		Thread.sleep(2000);
		als.customerroles();
		Thread.sleep(2000);
		
		
		als.adminis();
		Thread.sleep(2000);
		als.mangevendor();
		Thread.sleep(2000);
		//als.vendorclick();
		als.admincomment("verynice");


	}

	@When("click the save button")
	public void click_the_save_button() 
	{
		als.savebuttonclick();

	}

	@Then("view the conformation message")
	public void view_the_conformation_message() 
	{
		System.out.println("Done");

	}

}
