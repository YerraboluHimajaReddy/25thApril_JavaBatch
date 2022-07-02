package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgExample6 extends DriverExtensions {
	
	@BeforeSuite	
	public void launch() {		
		
		launchBrowser("edge");

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	
	}
	
	@BeforeMethod
	public void method1() {
		
		System.out.println("title of the page is : " + driver.getTitle());

	}
	
	@AfterMethod
	public void method2() {
		
		System.out.println("title of the page is : " + driver.getTitle());

	}
	
	@Test
	public void enterUserName() {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	
	@Test(dependsOnMethods = "enterUserName")
	public void enterPassword() {
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	
	@Test(dependsOnMethods = "enterPassword")
	public void clickLoginButton() {
		
		driver.findElement(By.id("btnLogin")).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	}

	@AfterSuite
	
	public void closeBrowser() {
		
		driver.quit();
	}
}
