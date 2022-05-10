package testingpomtestng;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import pomtestng.Acttimeaddcustomertert;
import pomtestng.Pomhome;
import pomtestng.acttimepom;

public class addcustomerpriority {
	
public WebDriver driver;
	@Test 

 
		
		public void addcustomer() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		//acttimepom login=new acttimepom(driver);
		//login.actloginMethod();
		acttimepom login=new acttimepom(driver);
		login.actloginMethod();
		}
		
		//Pomhome home=new Pomhome(driver);
		//home.acthomeMethod4();
		//Pomhome home=new Pomhome(driver);
		//home.acthomeMethod4();
		
		
		@Test(priority=1)
		public void Acttimeaddcustomertert() throws InterruptedException
		
		{
			Thread.sleep(3000);
		Acttimeaddcustomertert addcustomer=new Acttimeaddcustomertert(driver);
		addcustomer.Taskmethod();
		
		
		addcustomer.addnewbuttonmethod();
		Thread.sleep(3000);

		
		
		addcustomer.newcustomer();
		Thread.sleep(3000);

	
		addcustomer.createnewcustomermethod();
		Thread.sleep(3000);
	
//		addcustomer.copyfromexistingcustomermethod();
		//addcustomer.bigbangmethod();	

		//addcustomer.copyfromexistingcustomermethod();
		//addcustomer.bigbangmethod();
		
		
			addcustomer.createcustomermethod();


		}
		@Test(priority=2)
		
		
		public void Acttimeaddcustomertert1 () throws InterruptedException 
		{

		
		Acttimeaddcustomertert addcustomer1=new Acttimeaddcustomertert(driver);
		
		
		addcustomer1.settingbutton();
		Thread.sleep(3000);

		addcustomer1.action();
		Thread.sleep(3000);

		addcustomer1.delete();
		
		addcustomer1.deletepermanently();

		
		
		}

		
		}



