package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Methods.LoginPageMethods;
import TestNg.DriverExtensions;

public class Login extends DriverExtensions {
	
	LoginPageMethods lpm;
	
	@BeforeSuite	
	public void launch() {		
		
		launchBrowser("chrome");
		
		lpm=new LoginPageMethods(driver);

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		System.out.println(driver.getTitle());

	}
	
	@Test
	public void loginToApplication() {
		
		lpm.enterUsername();
		
		lpm.enterPassword();
		
		lpm.clickLogin();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());
	}
	
	@AfterSuite
	public void closeBrowser() {
		
		driver.close();
	}


}
