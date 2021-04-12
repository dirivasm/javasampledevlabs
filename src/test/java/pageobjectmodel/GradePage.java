package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class GradePage {
	
	WebDriver driver;
	By tableGrade = By.cssSelector("#resultTable");
	By tableGradeRow = By.xpath("//*[@id='resultTable']/tbody/tr");
	By tableGradeCol = By.xpath("//*[@id='resultTable']/thead/tr/th");
	
	
	public GradePage(WebDriver driver) {
		this.driver = driver;
	}
	

	


}
