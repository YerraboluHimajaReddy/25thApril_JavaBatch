package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Methods.HomePageMethods;
import Methods.LoginPageMethods;
import Methods.SignOutPageMethods;
import Pages.HomePage;
import Pages.SignOutPage;
import TestNg.DriverExtensions;

public class LoginAndLogout extends DriverExtensions {
	
	LoginPageMethods lpm;
	
	HomePage hp;
	
	SignOutPage sp;
	

	@BeforeSuite	
	public void launch() {		
		
		launchBrowser("chrome");
		
		lpm=new LoginPageMethods(driver);
		
		hp=PageFactory.initElements(driver, HomePage.class);

		sp=PageFactory.initElements(driver, SignOutPage.class);

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		System.out.println(driver.getTitle());

	}
	
	@Test(priority = 1)
	public void loginToApplication() {
		
		lpm.enterUsername();
		
		lpm.enterPassword();
		
		lpm.clickLogin();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());
	}
	
	@Test(priority = 2)
	public void clickWelcomePaul() {	
		
		hp.clickWelcomePaul();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}	
	
	
	@Test(priority = 3)
	public void clickLogout() {	
		
		sp.clickLogout();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}	
	
	@AfterSuite
	public void closeBrowser() {
		
		driver.close();
	}


}
