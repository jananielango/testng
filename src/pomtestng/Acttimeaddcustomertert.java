package pomtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acttimeaddcustomertert {
	
	
	@FindBy(id="container_tasks")
	private WebElement Tasks;


	@FindBy(xpath="//div[.='Add New']")
	private WebElement Addnewbutton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement Newcustomer;
	
	@FindBy(xpath="(//input[@placeholder=\"Enter Customer Name\"])[2]")
	private WebElement Entercustomername;
	
	
	@FindBy(xpath="//textarea[@placeholder=\"Enter Customer Description\"]")
	private WebElement Description;

	
	@FindBy(xpath="((//div[@class='searchInputPlaceholder'])[15]")
	private WebElement copyfromexistingcustomer;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createcustomer;

	
	
	@FindBy(xpath="((//div[.='Big Bang Company'])[2]")
	private WebElement bigbangcomanydropdown;

	
	@FindBy(xpath="((//div[.='Galaxy Corporation'])[2]")
	private WebElement GalaxyCorporation;
	
	
	@FindBy(xpath="((//div[.='Our company'])[2]")
	private WebElement Ourcompany;
	
	@FindBy(xpath="(//div[.='Tamil Selvi']")
	private WebElement tamilselvi;
	
	@FindBy(xpath="(//div[@class='components_button withPlusIcon']")
	private WebElement createcustomerwithplusbutton;
	
	
	@FindBy(xpath="(//div[.='+ New Project']")
	private WebElement NewProject;


	@FindBy(xpath="(//div[.='+ New Tasks']")
	private WebElement  NewTasks;
	
	@FindBy(xpath="(//div[.='Import Tasks from CSV']")
	private WebElement ImportTasksfromCSV;

	
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")
	private WebElement starttypeTextfield;
	
	@FindBy(xpath="(//span[.='Customer'])[1]")
	private WebElement CustomerTitle;
	
	@FindBy(id="ext-gen10")
	private WebElement AlltheprojectsCustomer ;
	
	@FindBy(xpath="(//div[.='mohan8589'])[1]")
	private WebElement ourcompanymohan;
	
	@FindBy(xpath="(//div[.='Pranab'])[1]")
	private WebElement pranb;
	
	@FindBy(xpath="(//div[.='Big Bang Company'])[1]")
	private WebElement bigbangcompany;
	
	@FindBy(xpath="//div[.='Flight operations']")
	private WebElement Flightoperation;
	
	
	@FindBy(xpath="//div[.='Spaceship building']")
	private WebElement spaceshipbuilding;
	
	@FindBy(xpath="//div[.='Spaceship testing']")
	private WebElement spaceshiptesting;

	
	@FindBy(xpath="//div[.='Galaxy Corporation']")
	private WebElement Galaxycorporation;
	
	@FindBy(xpath="//div[.='Android prototyping']")
	private WebElement Androidprototyping;
	
	@FindBy(xpath="//div[.='Android testing']")
	private WebElement Androidtesting;


	
	@FindBy(xpath="//div[.='Joda Consulting Inc']")
	private WebElement jodaconsultingINc;
	
	@FindBy(xpath="//div[.='Lightsaber Upgrade']")
	private WebElement LightsaberUpgrade;

	
	@FindBy(xpath="//div[.='Our company']")
	private WebElement ourcompany;
	
	@FindBy(xpath="//div[.='Accounting']")
	private WebElement Accounting;
	
	@FindBy(xpath="//div[.='Management']")
	private WebElement Management;
	
	@FindBy(xpath="//div[.='Recruiting & HR']")
	private WebElement RecruitingHR;
	
	@FindBy(xpath="//div[.='Sales']")
	private WebElement Sales;
	
	@FindBy(xpath="//div[.='Training']")
	private WebElement Training;
	
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[2]")
	private WebElement starttypeTextfield1;
	
	@FindBy(xpath="(//div[.='janani']/../..//div[@class='editButton'])[1]")
	private WebElement settingbutton;
	
	@FindBy(xpath="(//div[@class='actionButton'])[7]")
	private WebElement action;
	
	@FindBy(xpath="(//div[.='Delete'])[2]")
	private WebElement delete;
	
	@FindBy(xpath="//span[.='Delete permanently']")
	private WebElement deletepermanently;





	public Acttimeaddcustomertert(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Taskmethod()
	
	{
		
		Tasks.click();

	}
	
	public void addnewbuttonmethod()
	
	{
		
	Addnewbutton.click();
	
	}
	
	public void newcustomer()
	
	{

	Newcustomer.click();
	
	}

	public void createnewcustomermethod()
	
	{
		Entercustomername.sendKeys("janani");
		Description.sendKeys("Teamlead");
		
		
	}

	public void copyfromexistingcustomermethod()

		{

		copyfromexistingcustomer.click();
		}
	public void bigbangmethod()


		{

		bigbangcomanydropdown.click();
		}
	public void createcustomermethod()

		{

		createcustomer.click();
		
		}
	
	
	public void settingbutton()
	{
		
		settingbutton.click();

		
	}
	public void action()
	{
	 action.click();

	}

	public void delete()
	{
		delete.click();
	}

	public void deletepermanently()
	{
		deletepermanently.click();
		
	}

	

	

	}
	
	
	



