package pomtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class acttimepom {
@FindBy(id="username")
private WebElement usernameTextfield;

@FindBy(xpath="//input[@type='password']")
private WebElement passwordTextfield;

@FindBy(id="keepLoggedInCheckBox")
private WebElement keepmeloggedincheckbox;

@FindBy(id="loginButton")
private WebElement loginButton;

@FindBy(xpath="//a[.='Forgot your password?']")
private WebElement forgotyourpasswordLink;

@FindBy(xpath="//a[.='actiTIME Inc.']")
private WebElement acttimeincLink;

public acttimepom(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}



public void actloginMethod() {
			
		   usernameTextfield.sendKeys("admin");
		   passwordTextfield.sendKeys("manager");
		   keepmeloggedincheckbox.click();
		   loginButton.click();

		}
		public void forgotyourpwdMethod()
		{
			forgotyourpasswordLink.click();
			
		}

	public void acttimeIncmethod()
	{
		acttimeincLink.click();
	}








}
