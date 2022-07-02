package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Assertions2 extends DriverExtensions {

	public static void main(String args[])

	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\himaj\\Desktop\\Selenium With Java\\Selenium\\Selenium\\25thApril2022\\chromedriver_win32 (1)\\chromedriver.exe");

	   WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println("title of the page is : " + driver.getTitle());

		String expectedTitle = "Himaja";

		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle, "Both values are not same ");

		System.out.println("Himaja");

		String expectedTitle1 = "OrangeHRM";

		String actualTitle1 = driver.getTitle();

		Assert.assertEquals(actualTitle1, expectedTitle1);

		driver.quit();
	}
}
