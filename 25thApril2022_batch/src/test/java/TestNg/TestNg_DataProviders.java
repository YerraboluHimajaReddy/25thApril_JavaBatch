package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNg_DataProviders extends DriverExtensions {
	
	@BeforeSuite	
	public void launch() {		
		
		launchBrowser("chrome");

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println("title of the page is : " + driver.getTitle());
	
	}
	
	@DataProvider(name="loginData")
	public Object[][] data(){
		
		Object[][] userData=new Object[3][2];
		
		userData[0][0]="admin";
		
		userData[0][1]="adminData";

		userData[1][0]="Himaja";

		userData[1][1]="HimajaData";
		
		userData[2][0]="Yerrabolu";

		userData[2][1]="YerraboluData";
		
		return userData;
		
	}
	
	@Test(dataProvider = "loginData")
	public void enterCredentials(String username, String password) {
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);

	}
	@AfterSuite
	
	public void closeBrowser() {
		
		driver.quit();
	}
}
