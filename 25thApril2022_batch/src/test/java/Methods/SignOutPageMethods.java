package Methods;

import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignOutPage;

public class SignOutPageMethods {

	WebDriver driver;

	SignOutPage sp = new SignOutPage(driver);

	public SignOutPageMethods(WebDriver driver) {

		this.driver = driver;
	}

	public void clickabout() {

		sp.about.click();
	}

	public void clickSupport() {

		sp.support.click();
	}

	public void clickLogout() {

		sp.logout.click();
	}
}
