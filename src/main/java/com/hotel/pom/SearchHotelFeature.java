package com.hotel.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelFeature {
	public static WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement Location;
	
	@FindBy(id = "hotels")
	private WebElement Hotels;
	
	@FindBy(id = "room_type")
	private WebElement Room_Type;
	
	@FindBy(id = "room_nos")
	private WebElement Room_Nos;
	

	@FindBy(id = "datepick_in")
	private WebElement Datepick_In;
	
	@FindBy(id = "datepick_out")
	private WebElement Datepick_Out;
	
	@FindBy(id = "adult_room")
	private WebElement Adult_Room;

	@FindBy(id = "child_room")
	private WebElement Child_Room;
	
	@FindBy(id = "Submit")
	private WebElement Submit;
	
	

	public SearchHotelFeature(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2,this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoom_Type() {
		return Room_Type;
	}
	
	public WebElement getRoom_Nos() {
		return Room_Nos;
	}

	public WebElement getDatepick_In() {
		return Datepick_In;
	}

	public WebElement getDatepick_Out() {
		return Datepick_Out;
	}

	public WebElement getAdult_Room() {
		return Adult_Room;
	}

	public WebElement getChild_Room() {
		return Child_Room;
	}

	public WebElement getSubmit() {
		return Submit;
	}
}
