package TestNg;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNg_Enable_way2 extends DriverExtensions {
	
	@BeforeSuite	
	public void launch() {		
		
		launchBrowser("edge");

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void maximizeBrowser() {
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}
	
	@Test
	public void EnterField2() {
				
		driver.findElement(By.id("field2")).sendKeys("Yerrabolu Himaja");
	}
	
	
	@Test
	public void EnterField1() {
		
		driver.findElement(By.id("field1")).clear();
		
		driver.findElement(By.id("field1")).sendKeys("Himaja Yerrabolu");
	}
	
	
	
	@AfterSuite
	public void closeBrowser() {
		
		driver.close();
	}

}
