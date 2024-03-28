package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2 
{
	public WebDriver driver;

	public Loginpage2(WebDriver drivers) 
	{
		driver=drivers;
		PageFactory.initElements(drivers, this);
		
	}
	@FindBy(id="Email")
	WebElement enter_email;
	
	@FindBy(id="Password")
	WebElement enter_password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement click_button;
	
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement log_out;
	
	
	public void enteremail(String mail)
	{
		enter_email.clear();
		enter_email.sendKeys(mail);
		
	}
	public void enterpass(String pass)
	{
		enter_password.clear();
		enter_password.sendKeys(pass);
		
	}
	public void buttonclick() 
	{
		click_button.click();
		
	}
	public void logout() 
	{
		log_out.click();
		
	}
	

}
