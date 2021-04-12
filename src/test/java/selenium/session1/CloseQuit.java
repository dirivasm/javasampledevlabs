package selenium.session1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuit {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		
		System.out.println("Title is: "+driver.getTitle());
		System.out.println("Current URL: "+driver.getCurrentUrl());
		
		//Navigate Methods
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();	}

}
