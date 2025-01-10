package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BookedItineraryPage;
import pageObjects.BookingConfirmationPage;
import pageObjects.SearchHotelPage;
import utils.TestContextSetup;

public class BookedItinerarySteps {
	
	TestContextSetup testContextSetup;
	BookedItineraryPage bookedItinerary;
	SearchHotelPage searchHotel;
	
	public BookedItinerarySteps(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
		this.bookedItinerary = testContextSetup.pageObjectManager.getBookedItineraryPage();
		this.searchHotel = testContextSetup.pageObjectManager.getSearchHotelPage();
	}
	
	@When("the user clicks on Change Password link in booked itinerary page")
	public void the_user_clicks_on_change_password_link_in_booked_itinerary_page() {
	   
		bookedItinerary.clickChangePasswordLink();
	}
	
	@When("the user clicks on Logout link in booked itinerary page")
	public void the_user_clicks_on_logout_link_in_booked_itinerary_page() {
	   
		bookedItinerary.clickLogoutLink();
	}

	@When("the user clicks on Search Hotel link in booked itinerary page")
	public void the_user_clicks_on_search_hotel_link_in_booked_itinerary_page() {
	    
		bookedItinerary.clickSearchHotelLink();
	}
	
	@When("the user clicks on Logout button in booked itinerary page")
	public void the_user_clicks_on_logout_button_in_booked_itinerary_page() {
	    
		bookedItinerary.clickLogoutButton();
	}

	@When("the user clicks on Search Hotel button in booked itinerary page")
	public void the_user_clicks_on_search_hotel_button_in_booked_itinerary_page() {
	    
		bookedItinerary.clickSearchHotelButton();
	}
	
	@Then("the user should see the Order Id text in booked itinerary page")
	public void the_user_should_see_the_order_id_text_in_booked_itinerary_page() {
	    
		String actualOrderIdText = bookedItinerary.getOrderIdText().trim();
		Assert.assertEquals(actualOrderIdText,"Order Id");
	}
	@Then("the user should see the Cancel text in booked itinerary page")
	public void the_user_should_see_the_cancel_text_in_booked_itinerary_page() {
	    
		String actualCancelText = bookedItinerary.getCancelText().trim();
		Assert.assertEquals(actualCancelText,"Cancel");
	}
	@Then("the user should see the No of Rooms text in booked itinerary page")
	public void the_user_should_see_the_no_of_rooms_text_in_booked_itinerary_page() {
	   
		String actualNoOfRoomsText = bookedItinerary.getNoOfRoomsText();
		Assert.assertEquals(actualNoOfRoomsText,"No. of Rooms");
	}
	@Then("the user should see the No of Days text in booked itinerary page")
	public void the_user_should_see_the_no_of_days_text_in_booked_itinerary_page() {
	    
		String actualNoOfDaysText = bookedItinerary.getNoOfDaysText();
		Assert.assertEquals(actualNoOfDaysText,"No. of Days");
	}
	
	@Then("the user should see the Welcome text in booked itinerary page")
	public void the_user_should_see_the_welcome_text_in_booked_itinerary_page() {
	    
		String actualWelcomeText = bookedItinerary.getWelcomeText();
		Assert.assertEquals(actualWelcomeText,"Welcome to Adactin Group of Hotels");
	}
	@Then("the user should see the Adactin Logo in booked itinerary hotel page")
	public void the_user_should_see_the_adactin_logo_in_booked_itinerary_hotel_page() {
	    
		boolean logo = bookedItinerary.getLogo();
		Assert.assertTrue(logo);
	}
	@Then("the user should see the Booked Itinerary text in booked itinerary hotel page")
	public void the_user_should_see_the_booked_itinerary_text_in_booked_itinerary_hotel_page() {
	    
		String actualBookedItineraryText  = bookedItinerary.getBookedItineraryText();
		Assert.assertEquals(actualBookedItineraryText,"Booked Itinerary");
	}
	@Then("the user should see the Hello Username text in booked itinerary hotel page")
	public void the_user_should_see_the_hello_username_text_in_booked_itinerary_hotel_page() {
	    
	    String actualUsernameText = bookedItinerary.getHelloUserNameText();
	    Assert.assertEquals(actualUsernameText,"Hello AdactinUser234!");
	}
	@Then("the user should see the footer message in booked itinerary page")
	public void the_user_should_see_the_footer_message_in_booked_itinerary_page() {
		
		String actualFooterText = bookedItinerary.getFooterMessageText();
		Assert.assertEquals(actualFooterText,"© 2020 - Adactin.com. All Rights Reserved. Adactin Group Pty. Ltd.");
	}
	@Then("the user should see the Search order Id text in booked itinerary page")
	public void the_user_should_see_the_search_order_id_text_in_booked_itinerary_page() {
	    
		String actualSearchOrderId = bookedItinerary.getSearchOrderIdText().trim();
		Assert.assertEquals(actualSearchOrderId,"Search Order Id");
	}
	
	@When("the user clicks on Booked Itinerary link in booked itinerary page")
	public void the_user_clicks_on_booked_itinerary_link_in_booked_itinerary_page() {
	    
		bookedItinerary.clickBookedItineraryLink();
	}
	
	@Then("the user should see the Hotel Name text in booked itinerary page")
	public void the_user_should_see_the_hotel_name_text_in_booked_itinerary_page() {
	  
		String actualHotelNameText = bookedItinerary.getHotelNameText();
		Assert.assertEquals(actualHotelNameText,"Hotel Name");
	}
	@Then("the user should see the Location text in booked itinerary page")
	public void the_user_should_see_the_location_text_in_booked_itinerary_page() {
	    
		String actualLocationText = bookedItinerary.getLocationText();
		Assert.assertEquals(actualLocationText,"Location");
	}
	@Then("the user should see the First Name text in booked itinerary page")
	public void the_user_should_see_the_first_name_text_in_booked_itinerary_page() {
	    
		String actualFirstNameText = bookedItinerary.getFirstNameText();
		Assert.assertEquals(actualFirstNameText,"First Name");
	}
	@Then("the user should see the Last Name text in booked itinerary page")
	public void the_user_should_see_the_last_name_text_in_booked_itinerary_page() {
	    
		String actualLastNameText = bookedItinerary.getLastNameText();
		Assert.assertEquals(actualLastNameText,"Last Name");
	}
	@Then("the user should see the Arrival Date text in booked itinerary page")
	public void the_user_should_see_the_arrival_date_text_in_booked_itinerary_page() {
	    
		String actualArrivalDateText = bookedItinerary.getArrivalDateText();
		Assert.assertEquals(actualArrivalDateText,"Arrival Date");
	}
	@Then("the user should see the Departure Date text in booked itinerary page")
	public void the_user_should_see_the_departure_date_text_in_booked_itinerary_page() {
	    
		String actualDepartureDateText = bookedItinerary.getDepartureDateText();
		Assert.assertEquals(actualDepartureDateText,"Departure Date");
	}
	
	@Then("the user should see the Room Type text in booked itinerary page")
	public void the_user_should_see_the_room_type_text_in_booked_itinerary_page() {
		
		String actualRoomTypeText = bookedItinerary.getRoomsTypeText();
		Assert.assertEquals(actualRoomTypeText,"Rooms Type");
	}
	@Then("the user should see the Price per Night text in booked itinerary page")
	public void the_user_should_see_the_price_per_night_text_in_booked_itinerary_page() {
	   
		String actualPricePerNightText = bookedItinerary.getPricePerNightText();
		Assert.assertEquals(actualPricePerNightText,"Price per Night");
	}
	@Then("the user should see the Total Price text in booked itinerary page")
	public void the_user_should_see_the_total_price_text_in_booked_itinerary_page() {
	    
		String actualTotalPriceText = bookedItinerary.getTotalPriceText();
		Assert.assertEquals(actualTotalPriceText,"Total Price (incl. GST)");
	}
	@When("the user clicks on the Checkbox column")
	public void the_user_clicks_on_the_checkbox_column() {
		
	    bookedItinerary.clickCheckBoxColumn();
	}
	@Then("all checkboxes should be selected")
	public void all_checkboxes_should_be_selected() throws InterruptedException {
	    
		List<WebElement> checkboxes = bookedItinerary.getCheckboxes();
        
		Thread.sleep(5000);
        // Loop through all checkboxes and check if they are selected
		for(int i=0;i<checkboxes.size();i++)
		{
			boolean actualCheckboxes = checkboxes.get(i).isSelected();
			Assert.assertTrue(actualCheckboxes);
		}
       
	}

}
