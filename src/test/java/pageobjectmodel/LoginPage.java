package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	By userName = By.cssSelector("#txtUsername");
	By password = By.cssSelector("#txtPassword");
	By loginBtn = By.cssSelector("#btnLogin");
	By forgotPsswLink = By.linkText("Forgot your password?");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUsername(String usr) {
		driver.findElement(userName).sendKeys(usr);
	}
	
	public void setPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLoginButton() {
		driver.findElement(loginBtn).click();
	}
	
	public void clickForgotPasswd() {
		driver.findElement(forgotPsswLink).click();
	}
	

}
