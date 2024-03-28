package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	public WebDriver ldriver;

	public Loginpage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(name= "username")
	WebElement textuser;
	
	@FindBy(name= "password")
	WebElement textpasswords;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement buttonlogin;
	
	public void enterusername(String uname)
	{
		textuser.sendKeys(uname);
		
	}
	public void enterpassword(String passwords)
	{
		textpasswords.sendKeys(passwords);
	
	}
	public void clickbutton()
	{
		buttonlogin.click();
	}
}
