package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SearchHotelPage;
import utils.TestContextSetup;

public class SearchHotelSteps {
	
	TestContextSetup testContextSetup;
	SearchHotelPage searchHotel;
	public String selectedLocation;
	public String selectedHotel;
	public String selectedRoomType;
	public String selectedNumberOfRooms;
	public String enteredCheckInDate;
	public String enteredCheckOutDate;
	public String selectedAdultsPerRoom;
	public String selectedChildrenPerRoom;
	
	
		

		public SearchHotelSteps(TestContextSetup testContextSetup)
		{
			this.testContextSetup = testContextSetup; 
			this.searchHotel = testContextSetup.pageObjectManager.getSearchHotelPage();
		}
	
		@Then("the user should see the Location text in search hotel page")
		public void the_user_should_see_the_location_text_in_search_hotel_page() {
		   
			String locationText = searchHotel.getLocationText();
			Assert.assertEquals(locationText, "Location* ");
			
		}
		

		@Then("the user should see the Hotels text in search hotel page")
		public void the_user_should_see_the_hotels_text_in_search_hotel_page() {
		    
			String hotelsText = searchHotel.getHotelsText();
			Assert.assertEquals(hotelsText, "Hotels ");
			
		}
		

		@Then("the user should see the Room Type text in search hotel page")
		public void the_user_should_see_the_room_type_text_in_search_hotel_page() {
		    
			String roomTypeText = searchHotel.getRoomTypeText();
			Assert.assertEquals(roomTypeText, "Room Type ");
		}

		
		@Then("the user should see the Number of Rooms text in search hotel page")
		public void the_user_should_see_the_number_of_rooms_text_in_search_hotel_page() {
		    
			String numberOfRoomsText = searchHotel.getNumberOfRoomsText();
			Assert.assertEquals(numberOfRoomsText, "Number of Rooms* ");
		}
		

		@Then("the user should see the Check In Date text in search hotel page")
		public void the_user_should_see_the_check_in_date_text_in_search_hotel_page() {
		    
			String checkInDateText = searchHotel.getCheckInDateText();
			Assert.assertEquals(checkInDateText, "Check In Date* ");
		}
		

		@Then("the user should see the Check Out Date text in search hotel page")
		public void the_user_should_see_the_check_out_date_text_in_search_hotel_page() {
	
			String checkOutDateText = searchHotel.getCheckOutDateText();
			Assert.assertEquals(checkOutDateText, "Check Out Date* ");
		}
		

		@Then("the user should see the Adults Per Room text in search hotel page")
		public void the_user_should_see_the_adults_per_room_text_in_search_hotel_page() {
		    
			String adultsPerRoomText = searchHotel.getAdultsPerRoomText();
			Assert.assertEquals(adultsPerRoomText, "Adults per Room* ");
			
		}

		
		@Then("the user should see the Children Per Room text in search hotel page")
		public void the_user_should_see_the_children_per_room_text_in_search_hotel_page() {
		    
			String childrenPerRoomText = searchHotel.getChildrenPerRoomText();
			Assert.assertEquals(childrenPerRoomText, "Children per Room ");
		}

		
		@Then("the user should see the Welcome text in search hotel page")
		public void the_user_should_see_the_welcome_text_in_search_hotel_page() {
		   
			String welcomeText = searchHotel.getWelcomeText();
			Assert.assertEquals(welcomeText, "Welcome to Adactin Group of Hotels");
		}

		
		@Then("the user should see the Adactin Logo in search hotel page")
		public void the_user_should_see_the_adactin_logo_in_search_hotel_page() {
		    
			boolean logo = searchHotel.getLogo();
			Assert.assertTrue(logo, "Logo is not displayed");
		}

		
		@Then("the user should see the Search hotel text in search hotel page")
		public void the_user_should_see_the_search_hotel_text_in_search_hotel_page() {
		    
			String searchHotelText = searchHotel.getSearchHotelText();
			Assert.assertEquals(searchHotelText, "Search Hotel (Fields marked with Red asterix (*) are mandatory)");
		}

		
		@Then("the user should see the Hello Username text in search hotel page")
		public void the_user_should_see_the_hello_username_text_in_search_hotel_page() {
		    
			String helloUserName = searchHotel.getHelloUserNameText();
			Assert.assertEquals(helloUserName,"Hello AdactinUser234!");
			
		}

		
		@Then("the user should see the footer message in search hotel page")
		public void the_user_should_see_the_footer_message_in_search_hotel_page() {
		    
			String footerMessageText = searchHotel.getFooterMessageText();
			Assert.assertEquals(footerMessageText,"© 2020 - Adactin.com. All Rights Reserved. Adactin Group Pty. Ltd.");
		}

		@When("the user clicks on location dropdown in search hotel page")
		public void the_user_clicks_on_location_dropdown_in_search_hotel_page() {
		    
			searchHotel.clickLocationDropdown();
		}

		@Then("the user should see the Location dropdown options in search hotel page")
		public void the_user_should_see_the_location_dropdown_options_in_search_hotel_page() {
		    
			List<WebElement> locationOptions = searchHotel.getLocationList();
			
			String[] expectedLocationOptions = {"- Select Location -", "Sydney", "Melbourne", "Brisbane", "Adelaide", "London", "New York", 
					"Los Angeles", "Paris"};
			
			Assert.assertEquals(locationOptions.size(), expectedLocationOptions.length, "The number of options doesnot match");
			
			for(int i=0; i<expectedLocationOptions.length; i++)
			{
				String actualLocationOptions = locationOptions.get(i).getText();
				Assert.assertEquals(actualLocationOptions, expectedLocationOptions[i]);
				System.out.println(actualLocationOptions+" matching with  "+ expectedLocationOptions[i]);
			}
			
		}

		@When("the user clicks on Hotels dropdown in search hotel page")
		public void the_user_clicks_on_hotels_dropdown_in_search_hotel_page() {
		    
			searchHotel.clickHotelsDropdown();
		}

		@Then("the user should see the Hotels dropdown options in search hotel page")
		public void the_user_should_see_the_hotels_dropdown_options_in_search_hotel_page() {
		    
			List<WebElement> hotelsOptions = searchHotel.getHotelsList();
			
			String[] expectedHotelsOptions = {"- Select Hotel -", "Hotel Creek", "Hotel Sunshine", "Hotel Hervey", "Hotel Cornice"};
			
			Assert.assertEquals(hotelsOptions.size(), expectedHotelsOptions.length, "The number of options doesnot match");
			
			for(int i=0; i<expectedHotelsOptions.length; i++)
			{
				String actualLocationOptions = hotelsOptions.get(i).getText();
				Assert.assertEquals(actualLocationOptions, expectedHotelsOptions[i]);
				System.out.println(actualLocationOptions+" matching with  "+ expectedHotelsOptions[i]);
			}
			
		}
		

		@When("the user clicks on Room Type dropdown in search hotel page")
		public void the_user_clicks_on_room_type_dropdown_in_search_hotel_page() {
			
			searchHotel.clickRoomTypeDropdown();
		}

		
		@Then("the user should see the Room Type dropdown options in search hotel page")
		public void the_user_should_see_the_room_type_dropdown_options_in_search_hotel_page() {
		    
			List<WebElement> roomTypeOptions = searchHotel.getRoomTypeList();
			
			String[] expectedRoomTypeOptions = {"- Select Room Type -", "Standard", "Double", "Deluxe", "Super Deluxe"};
			
			Assert.assertEquals(roomTypeOptions.size(), expectedRoomTypeOptions.length, "The number of theme options doesnot match");
			
			for(int i=0; i<expectedRoomTypeOptions.length; i++)
			{
				String actualRoomTypeOptions = roomTypeOptions.get(i).getText();
				Assert.assertEquals(actualRoomTypeOptions, expectedRoomTypeOptions[i]);
				System.out.println(actualRoomTypeOptions+" matching with  "+ expectedRoomTypeOptions[i]);
			}
			
		}

		
		@When("the user clicks on Number of Rooms dropdown in search hotel page")
		public void the_user_clicks_on_number_of_rooms_dropdown_in_search_hotel_page() {
		    
			searchHotel.clickNumberOfRoomsDropdown();
		}

		@Then("the user should see the Number of Rooms dropdown options in search hotel page")
		public void the_user_should_see_the_number_of_rooms_dropdown_options_in_search_hotel_page() {
		    
			List<WebElement> numberOfRoomsOptions = searchHotel.getNumberOfRoomsList();
			
			String[] expectedNumberOfRoomsOptions = {"- Select Number of Rooms -", "1 - One", "2 - Two", "3 - Three", "4 - Four", "5 - Five",
					"6 - Six", "7 - Seven", "8 - Eight", "9 - Nine", "10 - Ten"};
			
			Assert.assertEquals(numberOfRoomsOptions.size(), expectedNumberOfRoomsOptions.length, "The number of options doesnot match");
			
			for(int i=0; i<expectedNumberOfRoomsOptions.length; i++)
			{
				String actualNumberOfRoomsOptions = numberOfRoomsOptions.get(i).getText();
				Assert.assertEquals(actualNumberOfRoomsOptions, expectedNumberOfRoomsOptions[i]);
				System.out.println(actualNumberOfRoomsOptions+" matching with  "+ expectedNumberOfRoomsOptions[i]);
			}
		}

		@When("the user clicks on Adult per Room dropdown in search hotel page")
		public void the_user_clicks_on_adult_per_room_dropdown_in_search_hotel_page() {
		    
			searchHotel.clickAdultPerRoomDropdown();
		}

		@Then("the user should see the Adult per Room dropdown options in search hotel page")
		public void the_user_should_see_the_adult_per_room_dropdown_options_in_search_hotel_page() {
		    
			List<WebElement> adultPerRoomOptions = searchHotel.getAdultPerRoomList();
			
			String[] expectedAdultPerRoomOptions = {"- Select Adults per Room -", "1 - One", "2 - Two", "3 - Three", "4 - Four"};
			
			Assert.assertEquals(adultPerRoomOptions.size(), expectedAdultPerRoomOptions.length, "The number of options doesnot match");
			
			for(int i=0; i<expectedAdultPerRoomOptions.length; i++)
			{
				String actualAdultPerRoomOptions = adultPerRoomOptions.get(i).getText();
				Assert.assertEquals(actualAdultPerRoomOptions, expectedAdultPerRoomOptions[i]);
				System.out.println(actualAdultPerRoomOptions+" matching with  "+ expectedAdultPerRoomOptions[i]);
			}
		}

		@When("the user clicks on Children per Room dropdown in search hotel page")
		public void the_user_clicks_on_children_per_room_dropdown_in_search_hotel_page() {
		    
			searchHotel.clickChildrenPerRoomDropdown();
		}

		@Then("the user should see the Children per Room dropdown options in search hotel page")
		public void the_user_should_see_the_children_per_room_dropdown_options_in_search_hotel_page() {
		    
			List<WebElement> childrenPerRoomOptions = searchHotel.getChildrenPerRoomList();
			
			String[] expectedChildrenPerRoomOptions = {"- Select Children per Room -", "1 - One", "2 - Two", "3 - Three", "4 - Four"};
			
			Assert.assertEquals(childrenPerRoomOptions.size(), expectedChildrenPerRoomOptions.length, "The number of options doesnot match");
			
			for(int i=0; i<expectedChildrenPerRoomOptions.length; i++)
			{
				String actualChildrenPerRoomOptions = childrenPerRoomOptions.get(i).getText();
				Assert.assertEquals(actualChildrenPerRoomOptions, expectedChildrenPerRoomOptions[i]);
				System.out.println(actualChildrenPerRoomOptions+" matching with  "+ expectedChildrenPerRoomOptions[i]);
			}
		}

		@Then("the user should see the default value in the Check In Date field as todays date in search hotel page")
		public void the_user_should_see_the_default_value_in_the_check_in_date_field_as_todays_date_in_search_hotel_page() {
		    
				String actualCheckInDate = searchHotel.getCheckInDate();
				String expectedCheckInDate = testContextSetup.genericUtils.getTodaysDate();
				Assert.assertEquals(actualCheckInDate, expectedCheckInDate, "Check In Date is not correct");
		}

		@Then("the user should see the default value in the Check Out Date field as tomorrows date in search hotel page")
		public void the_user_should_see_the_default_value_in_the_check_out_date_field_as_tomorrows_date_in_search_hotel_page() {
		    
				String actualCheckOutDate =  searchHotel.getCheckOutDate();
				String expectedCheckOutDate = testContextSetup.genericUtils.getTomorrowsDate();
				Assert.assertEquals(actualCheckOutDate, expectedCheckOutDate, "Check Out Date is not correct");
		}

		@When("the user selects the values for the dropdowns in search hotel page:")
		public void the_user_selects_the_values_for_the_dropdowns_in_search_hotel_page(io.cucumber.datatable.DataTable dataTable) {
		     // Get the data from the table
	        String location = dataTable.cell(1, 0);
	        String hotels = dataTable.cell(1, 1);
	        String roomType = dataTable.cell(1, 2);
	        String numberOfRooms = dataTable.cell(1, 3);
	        String adultsPerRoom = dataTable.cell(1, 4);
	        String childrenPerRoom = dataTable.cell(1, 5);

	        // Select values from the dropdowns
	        searchHotel.selectLocation(location);
	        searchHotel.selectHotel(hotels);
	        searchHotel.selectRoomType(roomType);
	        searchHotel.selectNumberOfRooms(numberOfRooms);
	        searchHotel.selectAdultsPerRoom(adultsPerRoom);
	        searchHotel.selectChildrenPerRoom(childrenPerRoom);
	        
	        testContextSetup.selectedLocation = location;
	        testContextSetup.selectedHotel = hotels;
	        testContextSetup.selectedRoomType = roomType;
	        testContextSetup.selectedNumberOfRooms= numberOfRooms;
	        testContextSetup.selectedAdultsPerRoom = adultsPerRoom;
	        testContextSetup.selectedChildrenPerRoom = childrenPerRoom;
	     
	        
		}

		@When("the user enters a valid Check In Date as {string} in search hotel page")
		public void the_user_enters_a_valid_check_in_date_as_in_search_hotel_page(String checkInDate) {
		    
			searchHotel.enterCheckInDate(checkInDate);
			testContextSetup.enteredCheckInDate = checkInDate;
		}

		@When("the user enters a valid Check Out Date as {string} in search hotel page")
		public void the_user_enters_a_valid_check_out_date_as_in_search_hotel_page(String checkOutDate) {
		    
			searchHotel.enterCheckOutDate(checkOutDate);
			testContextSetup.enteredCheckOutDate = checkOutDate;

		}

		@When("the user clicks on the Search button in search hotel page")
		public void the_user_clicks_on_the_button_in_search_hotel_page() throws InterruptedException {
		    
			searchHotel.clickSearchButton();
			Thread.sleep(5000);
		}

		@Then("the user should be navigated to the select hotel page")
		public void the_user_should_be_navigated_to_the_select_hotel_page() {
		    
			String actualTitle = testContextSetup.driver.getTitle();
			Assert.assertEquals(actualTitle, "Adactin.com - Select Hotel");
		}

		@Then("all the fields should be reset to their default values in search hotel page")
		public void all_the_fields_should_be_reset_to_their_default_values_in_search_hotel_page() {
		    
			searchHotel.clickResetButton();
			Assert.assertEquals(searchHotel.getLocation(), "- Select Location -");
			Assert.assertEquals(searchHotel.getHotels(), "- Select Hotel -");
			Assert.assertEquals(searchHotel.getRoomType(), "- Select Room Type -");
			Assert.assertEquals(searchHotel.getNumberOfRooms(), "1 - One");
			Assert.assertEquals(searchHotel.getAdultsPerRoom(), "1 - One");
			Assert.assertEquals(searchHotel.getChildrenPerRoom(), "- Select Children per Room -");

	        // Verify that the date fields are reset to the default values
			Assert.assertEquals(searchHotel.getCheckInDate(), testContextSetup.genericUtils.getTodaysDate());
			Assert.assertEquals(searchHotel.getCheckOutDate(), testContextSetup.genericUtils.getTomorrowsDate());
		}

		@When("the user clears the date in the Check In Date textbox in search hotel page")
		public void the_user_clears_the_date_in_the_check_in_date_textbox_in_search_hotel_page() {
		    
			searchHotel.clearCheckInDate();
		}

		@When("the user clears the date in the Check Out Date textbox in search hotel page")
		public void the_user_clears_the_date_in_the_check_out_date_textbox_in_search_hotel_page() {
		    
			searchHotel.clearCheckOutDate();
		}

		@When("the user clicks on the Reset button in search hotel page")
		public void the_user_clicks_on_reset_button_in_search_hotel_page() {
		    	
			searchHotel.clickResetButton();
		}

		@Then("the user should see the error message next to Location dropdown in search hotel page")
		public void the_user_should_see_the_error_message_next_to_location_dropdown_in_search_hotel_page() {
		    
			String actualLocationErrorMessage = searchHotel.getLocationErrorMesageText();
			Assert.assertEquals(actualLocationErrorMessage, "Please Select a Location");
		}

		@Then("the user should see the error message next to Check In Date textbox in search hotel page")
		public void the_user_should_see_the_error_message_next_to_check_in_date_textbox_in_search_hotel_page() {
		    
			String actualCheckInErrorMessage = searchHotel.getCheckInErrorMesageText();
			Assert.assertEquals(actualCheckInErrorMessage, "Please Select Check-In Date");
		}
		
		@Then("the user should see the error message next to Check Out Date textbox in search hotel page")
		public void the_user_should_see_the_error_message_next_to_check_out_date_textbox_in_search_hotel_page() {
		    
			String actualCheckOutErrorMessage = searchHotel.getCheckOutErrorMesageText();
			Assert.assertEquals(actualCheckOutErrorMessage, "Please Select Check-Out Date");
		}

		@When("the user clicks on Booked Itinerary link in search hotel page")
		public void the_user_clicks_on_booked_itinerary_link_in_search_hotel_page() {
		    
			searchHotel.clickBookedItineraryLink();
		}
		
		@Then("the user should navigate to the Booked Itinerary page")
		public void the_user_should_navigate_to_the_booked_itinerary_page() {
		    
			String actualPageTitle = testContextSetup.driver.getTitle();
			Assert.assertEquals(actualPageTitle, "Adactin.com - Select Hotel");
		}
		
		@When("the user clicks on Search Hotel link in search hotel page")
		public void the_user_clicks_on_search_hotel_link_in_search_hotel_page() {
		    
			searchHotel.clickSearchHotelLink();
		}
		
		@When("the user clicks on Logout link in search hotel page")
		public void the_user_clicks_on_logout_link_in_search_hotel_page() {
		    
			searchHotel.clickLogoutLink();
		}
		
		@Then("the user should navigate to the Logout page")
		public void the_user_should_navigate_to_the_logout_page_in_search_hotel_page() {
			
			String actualPageTitle = testContextSetup.driver.getTitle();
			Assert.assertEquals(actualPageTitle, "Adactin.com - Logout");
		}

		@When("the user clicks on Change Password link in search hotel page")
		public void the_user_clicks_on_change_password_link_in_search_hotel_page() {
		    
			searchHotel.clickChangePasswordLink();
		}
		
		@Then("the user should navigate to the Change Password page")
		public void the_user_should_navigate_to_the_change_password_page() {
		    
			String actualPageTitle = testContextSetup.driver.getTitle();
			Assert.assertEquals(actualPageTitle, "Adactin.com - Search Hotel");
			
		}

		

}
