package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenaricMethod 
{
	WebDriver driver;


	public void openBrowser(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (browserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (browserName.equals("edge"))
		{
			driver=new EdgeDriver();
		}

	}

	public void enterURL(String url)
	{
		/*if(url.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
		{
			System.out.println("url is correct");
		}*/
		driver.get(url);

	}

	public void enterData(String locatorType,String Value,String data)
	{
		WebElement element=null;

		if(locatorType.equals("id"))
		{
			element=driver.findElement(By.id(Value));
		}
		else if(locatorType.equals("name"))
		{
			element=driver.findElement(By.name(Value));	
		}
		else if (locatorType.equals("className")) 
		{
			element=driver.findElement(By.className(Value));	
		}
		else if (locatorType.equals("xpath")) 

		{
			element=driver.findElement(By.xpath(Value));
		}
		else if(locatorType.equals("linkText"))
		{
			element=driver.findElement(By.linkText(Value));
		}
		else if(locatorType.equals("particalLinkText"))
		{
			element=driver.findElement(By.partialLinkText(Value));

		}
		else if (locatorType.equals("tagName")) 
		{
			element=driver.findElement(By.tagName(Value));	
		}
		else if (locatorType.equals("cssSelector")) 
		{
			element=driver.findElement(By.cssSelector(Value));	
		}
		element.sendKeys(data);

	}


	public void clickOnElement(String locatorType,String LocatorValue)
	{

		if(locatorType.equals("id"))
		{
			driver.findElement(By.id(LocatorValue)).click();
		}
		else if(locatorType.equals("name"))
		{
			driver.findElement(By.name(LocatorValue)).click();	
		}
		else if (locatorType.equals("className")) 
		{
			driver.findElement(By.className(LocatorValue)).click();
		}
		else if (locatorType.equals("xpath")) 
		{
			driver.findElement(By.xpath(LocatorValue)).click();
		}
		else if(locatorType.equals("linkText"))
		{
			driver.findElement(By.linkText(LocatorValue)).click();
		}
		else if(locatorType.equals("particalLinkText"))
		{
			driver.findElement(By.partialLinkText(LocatorValue)).click();
		}
		else if (locatorType.equals("tagName")) 
		{
			driver.findElement(By.tagName(LocatorValue)).click();	
		}
		else if (locatorType.equals("cssSelector")) 
		{
			driver.findElement(By.cssSelector(LocatorValue)).click();	

		}


	}

}
