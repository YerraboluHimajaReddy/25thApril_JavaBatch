package Listeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import Methods.LoginPageMethods;

public class TestNGListenersUsable extends TestNgListeners{
	
	public WebDriver driver;

	LoginPageMethods lpm;

	@Test
	public void launchOrangeHRM() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\himaj\\Desktop\\Selenium With Java\\Selenium\\Selenium\\25thApril2022\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		lpm = new LoginPageMethods(driver);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		lpm.enterUsername();
		lpm.enterPassword();
		
		WebElement login=driver.findElement(By.id("btnLogin"));	
		
		
		lpm.clickLogin();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void closeBrowser() {

		driver.close();
	}
	
	public void failure(ITestResult result)
	{
	 
		if(result.getTestName()=="launchOrangeHRM") {
			
			System.out.println("launchOrangeHRM");
	}
	}

}
