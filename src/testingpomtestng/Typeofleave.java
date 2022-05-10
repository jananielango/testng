package testingpomtestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomtestng.acttimepom;
import pomtestng.typeofleavet;

public class Typeofleave {
	
	
@Test(enabled=false)

public void typeofleavem()
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	acttimepom login=new acttimepom(driver);
	login.actloginMethod();
	typeofleavet leave=new typeofleavet(driver);
	leave.createleavemethod();

	
}

	
	
}
