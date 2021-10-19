package com.hotel.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelFeature {
	
	public static WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement RadioButton;
	
	@FindBy(id = "continue")
	private WebElement Continue;

	public SelectHotelFeature(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2,this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadioButton() {
		return RadioButton;
	}

	public WebElement getContinue() {
		return Continue;
	}

}
