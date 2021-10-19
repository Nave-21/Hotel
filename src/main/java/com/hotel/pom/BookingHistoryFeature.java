package com.hotel.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingHistoryFeature {
	public static WebDriver driver;
	
	@FindBy(id = "my_itinerary")
	private WebElement My_itinerary;

	public BookingHistoryFeature(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2,this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getMy_itinerary() {
		return My_itinerary;
	}
	


}
