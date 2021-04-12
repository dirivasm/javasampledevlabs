package stepdefinition;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginHRM_StepDef {
	
	private WebDriver driver;
	
	@Before
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Given("^I navigate to \"([^\"]*)\"$")
	public void i_navigate_to(String url) throws Throwable {
		driver.get(url);
	}

	@When("^I type username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_type_username_and_password(String username, String password) throws Throwable {
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys(username);
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys(password);
	}

	@When("^Click login button$")
	public void click_login_button() throws Throwable {
		driver.findElement(By.cssSelector("input[name='Submit']")).click();
	}

	@Then("^I verify the \"([^\"]*)\" in step$")
	public void i_verify_the_in_step(String expectedResult) throws Throwable {
		String actualResult;
		try {
			actualResult = driver.findElement(By.cssSelector("#spanMessage")).getText();
		} catch (Exception e) {
			actualResult = driver.getCurrentUrl();
		}
		assertEquals(actualResult,expectedResult);
	}
	
	@After
	public void tear() {
		driver.close();
	}
}
