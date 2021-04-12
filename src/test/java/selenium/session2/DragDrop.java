package selenium.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragDrop {
	

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://devlabs-860f0.web.app/aui");
	
		Actions act = new Actions(driver);
		Thread.sleep(6000);
		act.dragAndDrop(driver.findElement(By.xpath("//*[@id='draggable']/p")), driver.findElement(By.xpath("//*[@id='droppable']"))).build().perform();
		
		
		}

}
