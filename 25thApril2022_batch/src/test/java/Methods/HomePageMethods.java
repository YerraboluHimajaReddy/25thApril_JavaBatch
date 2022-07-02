package Methods;

import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.LoginPage;

public class HomePageMethods {

	WebDriver driver;

	HomePage hp = new HomePage(driver);

	public HomePageMethods(WebDriver driver) {

		this.driver = driver;
	}
	
	public void clickWelcomePaul() {
		
		hp.welcomePaulLink.click();
	}
}
