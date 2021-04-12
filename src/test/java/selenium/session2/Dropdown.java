package selenium.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://devlabs-860f0.web.app/dropdown");
	
		WebElement we = driver.findElement(By.xpath("//*[@id='Index']"));
		Select dpd = new Select(we);
		
		dpd.selectByIndex(1);

		
		WebElement we2 = driver.findElement(By.cssSelector("select[name='text']"));
		Select dpd2 = new Select(we2);
		dpd2.selectByValue("okok");
		
		
		}

}
