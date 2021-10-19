package com.hotel.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.hotel.pom.BookingHistoryFeature;
import com.hotel.pom.BookingHotelFeature;
import com.hotel.pom.LoginFeature;
import com.hotel.pom.SearchHotelFeature;
import com.hotel.pom.SelectHotelFeature;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	private LoginFeature log;
	private SearchHotelFeature sh;
	private SelectHotelFeature sel;
	private BookingHotelFeature bk;
	private BookingHistoryFeature bh;
	
	
	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}


	public LoginFeature getLog() {
		log = new LoginFeature(driver);
		return log;
	}
	
	public SearchHotelFeature getSh() {
		sh = new SearchHotelFeature(driver);
		return sh;
	}
	
	public SelectHotelFeature getSel() {
		sel = new SelectHotelFeature(driver);
		return sel;
	}
	
	public BookingHotelFeature getBk() {
		bk = new BookingHotelFeature(driver);
		return bk;
	}
	
	public BookingHistoryFeature getBh() {
		bh = new BookingHistoryFeature(driver);
		return bh;
	}

}


