package com.hotel.baseclass;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass2 {
	public static WebDriver driver;
	public static WebDriver getBrowser(String browsername) {
		
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", 
						"C:\\Users\\User\\eclipse-workspace\\Hotel\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}
				else if (browsername.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver", 
							"C:\\Users\\User\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();					
				}	
				else {
					System.out.println("Invalid Browser");
				}
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return driver;
		}
	
	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
	}
	public static void implicitWait() {
		try {
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void threadSleep(int value) throws InterruptedException {
		Thread.sleep(value);
	}
	public static void explicitWait(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void sendInput(WebElement element, String value) {
		explicitWait(element);
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void clickOnElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void selectDropDown(WebElement element, String value, String option) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}else if (option.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
		}else if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));		
		}
	}
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}
	public static void navigateTo(String Url) {
		driver.navigate().to(Url);
	}
	public static void navigateBack() {
		driver.navigate().back();
	}
	public static void navigateForward() {
		driver.navigate().forward();
	}
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}	
	public static void alertAccept() {
		driver.switchTo().alert().accept();
	}
	public static void alertDismiss() {
		driver.switchTo().alert().dismiss();
	}
	public static void takeScreenshot(String path) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
	}
	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		
	}

	public static void browserClose() {		
			driver.close();		
		}
	public static WebDriver browserQuit() {		
		driver.quit();
		return driver;	
		
	}
	
	}



