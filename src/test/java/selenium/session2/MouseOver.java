package selenium.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		String user = "Admin";
		String pass = "admin123";
		
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys(user);
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys(pass);
		driver.findElement(By.cssSelector("input[name='Submit']")).click();
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.cssSelector("#menu_time_viewTimeModule")))
		.moveToElement(driver.findElement(By.cssSelector("#menu_attendance_Attendance")))
		.moveToElement(driver.findElement(By.cssSelector("#menu_attendance_configure"))).build().perform();
		
		act.click().perform();
		
		
		
	}

}
