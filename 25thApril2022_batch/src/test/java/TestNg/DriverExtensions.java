package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverExtensions {
	
	public WebDriver driver;
	
	public void launchBrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\himaj\\Desktop\\Selenium With Java\\Selenium\\Selenium\\25thApril2022\\chromedriver_win32 (1)\\chromedriver.exe");

		    driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\himaj\\Desktop\\Selenium With Java\\Selenium\\edgedriver_win64 (3)\\msedgedriver.exe");

		    driver = new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("safari"))
		{
			System.setProperty("webdriver.safari.driver",
					"C:\\Users\\himaj\\Desktop\\Selenium With Java\\Selenium\\edgedriver_win64 (3)\\msedgedriver.exe");

		    driver = new EdgeDriver();
		}
		
	}

}
