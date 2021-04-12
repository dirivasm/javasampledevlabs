package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	
	WebDriver driver;
	By adminTab = By.cssSelector("#menu_admin_viewAdminModule");
	By adminJob = By.cssSelector("#menu_admin_Job");
	By adminJobTitle = By.cssSelector("#menu_admin_viewJobTitleList");
	By adminJobPayGrades = By.cssSelector("#menu_admin_viewPayGrades");
	By directory = By.cssSelector("#menu_directory_viewDirectory");
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void moveToJobTitle() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(adminTab))
		.moveToElement(driver.findElement(adminJob))
		.moveToElement(driver.findElement(adminJobTitle)).build().perform();
		
		act.click().perform();
	}
	
	public void moveToJobPayGrades() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(adminTab))
		.moveToElement(driver.findElement(adminJob))
		.moveToElement(driver.findElement(adminJobPayGrades)).build().perform();
		
		act.click().perform();
	}
	
	public void clickDirectory() {
		driver.findElement(directory).click();
	}
	


}
