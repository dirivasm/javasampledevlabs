package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavBarPage {

	WebDriver driver;
	private By navBarContainer = By.cssSelector("#sidebar");
	private String option = "//a[contains(text(),'%s')]";
	
	public NavBarPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnOption(String op) {
		WebElement container = driver.findElement(navBarContainer);
		container.findElement(By.xpath(String.format(option,op))).click();
	}
	
	
	
	
}
