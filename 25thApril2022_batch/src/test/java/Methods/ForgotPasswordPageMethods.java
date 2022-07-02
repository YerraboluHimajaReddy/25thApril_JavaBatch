package Methods;

import org.openqa.selenium.WebDriver;

import Pages.ForgotPasswordPage;

public class ForgotPasswordPageMethods {

	WebDriver driver;

	ForgotPasswordPage fpp = new ForgotPasswordPage(driver);

	public ForgotPasswordPageMethods(WebDriver driver) {

		this.driver = driver;
	}

	public void enterOrangeHRMUsername() {

		driver.findElement(fpp.orangeHRMUsername_textbox).sendKeys("Himaja");
	}

	public void clickResetPassword() {

		driver.findElement(fpp.resetPassword_Button).click();
	}

	public void clickCancel_Button() {

		driver.findElement(fpp.cancel_Button).click();
	}
}
