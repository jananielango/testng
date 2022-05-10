package testingpomtestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomtestng.Pomhome;
import pomtestng.acttimepom;

public class pomclasstest {

	@Test(enabled=false)
	public void clickcalender (){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		acttimepom login=new acttimepom(driver);
		login.actloginMethod();
		Pomhome home=new Pomhome(driver);
		home.acthomeMethod4();
		
	
	}

}
