package Screenshots;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import TestNg.DriverExtensions;

public class ScreenshotExample1  extends DriverExtensions{
	
	File screenshotFile;
	
	@BeforeSuite	
	public void launch() {		
		
		
		launchBrowser("chrome");
		
		screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		System.out.println(driver.getTitle());

	}
	
	@Test
	public void login() {
		
	}
	
	@AfterSuite
	public void closeBrowser() {
		
		driver.close();
	}
}
