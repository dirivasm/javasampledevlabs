package pageobjectmodel;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DirectoryExercise {
	
	private WebDriver driver;
	private HomePage home;
	private LoginPage login;
	private DirectoryPage directory;
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
	
	
	@Test(dataProvider = "dp", dataProviderClass = DirectoryDataProvider.class)
	public void testDirectory(String name, String jobTitle) {
		System.out.println("=================== Test Start ===================");
		driver.get(url);
		login = new LoginPage(driver);
		login.setUsername(user);
		login.setPassword(pass);
		login.clickLoginButton();
		
		home = new HomePage(driver);
		home.clickDirectory();
		
		directory = new DirectoryPage(driver);
		
		if(!name.isEmpty()) {
			directory.searchByName(name);
			directory.clickSearchButton();
			System.out.println("--------------------");
			System.out.println("Details: \n"+ directory.getResultInfo().get(0));
			
			directory.clickResetButton();
		}
		
		if(!jobTitle.isEmpty()){
			directory.searchByJobTitle(jobTitle);
			directory.clickSearchButton();
			for(HashMap<String,String> s : directory.getResultInfo()) {
				System.out.println("--------------------");
				System.out.println("Details: \n"+ s);
			}
		}
		System.out.println("=================== Test End ===================");
	}

	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
}
