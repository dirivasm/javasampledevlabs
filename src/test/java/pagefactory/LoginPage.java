package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(css = "#txtUsername")
	WebElement userName;
	
	@FindBy(css = "#txtPassword")
	WebElement password;
	
	@FindBy(css = "#btnLogin")
	WebElement loginBtn;
	
	@FindBy(linkText = "Forgot your password?")
	WebElement forgotPsswLink;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String user) {
		userName.sendKeys(user);
	}
	
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickLoginButton() {
		loginBtn.click();
	}
	

}
