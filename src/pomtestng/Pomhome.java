package pomtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomhome{
	

	@FindBy(xpath="(//div [.='Switch to actiPLANS'])[1]")
	private WebElement switchtoactiplanLink;
	
	@FindBy(xpath="//div[.='Time-Track']")
	private WebElement Timetrackbutton;
	
	
	@FindBy(xpath="//a[@class='content selected tasks']")
	private WebElement Taskbutton;
	
	@FindBy(xpath="//a[@class='content reports']")
	private WebElement Reportbutton;
	
	@FindBy(xpath="//a[@class='content users']")
	private WebElement usersbutton;
	
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[1]")
	private WebElement firstbutton;
	
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
	private WebElement secondbutton;
	
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[3]")
	private WebElement thirdbutton;
	
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[4]")
	private WebElement fourthbutton;
	
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[5]")
	private WebElement fifthbutton;
	
	@FindBy(id="logoutLink")
	private WebElement logoutlink;
	
	
	public Pomhome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void acthomeMethod()
	{
		switchtoactiplanLink.click();
	}
	
	public void acthomeMethod1()
	{
		Timetrackbutton.click();
	}
	public void acthomeMethod2()
	{
		Taskbutton.click();
		
	}
	
	public void acthomeMethod3()
	{
		Reportbutton.click();
	}
	
	public void acthomeMethod4()
	{
		firstbutton.click();
	}
	
	public void acthomeMethod5()
	{
		secondbutton.click();
	}
	public void acthomeMethod6()
	{
		thirdbutton.click();
	}
	
	public void acthomeMethod7()
	{
		fourthbutton.click();
	}
	
	public void acthomeMethod8()
	{
		fifthbutton.click();
	}


	


}
