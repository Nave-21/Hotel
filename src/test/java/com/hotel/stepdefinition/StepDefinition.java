package com.hotel.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.hotel.baseclass.BaseClass2;
import com.hotel.configuration.File_Reader_Manager;
import com.hotel.helper.PageObjectManager;
import com.hotel.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass2{
	
	public static WebDriver driver = TestRunner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	
	//Scenario 1
	@Given("User launch the application")
	public void user_launch_the_application() throws Throwable {	
		String url = File_Reader_Manager.getInstance().getConfigReader().getUrl();
		    getUrl(url);
		}
		
	@When("User enters the valid username {string} in the username field")
	public void user_enters_the_valid_username_in_the_username_field(String string) {
		sendInput(pom.getLog().getUsername(), string);
	}
	@When("User enters the valid password {string} in the password field")
	public void user_enters_the_valid_password_in_the_password_field(String string) {
		sendInput(pom.getLog().getPassword(), string);
	}

	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
		clickOnElement(pom.getLog().getLogin());
	}

	@Then("User verify the homepage navigates to search hotel")
	public void user_verify_the_homepage_navigates_to_search_hotel() {
		
	}
	
	//Scenario 2
	@When("User selects valid location in the location field")
	public void user_selects_valid_location_in_the_location_field() {
	    selectDropDown(pom.getSh().getLocation(), "Paris", "visibletext");
	}

	@When("User selects hotel in the hotel field")
	public void user_selects_hotel_in_the_hotel_field() {
	    selectDropDown(pom.getSh().getHotels(), "Hotel Sunshine", "visibletext");
	}

	@When("User select room type in the room type field")
	public void user_select_room_type_in_the_room_type_field() {
	   selectDropDown(pom.getSh().getRoom_Type(), "Deluxe", "value");
	}

	@When("User select valid room number in the number of rooms field")
	public void user_select_valid_room_number_in_the_number_of_rooms_field() {
		selectDropDown(pom.getSh().getRoom_Nos(), "1 - One", "visibletext");
	}

	@When("User select valid date in the check in date field")
	public void user_select_valid_date_in_the_check_in_date_field() {
		pom.getSh().getDatepick_In().clear();
		sendInput(pom.getSh().getDatepick_In(), "15/09/2021");
	}

	@When("User select valid date in the check out field")
	public void user_select_valid_date_in_the_check_out_field() {
		pom.getSh().getDatepick_Out().clear();
		sendInput(pom.getSh().getDatepick_Out(), "17/09/2021");
	}

	@When("User select valid adult number in the adults per room field")
	public void user_select_valid_adult_number_in_the_adults_per_room_field() {
		selectDropDown(pom.getSh().getAdult_Room(), "2 - Two", "visibletext");
	}

	@When("User select children number in the childrens per room field")
	public void user_select_children_number_in_the_childrens_per_room_field() {
		selectDropDown(pom.getSh().getChild_Room(), "2", "value");
	}

	@When("User clicks on the search button")
	public void user_clicks_on_the_search_button() {
		clickOnElement(pom.getSh().getSubmit());
	}

	@Then("User verify the hotel search page navigates to select hotel")
	public void user_verify_the_hotel_search_page_navigates_to_select_hotel() {
		System.out.println("Scenario 2 Navigated to : " );
		getTitle();
	}
	
	//Scenario 3
	@When("User select valid hotel in the select field")
	public void user_select_valid_hotel_in_the_select_field() {
	  clickOnElement(pom.getSel().getRadioButton());
	}

	@When("User clicks on the continue button")
	public void user_clicks_on_the_continue_button() {
	   clickOnElement(pom.getSel().getContinue());
	}

	@Then("User verify the select hotel page navigates to book a hotel page")
	public void user_verify_the_select_hotel_page_navigates_to_book_a_hotel_page() {
		System.out.println("Scenario 3 Navigated to : " );
		getTitle();
	}
	
	//Scenario 4
	@When("User enters valid FirstName in FirstName field")
	public void user_enters_valid_first_name_in_first_name_field() {
	    sendInput(pom.getBk().getFirst_Name(), "Naveen");
	    
	}

	@When("User enters valid LastName in LastName field")
	public void user_enters_valid_last_name_in_last_name_field() {
		sendInput(pom.getBk().getLast_Name(), "Anand");
	    
	}

	@When("User enters valid Billing Address in Billing Address field")
	public void user_enters_valid_billing_address_in_billing_address_field() {
		sendInput(pom.getBk().getAddress(), "NewYork");
	    
	}

	@When("User enters valid Credit card Number in Credit card No field")
	public void user_enters_valid_credit_card_number_in_credit_card_no_field() throws Throwable {	
	    String credit_Card_Number = File_Reader_Manager.getInstance().getConfigReader().getCredit_Card_Number();
	    sendInput(pom.getBk().getCc_Num(), credit_Card_Number);
	}

	@When("User selects valid Credit card type in Credit card type field")
	public void user_selects_valid_credit_card_type_in_credit_card_type_field() {
	    selectDropDown(pom.getBk().getCc_Type(),"VISA","visibletext");
	    
	}

	@When("User selects valid Month from select month in Expiry Date field")
	public void user_selects_valid_month_from_select_month_in_expiry_date_field() {
	    selectDropDown(pom.getBk().getCc_Exp_Month(),"December", "visibletext");
	    
	}

	@When("User selects valid Year from select Year in Expiry Date field")
	public void user_selects_valid_year_from_select_year_in_expiry_date_field() {
	    selectDropDown(pom.getBk().getCc_Exp_Year(), "2022", "visibletext");
	    
	}

	@When("User enters valid CVV number in CVV Number field")
	public void user_enters_valid_cvv_number_in_cvv_number_field() throws Throwable {
		String cvv = File_Reader_Manager.getInstance().getConfigReader().getCVV();
	    sendInput(pom.getBk().getCc_Cvv(), cvv);
	}

	@When("User clicks the Book Now button")
	public void user_clicks_the_book_now_button() {
	    clickOnElement(pom.getBk().getBook_Now());
	    
	}

	@Then("User verify that the hotel has been booked")
	public void user_verify_that_the_hotel_has_been_booked() {
		System.out.println("Scenario 4 Navigated to : " );
		getTitle();
		    
	}
	

	@When("User scroll down")
	public void user_scroll_down() {
		scroll(pom.getBh().getMy_itinerary());
	}
	@When("User clicks on my itinerary button")
	public void user_clicks_on_my_itinerary_button() {
	    clickOnElement(pom.getBh().getMy_itinerary());
	}
	@Then("User verify the hotel booking history")
	public void user_verify_the_hotel_booking_history() throws InterruptedException {
		threadSleep(1000);
		System.out.println("Scenario 5 Navigated to : " );
		getTitle();
	}




}
