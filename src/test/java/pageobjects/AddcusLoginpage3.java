package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.GenaricMethod;

public class AddcusLoginpage3 
{
	
	public WebDriver driver;
	public GenaricMethod g1;

	
	public AddcusLoginpage3(WebDriver driverss) 
	{

		driver=driverss;
		PageFactory.initElements(driverss, this);

	}
	@FindBy(id="Email")
	WebElement enter_email;

	@FindBy(id="Password")
	WebElement enter_password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement click_button;

	@FindBy(xpath = "(//a[@class='nav-link'])[21]")
	WebElement cust_click;

	@FindBy(xpath = "//p[text()=' Customers']")
	WebElement addcust_click;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement add_button;

	@FindBy(xpath = "//input[@id='Email']")
	WebElement enter_emai;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement enter_pass;

	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement enter_firstname;

	@FindBy(xpath = "//input[@id='LastName']")
	WebElement enter_lastname;

	@FindBy(xpath = "//input[@id='Gender_Male']")
	WebElement male_buttonclick;

	@FindBy(xpath = "//input[@id='DateOfBirth']")
	WebElement enter_dateofbirth;

	@FindBy(xpath = "//input[@id='Company']")
	WebElement enter_company;

	@FindBy(xpath = "//input[@id='IsTaxExempt']")
	WebElement istax_click;

	@FindBy(xpath = "(//input[@role='listbox'])[1]")
	WebElement newletter_click;

	//@FindBy(xpath = "//li[text()='Your store name']")
	//WebElement store_name;
	
	@FindBy(xpath = "(//input[@class='k-input k-readonly'])[2]")
	WebElement customerNewroles;
	
//	@FindBy(xpath = "//span[text()='Registered']")
//	WebElement customer_roles;
	
	//@FindBy(xpath = "(//span[@title='delete'])[2]")
//	WebElement register_delete;

//	@FindBy(xpath = "//span[text()='Administrators']")
	//WebElement click_adminis;

	 
	@FindBy(xpath = "//select[@id='VendorId']")
	WebElement mangevendor_click;

	//@FindBy(xpath = "//option[text()='Vendor 1']")
	//WebElement vendor1_click;

	@FindBy(xpath = "//textarea[@id='AdminComment']")
	WebElement enter_admicommit;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement savebutton_click;


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
     public void clickbutton()
     {
    	 click_button.click();
     }
     
     public void clickcustomer()
     {
      cust_click.click();
      
     }
     public void addnewcustomer()
     {
    	 addcust_click.click();
    	 
     }
     
     public void addnewbutton()
     {
    	 
    	 add_button.click();
     }
     public void enternewemail(String nemail)
     {
    	 enter_emai.sendKeys(nemail);
     }
     public void enternewpass(String npass)
     {
    	 enter_pass.sendKeys(npass); 
     }
     public void enterfirstname(String nfname)
     {
    	 enter_firstname.sendKeys(nfname);
    	 
    }
     public void enterlastname(String elname)
     {
    	 enter_lastname.sendKeys(elname); 
     }
     public void clickmalebutton()
     {
    	 male_buttonclick.click(); 
     }
     public void enterdateofbirth(String dateofbi)
     {
    	 enter_dateofbirth.sendKeys(dateofbi);
    	 
     }
     public void entercompany(String comname)
     {
    	 enter_company.sendKeys(comname); 
    	 
     }
     public void istaxclick()
     {
    	 istax_click.click();
    	 
     }
     public void newsletter()
     {
    	// newletter_click.click();
    	 
     }
     public void storename()
     {
    	 Select select=new Select(newletter_click);
    	 select.selectByVisibleText("Your store name");
    	// store_name.click(); 
     }
     public void customerroles()
     {
    	
    	 customerNewroles.click();
    	 
    
    	 
     }
     
     
     public void adminis()
     {
    	 Select select=new Select(customerNewroles);
    	 select.selectByVisibleText("Administrators");
    	 
    	// customer_roles.click();
    	 
    	 
     }
     public void mangevendor() 
     {
    	 Select select=new Select(mangevendor_click);
    	// mangevendor_click.click();
    	 select.selectByVisibleText("Vendor 1");
    	 
     }
    // public void vendorclick()
    // {
    //	 vendor1_click.click(); 
    	 
     //}
     public void admincomment(String adcomment)
     {
    	 enter_admicommit.sendKeys(adcomment);
    	 
     }
     public void savebuttonclick()
     {
    	 savebutton_click.click();

	     
		System.out.println("Done");
    	 
     }
	
		
	}
	
		
	
     
     
     
     




