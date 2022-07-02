package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public By username_textbox=By.id("txtUsername");
	
	public By password_textbox=By.id("txtPassword");

	public By login_Button=By.id("btnLogin");
	
	public By forgotPassword_Link=By.linkText("Forgot your password?");


	
}
