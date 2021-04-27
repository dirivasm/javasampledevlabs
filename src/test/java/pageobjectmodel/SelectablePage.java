package pageobjectmodel;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectablePage {

	WebDriver driver;
	private By frame = By.cssSelector(".demo-frame");
	private String item = "//li[contains(text(),'Item %s')]";

	public SelectablePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnItems(String items) {
		WebElement framewe = driver.findElement(frame);
		driver.switchTo().frame(framewe);
		
		List<String> it = Arrays.asList(items.split(","));
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).build().perform();

		for (String str : it) {
			driver.findElement(By.xpath(String.format(item, str))).click();
		}
		
		act.keyUp(Keys.CONTROL).build().perform();
		
	}

	
	
	
	
}
