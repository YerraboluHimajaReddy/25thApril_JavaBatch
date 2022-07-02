package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Assertions extends DriverExtensions {
	
	@BeforeSuite	
	public void launch() {		
		
		launchBrowser("edge");

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println("title of the page is : " + driver.getTitle());
	
	}
	
	@Test(priority = 1)
	public void verifyTitle1() {
		
		String expectedTitle="Himaja";
		
		String actualTitle=driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		System.out.println("Himaja");
	}
	
	@Test(priority = 2)
	public void verifyTitle() {
		
		String expectedTitle="OrangeHRM";
		
		String actualTitle=driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterSuite
	public void closeBrowser() {
		
		driver.quit();
	}
}
