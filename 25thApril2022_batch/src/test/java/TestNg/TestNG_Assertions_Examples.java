package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Assertions_Examples extends DriverExtensions {
	
	@Test
	public void verifyTitle() {		
		
		Assert.assertTrue(true,"both are different");
	}
	
	@Test
	public void verifyTitle1() {
		
		
		Assert.assertFalse(true, "both are different");
	}
}
