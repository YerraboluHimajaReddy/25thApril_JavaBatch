package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Methods.ForgotPasswordPageMethods;
import Methods.LoginPageMethods;
import TestNg.DriverExtensions;

public class ForgotPassword extends DriverExtensions {
	
	LoginPageMethods lpm;
	
	ForgotPasswordPageMethods fpm;
	
	@BeforeSuite	
	public void launch() {		
		
		launchBrowser("chrome");
		
		lpm=new LoginPageMethods(driver);
		
		fpm=new ForgotPasswordPageMethods(driver);

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		System.out.println(driver.getTitle());

	}
	
	@Test(priority = 1)
	public void clickForgotPasswordLink() {
		
		lpm.clickForgotPassword();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());
	}
	
	@Test(priority = 2)
	public void enterDetails() {
		
		fpm.enterOrangeHRMUsername();
		
		fpm.clickCancel_Button();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());
	}
	
	@AfterSuite
	public void closeBrowser() {
		
		driver.close();
	}


}
