package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.NavBarPage;
import pageobjectmodel.SelectablePage;

public class Jquery_StepDef {
	
	private WebDriver driver;
	
	@Before
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Given("^I go to \"([^\"]*)\"$")
	public void i_go_to(String url) throws Throwable {
		driver.get(url);
	}

	@When("^\"([^\"]*)\" is selected$")
	public void is_selected(String navbarOption) throws Throwable {
		NavBarPage nvp = new NavBarPage(driver);
		nvp.clickOnOption(navbarOption);
		Thread.sleep(2000);
	}

	@Then("^select \"([^\"]*)\"$")
	public void select(String items) throws Throwable {
		SelectablePage sp = new SelectablePage(driver);
		sp.clickOnItems(items);
		Thread.sleep(2000);
	}


	@After
	public void tear() {
		driver.close();
	}
}
