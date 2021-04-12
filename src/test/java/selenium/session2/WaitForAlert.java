package selenium.session2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlert {
	

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://devlabs-860f0.web.app/waitforalert");
	
		//Simple Alert
		driver.findElement(By.id("mye")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.alertIsPresent()).accept();
	
		
		}

}
