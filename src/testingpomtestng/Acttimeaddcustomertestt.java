package testingpomtestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import pomtestng.Acttimeaddcustomertert;
import pomtestng.Pomhome;
import pomtestng.acttimepom;

@Test (enabled=true)
public class Acttimeaddcustomertestt {
	
	public void addcustomer() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	//acttimepom login=new acttimepom(driver);
	//login.actloginMethod();
	acttimepom login=new acttimepom(driver);
	login.actloginMethod();
	
	//Pomhome home=new Pomhome(driver);
	//home.acthomeMethod4();
	//Pomhome home=new Pomhome(driver);
	//home.acthomeMethod4();
	Thread.sleep(3000);
	Acttimeaddcustomertert addcustomer=new Acttimeaddcustomertert(driver);
	addcustomer.Taskmethod();
	addcustomer.addnewbuttonmethod();
	Thread.sleep(3000);
	addcustomer.newcustomer();
	Thread.sleep(3000);
	addcustomer.createnewcustomermethod();
	Thread.sleep(3000);
//	addcustomer.copyfromexistingcustomermethod();
	Thread.sleep(3000);
	//addcustomer.bigbangmethod();	
	Thread.sleep(3000);
	//addcustomer.copyfromexistingcustomermethod();
	//addcustomer.bigbangmethod();
	
	addcustomer.createcustomermethod();
	Thread.sleep(3000);
	addcustomer.settingbutton();
	Thread.sleep(3000);

	addcustomer.action();
	Thread.sleep(3000);

	addcustomer.delete();
	
	addcustomer.deletepermanently();
	
	
	
	}
	
	
	


}
