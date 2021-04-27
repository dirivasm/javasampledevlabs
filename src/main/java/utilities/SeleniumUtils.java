package utilities;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static List<WebElement> wElement;
	
	public static void openApplication(String browser, String mainUrl) {
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "src/main/resources/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.get(mainUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public static WebElement getWebElementByLocator(String locator) {
		
		String[] arr = locator.split("=",2);
		String locatorKey = arr[0];
		String locatorValue = arr[1];
		System.out.println("Looking for element with locator KEY: "+locatorKey);
		System.out.println("Looking for element with value: "+ locatorValue);
		WebElement element;
		wait = new WebDriverWait(driver, 10);
		
		switch (locatorKey) {
		case "id": {
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorValue)));
		break;
		}
		case "xpath": {
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorValue)));
		break;
		}
		case "css": {
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locatorValue)));
		break;
		}
		case "name": {
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorValue)));
		break;
		}
		case "class": {
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locatorValue)));
		break;
		}
		case "linkText": {
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(locatorValue)));
		break;
		}
		case "partialLinkText": {
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(locatorValue)));
		break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + locatorKey);
		}
		return element;
		
	}
	
	public static List<WebElement> getWebElementsByLocator(String locator){
		String[] arr = locator.split("=",2);
		String locatorKey = arr[0];
		String locatorValue = arr[1];
		System.out.println("Looking for element with locator KEY: "+locatorKey);
		System.out.println("Looking for element with value: "+ locatorValue);
		List<WebElement> element;
		wait = new WebDriverWait(driver, 10);
		
		switch (locatorKey) {
		case "id": {
			element = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(locatorValue)));
		break;
		}
		case "xpath": {
			element = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(locatorValue)));
		break;
		}
		case "css": {
			element = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(locatorValue)));
		break;
		}
		case "name": {
			element = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name(locatorValue)));
		break;
		}
		case "class": {
			element = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className(locatorValue)));
		break;
		}
		case "linkText": {
			element = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText(locatorValue)));
		break;
		}
		case "partialLinkText": {
			element = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.partialLinkText(locatorValue)));
		break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + locatorKey);
		}
		return element;
	}
	
	public static void typeOn(String locator, String value) {
		System.out.println("Type method...");
		getWebElementByLocator(locator).sendKeys(value);
		
	}
	
	public static void clickOn(String locator) {
		System.out.println("Type method...");
		getWebElementByLocator(locator).click();
		
	}
	
	public static void selectFromDropdown(String locator, String selectBy, String value) {
		
		Select select = new Select(getWebElementByLocator(locator));
		
		if(selectBy.equals("index")) {
			select.selectByIndex(Integer.parseInt(value));
		}else if(selectBy.equals("value")) {
			select.selectByValue(value);
		}
		else if(selectBy.equals("visible text")) {
			select.selectByVisibleText(value);
		}
	}
	
	public static void deselectFromDropdown(String locator, String deselectBy, String value) {
		
		Select select = new Select(getWebElementByLocator(locator));
		
		if(deselectBy.equals("index")) {
			select.deselectByIndex(Integer.parseInt(value));
		}else if(deselectBy.equals("value")) {
			select.deselectByValue(value);
		}
		else if(deselectBy.equals("visible text")) {
			select.deselectByVisibleText(value);
		}
	}
	
	public static void mouseHover(String locator) {
		
		Actions act = new Actions(driver);
		act.moveToElement(getWebElementByLocator(locator)).build().perform();
		
	}
	
	public static void click(String locator) {
		
		Actions act = new Actions(driver);
		act.click(getWebElementByLocator(locator)).build().perform();
		
	}
	
	public static void doubleClick(String locator) {
		
		Actions act = new Actions(driver);
		act.doubleClick(getWebElementByLocator(locator)).build().perform();
		
	}
	
	public static void contextClick(String locator) {
		
		Actions act = new Actions(driver);
		act.contextClick(getWebElementByLocator(locator)).build().perform();
		
	}
	
	public static void dragAndDrop(String sourceLocator, String targetLocator) {
		
		WebElement source = getWebElementByLocator(sourceLocator);
		WebElement target = getWebElementByLocator(targetLocator);
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source,target).build().perform();
		
	}
	
	public static WebElement getTableCellValue(String tableLocator,String columnName,String rowId) {
		
		String colLocator = "/thead/tr/th";
		String rowLocator = "/tbody/tr";
				
		List<WebElement> col = getWebElementsByLocator(tableLocator+colLocator);
		System.out.println("COLS: "+col.size());
		
		List<WebElement> row =  getWebElementsByLocator(tableLocator+rowLocator);
		System.out.println("ROWS: "+row.size());
		
		int colIndex = col.stream().map(s -> s.getText()).collect(Collectors.toList()).indexOf(columnName);
		int rowIndex = row.stream().map(s -> s.getText()).collect(Collectors.toList()).indexOf(rowId);
		
		WebElement cell = getWebElementByLocator(tableLocator+"/tbody/tr["+rowIndex+"]/td["+colIndex+"]");
	
		return cell;
	}
}
