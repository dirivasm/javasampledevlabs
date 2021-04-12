package pageobjectmodel;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExercisePayGrades {
	
	private WebDriver driver;
	private HomePage homePage;
	private LoginPage loginPage;
	private GradePage gradePage;
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
	
	
	@Test()
	public void testGradePage() {
		
		loginPage = new LoginPage(driver);
		loginPage.setUsername(user);
		loginPage.setPassword(pass);
		loginPage.clickLoginButton();
		
		homePage = new HomePage(driver);
		homePage.moveToJobPayGrades();
		
		gradePage = new GradePage(driver);
		
		
	}


	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
}
