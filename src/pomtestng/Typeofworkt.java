package pomtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Typeofworkt {
	
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
	private WebElement secondbutton;

	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement Typeofwork;
	
	//@FindBy(xpath="//div[.='Create Customer']")
//	private WebElement createTypeofwork;
	
	@FindBy(xpath="//span[.='Create Type of Work']")
       private WebElement createTypeofwork;

	@FindBy(id="name")
	private WebElement name;
	
	@FindBy(xpath="//select[@name='active']")
	private WebElement active;
	
	
	@FindBy(id="billingRate_input")
	private WebElement billingrate;
	
	@FindBy(xpath="//input[@value='   Create Type of Work   ']")
	private WebElement createtypeofwork;


	
	public Typeofworkt(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void createtypeofworkmethod()
	{
		secondbutton.click();
		Typeofwork.click();
		createTypeofwork.click();
		name.sendKeys("janani");
		billingrate.sendKeys("55");
		//createTypeofwork.click();

		createtypeofwork.click();
		
	}



}
