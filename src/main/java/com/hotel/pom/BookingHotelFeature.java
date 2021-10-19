package com.hotel.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingHotelFeature {

	public static WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement First_Name;
	
	@FindBy(id = "last_name")
	private WebElement Last_Name;
	
	@FindBy(id = "address")
	private WebElement Address;
	
	@FindBy(id = "cc_num")
	private WebElement cc_Num;
	
	@FindBy(id = "cc_type")
	private WebElement cc_Type;
	
	@FindBy(id = "cc_exp_month")
	private WebElement cc_Exp_Month;
	
	@FindBy(id = "cc_exp_year")
	private WebElement cc_Exp_Year;
	
	@FindBy(id = "cc_cvv")
	private WebElement cc_Cvv;
	
	@FindBy(id = "book_now")
	private WebElement Book_Now;
	

	public BookingHotelFeature(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
		
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirst_Name() {
		return First_Name;
	}

	public WebElement getLast_Name() {
		return Last_Name;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCc_Num() {
		return cc_Num;
	}

	public WebElement getCc_Type() {
		return cc_Type;
	}

	public WebElement getCc_Exp_Month() {
		return cc_Exp_Month;
	}

	public WebElement getCc_Exp_Year() {
		return cc_Exp_Year;
	}

	public WebElement getCc_Cvv() {
		return cc_Cvv;
	}

	public WebElement getBook_Now() {
		return Book_Now;
	}

	
	
	
}
