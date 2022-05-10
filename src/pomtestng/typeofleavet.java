package pomtestng;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class typeofleavet {
	
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
	private WebElement secondbutton;
	
	@FindBy(id="ext-gen7")
	private WebElement createleave;


	@FindBy(xpath="//a[.='Leave Types']")
	private WebElement Typeofleave;
	
	@FindBy(id="leaveTypeLightBox_nameField")
	private WebElement leavetypeLightbox;

	
	@FindBy(id="processLeaveTimeCheckbox_createPopup")
	private WebElement processleavetimecheckbox;
	
	@FindBy(xpath="(//div[@class='leaveTypeIconSelector'])[6]")
	private WebElement leavetypeofselector;


	@FindBy(xpath="(//span[.='Create Leave Type'])[2]")
	private WebElement createTypeofleave;
	
	@FindBy(xpath="(//td[@class=\"leaveTypeDeleteCell last\"])[6]")
	private WebElement Delecteleave;
	
   public WebDriver driver;
	
	
	public typeofleavet(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createleavemethod()
	{
		secondbutton.click();
		//createleave.click();
		Typeofleave.click();
		createleave.click();
		leavetypeLightbox.sendKeys("sickleave");
		processleavetimecheckbox.click();
		createTypeofleave.click();
		Delecteleave.click();
		Alert alt= driver.switchTo().alert();
		alt.accept();
		
		
	}



	

}



