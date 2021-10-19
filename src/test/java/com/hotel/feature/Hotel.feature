Feature: Testing Adactin Web Application end to end process

Scenario Outline:Verify that user able to login the application

Given User launch the application
When User enters the valid username "<Username>" in the username field
And User enters the valid password "<Password>" in the password field
And User clicks on the login button
Then User verify the homepage navigates to search hotel

Examples:
|Username|Password|
|aaa|111|
|bbb|222|

@Login
Scenario: Verify that user able to login the application

Given User launch the application
When User enters the valid username "naveen21" in the username field
And User enters the valid password "hotel@123" in the password field
And User clicks on the login button
Then User verify the homepage navigates to search hotel

Scenario: Verify that user able to search hotel 

When User selects valid location in the location field
And User selects hotel in the hotel field 
And User select room type in the room type field
And User select valid room number in the number of rooms field
And User select valid date in the check in date field
And User select valid date in the check out field
And User select valid adult number in the adults per room field
And User select children number in the childrens per room field
And User clicks on the search button
Then User verify the hotel search page navigates to select hotel

Scenario: Verify that user able to select hotel

When User select valid hotel in the select field
And User clicks on the continue button
Then User verify the select hotel page navigates to book a hotel page 

Scenario: Verify that user able to book a hotel 

When User enters valid FirstName in FirstName field
And User enters valid LastName in LastName field
And User enters valid Billing Address in Billing Address field
And User enters valid Credit card Number in Credit card No field
And User selects valid Credit card type in Credit card type field
And User selects valid Month from select month in Expiry Date field
And User selects valid Year from select Year in Expiry Date field
And User enters valid CVV number in CVV Number field
And User clicks the Book Now button
Then User verify that the hotel has been booked

Scenario: Verify user able to see the booking history

When User scroll down
And User clicks on my itinerary button
Then User verify the hotel booking history 