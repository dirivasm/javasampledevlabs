package testng;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExerciseLogin {
	
	private WebDriver driver;
	private String user = "Admin";
	private String pass = "admin123";
	private String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test(dataProvider = "dp")
	public void loginTest(String username, String password, String expectedResult) {
		driver.get(url);
		login(username,password);
		
		String actualResult;
		if(username.equals("invalid") || password.equals("invalid") || username.isEmpty() || password.isEmpty()) 
			actualResult = driver.findElement(By.cssSelector("#spanMessage")).getText();
		else
			actualResult = driver.getCurrentUrl();
			
		assertEquals(actualResult,expectedResult);
		
	}

	@DataProvider
	public Object[][] dp(){
		return new Object[][]{
					{user, pass, "https://opensource-demo.orangehrmlive.com/index.php/dashboard"},
					{"invalid", pass, "Invalid credentials"},
					{user, "invalid", "Invalid credentials"},
					{"invalid", "invalid", "Invalid credentials"},
					{"", pass, "Username cannot be empty"},
					{user, "", "Password cannot be empty"},
				};
	}
	
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
	
	private void login(String username, String password) {
		System.out.println("Login as username: "+username+ " with pass: "+password);
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys(username);
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys(password);
		driver.findElement(By.cssSelector("input[name='Submit']")).click();
		
	}

}
