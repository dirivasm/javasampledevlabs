package selenium.session1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.open('https://www.gmail.com')");
		js.executeScript("window.open('https://www.facebook.com')");
		
		String parentWindow = driver.getWindowHandle();
	
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		
		while (itr.hasNext()) {
			
			String child = itr.next();
			if(!parentWindow.equals(child)) {
				System.out.println("Current focus is: "+driver.switchTo().window(child).getTitle());
				driver.close();
			}
			
		}
		driver.switchTo().window(parentWindow);
		js.executeScript("window.open('https://www.facebook.com')");
		
		driver.quit();	
		
	}

}
