package com.hotel.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.hotel.baseclass.BaseClass2;
import com.hotel.configuration.File_Reader_Manager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/hotel/feature",glue="com/hotel/stepdefinition",
							tags = "@Login",
							plugin = {"pretty"}, monochrome = true)

public class TestRunner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Throwable {
		String browser = File_Reader_Manager.getInstance().getConfigReader().getBrowser();
		driver = BaseClass2.getBrowser(browser);
	}
	
	@AfterClass
	public static void quitBrowser() {
		driver = BaseClass2.browserQuit();

	}
}
