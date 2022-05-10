package testingpomtestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomtestng.Typeofworkt;
import pomtestng.acttimepom;

public class Typeofworktest {
	
	@Test(enabled=false)
	
	public void Typeofwork()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
	//	acttimepom login=new acttimepom(driver);
		//login.actloginMethod();
		acttimepom login= new acttimepom(driver);
		login.actloginMethod();
		Typeofworkt work= new Typeofworkt(driver);
		work.createtypeofworkmethod();

	}

}
