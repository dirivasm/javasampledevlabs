package selenium.session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		String user = "Admin";
		String pass = "admin123";
		
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys(user);
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys(pass);
		driver.findElement(By.cssSelector("input[name='Submit']")).click();
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
	
		}

}
