package selenium.session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		driver.findElement(By.id("txtUsername"));
		driver.findElement(By.name("txtUsername"));
		
		driver.findElement(By.xpath("//input[@id='txtUsername']"));
		driver.findElement(By.cssSelector("#txtUsername"));
		
		driver.findElement(By.linkText("Forgot your password?"));
		driver.findElement(By.partialLinkText("Forgot"));
		
		driver.findElement(By.tagName("a"));
		driver.findElement(By.className("form-hint"));
		
		}

}
