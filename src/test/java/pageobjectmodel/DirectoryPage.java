package pageobjectmodel;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DirectoryPage {
	
	WebDriver driver;
	By name = By.cssSelector("#searchDirectory_emp_name_empName");
	By jobTitle = By.cssSelector("#searchDirectory_job_title");
	By searchBtn = By.cssSelector("#searchBtn");
	By resetBtn = By.cssSelector("#resetBtn");
	By resultTable = By.xpath("//*[@id='resultTable']/tbody/tr/td[2]/ul");
	
	public DirectoryPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickSearchButton() {
		driver.findElement(searchBtn).click();
	}
	
	public void searchByName(String n) {
		driver.findElement(name).sendKeys(n);
	}
	
	public void searchByJobTitle(String title) {
		WebElement select = driver.findElement(jobTitle);
		Select sel = new Select(select);
		sel.selectByVisibleText(title);
	}
	
	public void clickResetButton() {
		driver.findElement(resetBtn).click();
	}
	
	public List<HashMap<String,String>> getResultInfo() {
		return driver.findElements(resultTable)
				.stream()
				.map(we -> { 
					HashMap<String,String> map = new HashMap<String,String>();
					
					List<String> details = we.findElements(By.tagName("li")).stream().map(o -> o.getText()).collect(Collectors.toList());
					
					map.put("name", details.get(0));
					map.put("jobTitle", details.get(1));
					map.put("department", details.get(2));
					map.put("location", details.get(3));
					map.put("contactInfo", details.get(4));
					
					return map;
					})
				.collect(Collectors.toList());
		
	}
	
	



}
