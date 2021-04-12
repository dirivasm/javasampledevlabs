package selenium.session2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alerts {
	

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://devlabs-860f0.web.app/alert");
	
		//Simple Alert
		driver.findElement(By.id("12345rtf")).click();
		
		Alert al = driver.switchTo().alert();
		al.accept();
		
		
		
		}

}
