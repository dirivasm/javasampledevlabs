package selenium.session2;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TableHandling {
	

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://devlabs-860f0.web.app/table");
	
		int col = driver.findElements(By.xpath("//*[@id='table']/thead/tr/th")).size();
		System.out.println("COLS: "+col);
		
		int row = driver.findElements(By.xpath("//*[@id='table']/tbody/tr")).size();
		System.out.println("ROWS: "+row);
		
		for(int i=1; i<=row; i++) {
			
			for(int j=1; j<=col; j++) {
				String val = driver.findElement(By.xpath("//*[@id='table']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println("Rows: "+i+" Cols: "+j+" Val: "+val);
			}
			
		}
		
		}

}
