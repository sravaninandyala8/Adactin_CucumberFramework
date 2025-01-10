package stepDefinitions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SearchHotelPage;
import pageObjects.SelectHotelPage;
import utils.TestContextSetup;

public class SelectHotelSteps {
	

	TestContextSetup testContextSetup;
	SelectHotelPage selectHotel;
	SearchHotelPage searchHotel;
	public String pricePerNightSelectPage;
	public String NoOfDaysSelectPage;
	public String totalPriceSelectPage;
		

		public SelectHotelSteps(TestContextSetup testContextSetup)
		{
			this.testContextSetup = testContextSetup; 
			this.selectHotel = testContextSetup.pageObjectManager.getSelectHotelPage();
			this.searchHotel = testContextSetup.pageObjectManager.getSearchHotelPage();
		}
	
	
	@When("the user selects a hotel by clicking on radio button in select hotel page")
	public void the_user_selects_a_hotel_by_clicking_on_radio_button_in_select_hotel_page() {
			
		selectHotel.clickRadioButton();
	}
	
	@When("the user clicks on Continue button in select hotel page")
	public void the_user_clicks_on_continue_button_in_select_hotel_page() {
		
		selectHotel.clickContinueButton();
	}
	
	@Then("the user should navigate to the Book Hotel Page")
	public void the_user_should_navigate_to_the_book_hotel_page() {
	    
		String actualTitle = testContextSetup.driver.getTitle();
		Assert.assertEquals(actualTitle, "Adactin.com - Book A Hotel");
		
	}
	
	@Then("the user should see Rooms displayed in the Select Hotel page is same as the Number  of Rooms selected in the Search Hotel page")
	public void the_user_should_see_rooms_displayed_in_the_select_hotel_page_is_same_as_the_number_of_rooms_selected_in_the_search_hotel_page() {
	   
		String actualRooms = selectHotel.getRoomsDisplayed();
		Assert.assertEquals(actualRooms, testContextSetup.selectedNumberOfRooms.split("-")[0].trim() +" Rooms");
	}
	
	@When("the user clicks on Logout link in select hotel page")
	public void the_user_clicks_on_logout_link_in_select_hotel_page() {
	    
		selectHotel.clickLogoutLink();
	}
	
	@Then("the user should see radio buttons under the Select column in select hotel page")
	public void the_user_should_see_radio_buttons_under_the_select_column_in_select_hotel_page() {
	  
		boolean areRadioButtonsVisible = selectHotel.areRadioButtonsDisplayed();

        // Assert that radio buttons are visible
        Assert.assertTrue(areRadioButtonsVisible, "Radio buttons are not displayed under the Select column.");

	}

	@Then("the user should see the  Total Price \\(excl. GST) column displays the price in select hotel page")
	public void the_user_should_see_the_total_price_excl_gst_column_displays_the_price_in_select_hotel_page() {
	    
		String actualTotalPrice = selectHotel.getTotalPriceDisplayed();
		System.out.println(actualTotalPrice);
		Assert.assertEquals(actualTotalPrice.split(" ")[0].trim(), "AUD");
		testContextSetup.totalPriceSelectPage = actualTotalPrice;
		
	}

	@Then("the user should see Arrival date displayed in the Select Hotel page is same as the Check In Date entered in the Search Hotel page")
	public void the_user_should_see_arrival_date_displayed_in_the_select_hotel_page_is_same_as_the_check_in_date_entered_in_the_search_hotel_page() {
	    

		String actualArrivalDate = selectHotel.getArrivalDateDisplayed();
		Assert.assertEquals(actualArrivalDate, testContextSetup.enteredCheckInDate);
		
	}
	
	@When("the user clicks on Search Hotel link in select hotel page")
	public void the_user_clicks_on_search_hotel_link_in_select_hotel_page() {
	  
		selectHotel.clickSearchHotelLink();
	}
	
	@Then("the user should see Room Type displayed in the Select Hotel page is same as the Room Type selected in the Search Hotel page")
	public void the_user_should_see_room_type_displayed_in_the_select_hotel_page_is_same_as_the_room_type_selected_in_the_search_hotel_page() {
	   
		String actualRoomType = selectHotel.getRoomTypeDisplayed();
		Assert.assertEquals(actualRoomType, testContextSetup.selectedRoomType);
	}
	
	@When("the user clicks on Change Password link in select hotel page")
	public void the_user_clicks_on_change_password_link_in_select_hotel_page() {
		
		selectHotel.clickChangePasswordLink();
	}
	
	@Then("the user should see location displayed in the Select Hotel page is same as the location selected in the Search Hotel page")
	public void the_user_should_see_location_displayed_in_the_select_hotel_page_is_same_as_the_location_selected_in_the_search_hotel_page() {
	    
		String actualLocation = selectHotel.getLocationDisplayed();
		Assert.assertEquals(actualLocation, testContextSetup.selectedLocation);
    }
	
	
	@Then("the should see the Price Per Night column displays the price for hotel in select hotel page")
	public void the_should_see_the_price_per_night_column_displays_the_price_for_each_hotel_in_select_hotel_page() {
	    
		String actualPricePerNight = selectHotel.getPricePerNightDisplayed();
		Assert.assertEquals(actualPricePerNight.split(" ")[0].trim(), "AUD");
		testContextSetup.pricePerNightSelectPage = actualPricePerNight;
	}
	
	@Then("the user should see the Welcome text in select hotel page")
	public void the_user_should_see_the_welcome_text_in_select_hotel_page() {
		
		String actualWelcomeText = selectHotel.getWelcomeText();
		Assert.assertEquals(actualWelcomeText, "Welcome to Adactin Group of Hotels");
	   
	}
	@Then("the user should see the Adactin Logo in select hotel page")
	public void the_user_should_see_the_adactin_logo_in_select_hotel_page() {
	    
		boolean logo = selectHotel.getLogo();
		Assert.assertTrue(logo, "Logo is not displayed");
	}
	
	@Then("the user should see the Select hotel text in select hotel page")
	public void the_user_should_see_the_select_hotel_text_in_select_hotel_page() {
	    
		String selectHotelText = selectHotel.getSelectHotelText();
		Assert.assertEquals(selectHotelText, "Select Hotel");
		
	}
	
	@Then("the user should see the Hello Username text in select hotel page")
	public void the_user_should_see_the_hello_username_text_in_select_hotel_page() {
		 
		String helloUserName = selectHotel.getHelloUserNameText();
		Assert.assertEquals(helloUserName,"Hello Username!");
		

	}
	
	@Then("the user should see the footer message in select hotel page")
	public void the_user_should_see_the_footer_message_in_select_hotel_page() {
	    
		String footerMessageText = selectHotel.getFooterMessageText();
		Assert.assertEquals(footerMessageText,"© 2020 - Adactin.com. All Rights Reserved. Adactin Group Pty. Ltd.");
		
	}
	
	@Then("the user should see No. of Days correctly calculates the number of nights between the Arrival Date and Departure Date")
	public void the_user_should_see_no_of_days_correctly_calculates_the_number_of_nights_between_the_arrival_date_and_departure_date() throws InterruptedException {
		String actualNoOfDays = selectHotel.getNoOfDaysDisplayed(); 
	    Thread.sleep(2000);	   
	    testContextSetup.NoOfDaysSelectPage  = actualNoOfDays;
	    System.out.println(testContextSetup.NoOfDaysSelectPage+ " No of Days in select page");
	    System.out.println(actualNoOfDays + " actual");
	    String enteredCheckInDateStr = testContextSetup.enteredCheckInDate;  // Example check-in date
        String enteredCheckOutDateStr = testContextSetup.enteredCheckOutDate; // Example check-out date

        // Define the DateTimeFormatter with the correct format (dd/MM/yyyy)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Parse the string dates into LocalDate objects using the custom formatter
        LocalDate checkInDate = LocalDate.parse(enteredCheckInDateStr, formatter);
        LocalDate checkOutDate = LocalDate.parse(enteredCheckOutDateStr, formatter);

        // Calculate the number of days between check-in and check-out dates
        long numberOfDays = java.time.temporal.ChronoUnit.DAYS.between(checkInDate, checkOutDate);

        Assert.assertEquals(actualNoOfDays, numberOfDays+" Days");
      
       
	}
	
	@Then("the user should see the select column name")
	public void the_user_should_see_the_select_column_name() {
		
		String actualSelectText = selectHotel.getSelectText();
		Assert.assertEquals(actualSelectText, "Select");
		
	}
	
	@Then("the user should see the Hotel Name column name")
	public void the_user_should_see_the_hotel_name_column_name() {
	   
		String actualHotelNameText = selectHotel.getHotelNameText();
		Assert.assertEquals(actualHotelNameText, "Hotel Name");
		
	}
	
	@Then("the user should see the Location column name")
	public void the_user_should_see_the_location_column_name() {
	 
		String actualLocationText = selectHotel.getLocationText();
		Assert.assertEquals(actualLocationText, "Location");
				
	}
	
	@Then("the user should see the Rooms column name")
	public void the_user_should_see_the_rooms_column_name() {

		String actualRoomsText = selectHotel.getRoomsText();
		Assert.assertEquals(actualRoomsText, "Rooms");
			 
	}
	
	@Then("the user should see the Arrival Date column name")
	public void the_user_should_see_the_arrival_date_column_name() {

		String actualArrivalDateText = selectHotel.getArrivalDateText();
		Assert.assertEquals(actualArrivalDateText, "Arrival Date");
	
	}
	   
	@Then("the user should see the Departure Date column name")
	public void the_user_should_see_the_departure_date_column_name() {

		String actualDepartureDateText = selectHotel.getDepartureDateText();
		Assert.assertEquals(actualDepartureDateText, "Departure Date");
	
	}
	
	@Then("the user should see the No. of Days column name")
	public void the_user_should_see_the_no_of_days_column_name() {

		String actualNoOfDaysText = selectHotel.getNoOfDaysText();
		Assert.assertEquals(actualNoOfDaysText, "No. of Days");
	
	}
	
	
	@Then("the user should see the Rooms Type column name")
	public void the_user_should_see_the_rooms_type_column_name() {

		String actualRoomsTypeText = selectHotel.getRoomsTypeText();
		Assert.assertEquals(actualRoomsTypeText, "Rooms Type");
	
	}
	
	@Then("the user should see the Price Per Night column name")
	public void the_user_should_see_the_price_per_night_column_name() {

		String actualPricePerNightText = selectHotel.getPricePerNightText();
		Assert.assertEquals(actualPricePerNightText, "Price per Night");
	
	}
	
	@Then("the user should see the Total Price\\(excl. GST) column name")
	public void the_user_should_see_the_total_price_excl_gst_column_name() {

		String actualTotalPriceText = selectHotel.getTotalPriceText();
		Assert.assertEquals(actualTotalPriceText, "Total Price (excl. GST)");
	  
	}
	
	@When("the user clicks on Cancel button in select hotel page")
	public void the_user_clicks_on_cancel_button_in_select_hotel_page() {
	    
			selectHotel.clickCancelButton();
	}
	
	@Then("the user should see hotel name displayed in the Select Hotel page is same as the hotel name selected in the Search Hotel page")
	public void the_user_should_see_hotel_name_displayed_in_the_select_hotel_page_is_same_as_the_hotel_name_selected_in_the_search_hotel_page() {
	    
		String actualHotelName = selectHotel.getHotelNameDisplayed();
		Assert.assertEquals(actualHotelName, testContextSetup.selectedHotel);
	}
	
	@Then("the user should see Departure Date displayed in the Select Hotel page is same as the Check Out Date entered in the Search Hotel page")
	public void the_user_should_see_departure_date_displayed_in_the_select_hotel_page_is_same_as_the_check_out_date_entered_in_the_search_hotel_page() {
	    
		String actualDepartureDate = selectHotel.getDepartureDateDisplayed();
		Assert.assertEquals(actualDepartureDate, testContextSetup.enteredCheckOutDate);
	}
	
	@When("the user clicks on Booked Itinerary link in select hotel page")
	public void the_user_clicks_on_booked_itinerary_link_in_select_hotel_page() {
		
		selectHotel.clickBookedItineraryLink();
	}
}
