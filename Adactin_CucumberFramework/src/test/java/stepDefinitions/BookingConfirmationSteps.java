package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BookHotelPage;
import pageObjects.BookingConfirmationPage;
import pageObjects.SearchHotelPage;
import utils.TestContextSetup;

public class BookingConfirmationSteps {
	
	TestContextSetup testContextSetup;
	BookingConfirmationPage bookingConfirmation;
	SearchHotelPage searchHotel;
	BookHotelPage bookHotel;
	
	public String hotelNameBookPage;
	public String locationBookPage;
	public String roomTypeBookPage;
	public String totalRoomsBookPage;
	public String pricePerNightBookPage;
	public String totalPriceBookPage;
	public String gstBookPage;
	public String finalPriceBookPage;
	
	public BookingConfirmationSteps(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
		this.bookingConfirmation = testContextSetup.pageObjectManager.getBookingConfirmationPage();
		this.searchHotel = testContextSetup.pageObjectManager.getSearchHotelPage();
		this.bookHotel = testContextSetup.pageObjectManager.getBookHotelPage();
	}
	
	@Then("the user should see the Order No in the booking confirmation page")
	public void the_user_should_see_the_order_no_in_the_booking_confirmation_page() {
	   
		boolean orderNo = bookingConfirmation.getOrderNoInputText();
		Assert.assertTrue(orderNo);
	}

	@When("the user clicks on the Logout link in booking confirmation page")
	public void the_user_clicks_on_the_logout_link_in_booking_confirmation_page() {
	    
		bookingConfirmation.clickLogoutLink();
		
	}
	
	@When("the user sees the hotel name in the book hotel page")
	public void the_user_sees_the_hotel_name_in_the_book_hotel_page() {
	    
		String expectedhotelnameBook = bookHotel.getHotelNameInputText();
	    testContextSetup.hotelNameBookPage = expectedhotelnameBook;
	}
	
	@When("the user sees the location in the book hotel page")
	public void the_user_sees_the_location_in_the_book_hotel_page() {
		String expectedLocationBook = bookHotel.getLocationInputText();
		testContextSetup.locationBookPage = expectedLocationBook;
	}
	@When("the user sees the room type in the book hotel page")
	public void the_user_sees_the_room_type_in_the_book_hotel_page() {
		String expectedRoomTypeBook = bookHotel.getRoomTypeInputText();
		testContextSetup.roomTypeBookPage = expectedRoomTypeBook;
	}
	
	@When("the user sees the total rooms in the book hotel page")
	public void the_user_sees_the_total_rooms_in_the_book_hotel_page() {
		String expectedTotalRoomsBook = bookHotel.getNumberOfRoomsInputText();
		testContextSetup.totalRoomsBookPage = expectedTotalRoomsBook;
	}
	
	@When("the user sees the price per night in the book hotel page")
	public void the_user_sees_the_price_per_night_in_the_book_hotel_page() {
		String expectedPricePerNightBook = bookHotel.getPricePerNightInputText();
		testContextSetup.pricePerNightBookPage = expectedPricePerNightBook;
	}
	@When("the user sees the total price in the book hotel page")
	public void the_user_sees_the_total_price_in_the_book_hotel_page() {
		String expectedTotalPriceBook = bookHotel.getTotalPriceInputText();
		testContextSetup.totalPriceBookPage = expectedTotalPriceBook;
	}
	@When("the user sees the gst in the book hotel page")
	public void the_user_sees_the_gst_in_the_book_hotel_page() {
		String expectedGstBook = bookHotel.getGstInputText();
		testContextSetup.gstBookPage = expectedGstBook;
	}
	@When("the user sees the final filled price in the book hotel page")
	public void the_user_sees_the_final_filled_price_in_the_book_hotel_page() {
		String expectedFinalPriceBook = bookHotel.getFinalBilledInputText();
		testContextSetup.finalPriceBookPage = expectedFinalPriceBook;
	}
	@Then("the user should see hotel name in the Booking Confirmation page is same as the hotel selected in the Book Hotel page")
	public void the_user_should_see_hotel_name_in_the_booking_confirmation_page_is_same_as_the_hotel_selected_in_the_book_hotel_page() {

		  String actualHotelNameBooking = bookingConfirmation.getHotelNameInputText();
		    Assert.assertEquals(actualHotelNameBooking, testContextSetup.hotelNameBookPage);
	}
	@Then("the user should see location in the Booking Confirmation page is same as the location selected in the Book Hotel page")
	public void the_user_should_see_location_in_the_booking_confirmation_page_is_same_as_the_location_selected_in_the_book_hotel_page() {
		 String actualLocationBooking = bookingConfirmation.getLocationInputText();
		    Assert.assertEquals(actualLocationBooking, testContextSetup.locationBookPage);
	}
	@Then("the user should see room type in the Booking Confirmation page is same as the rome type selected in the Book Hotel page")
	public void the_user_should_see_room_type_in_the_booking_confirmation_page_is_same_as_the_rome_type_selected_in_the_book_hotel_page() {
		String actualRoomTypeBooking = bookingConfirmation.getRoomTypeInputText();
	    Assert.assertEquals(actualRoomTypeBooking, testContextSetup.roomTypeBookPage);
	}
	
	@Then("the user should see total rooms in the Booking Confirmation page is same as the number of rooms selected in the Book Hotel page")
	public void the_user_should_see_total_rooms_in_the_booking_confirmation_page_is_same_as_the_number_of_rooms_selected_in_the_book_hotel_page() {
		String actualTotalRoomsBooking = bookingConfirmation.getTotalRoomsInputText();
		Assert.assertEquals(actualTotalRoomsBooking, testContextSetup.totalRoomsBookPage);
	}
	
	@Then("the user should see price per night in the Booking Confirmation page is same as the price per night in the Book Hotel page")
	public void the_user_should_see_price_per_night_in_the_booking_confirmation_page_is_same_as_the_price_per_night_in_the_book_hotel_page() {
		String actualPricePerNightBooking = bookingConfirmation.getPricePerNightInputText();
		Assert.assertEquals(actualPricePerNightBooking, testContextSetup.pricePerNightBookPage);
	}
	@Then("the user should see total price in the Booking Confirmation page is same as the total price in the Book Hotel page")
	public void the_user_should_see_total_price_in_the_booking_confirmation_page_is_same_as_the_total_price_in_the_book_hotel_page() {
		String actualTotalPriceBooking = bookingConfirmation.getTotalPriceInputText();
		Assert.assertEquals(actualTotalPriceBooking, testContextSetup.totalPriceBookPage);
	}
	@Then("the user should see the gst in the Booking Confirmation page is same as the gst in the Book Hotel page")
	public void the_user_should_see_the_gst_in_the_booking_confirmation_page_is_same_as_the_gst_in_the_book_hotel_page() {
		String actualGstBooking = bookingConfirmation.getGSTInputText();
		Assert.assertEquals(actualGstBooking, testContextSetup.gstBookPage);
	}
	@Then("the user should see the final billed price in the Booking Confirmation page is same as the final billed price in the Book Hotel page")
	public void the_user_should_see_the_final_billed_price_in_the_booking_confirmation_page_is_same_as_the_final_billed_price_in_the_book_hotel_page() {
		String actualFinalPriceBooking = bookingConfirmation.getFinalBilledPriceInputText();
		Assert.assertEquals(actualFinalPriceBooking, testContextSetup.finalPriceBookPage);
	}

	@When("the user clicks on the Logout button in booking confirmation page")
	public void the_user_clicks_on_the_logout_button_in_booking_confirmation_page() {
	    
		bookingConfirmation.clickLogoutButton();
	}
	
	@When("the user clicks on the Booked Itinerary link in booking confirmation page")
	public void the_user_clicks_on_the_booked_itinerary_link_in_booking_confirmation_page() {
	    
		bookingConfirmation.clickBookedItineraryLink();
	}
	
	@When("the user clicks on the Change Password link in booking confirmation page")
	public void the_user_clicks_on_the_change_password_link_in_booking_confirmation_page() {
	    
		bookingConfirmation.clickChangePasswordLink();
	}

	@When("the user clicks on the Search Hotel link in booking confirmation page")
	public void the_user_clicks_on_the_search_hotel_link_in_booking_confirmation_page() {
	   
		bookingConfirmation.clickSearchHotelLink();
	}
	
	@When("the user clicks on the Search Hotel button in booking confirmation page")
	public void the_user_clicks_on_the_search_hotel_button_in_booking_confirmation_page() {
	   
		bookingConfirmation.clickSearchHotelButton();
	}
	
	@Then("the user should see the Welcome text in booking confirmation page")
	public void the_user_should_see_the_welcome_text_in_booking_confirmation_page() {
	    
		String welcomeText = bookingConfirmation.getWelcomeText();
		Assert.assertEquals(welcomeText, "Welcome to Adactin Group of Hotels");
	}
	
	@Then("the user should see the Adactin Logo in booking confirmation page")
	public void the_user_should_see_the_adactin_logo_in_booking_confirmation_page() {
	   
		boolean logo = bookingConfirmation.getLogo();
		Assert.assertTrue(logo);
		
	}
	
	@Then("the user should see the Booking Confirmation text in booking confirmation page")
	public void the_user_should_see_the_booking_confirmation_text_in_booking_confirmation_page() {
	    
		String bookingText = bookingConfirmation.getBookingText().trim();
		Assert.assertEquals(bookingText, "Booking Confirmation");
	}
	
	@Then("the user should see the Hello Username text in booking confirmation page")
	public void the_user_should_see_the_hello_username_text_in_booking_confirmation_page() {
	   
		String helloUsernameText = bookingConfirmation.getHelloUserNameText();
		Assert.assertEquals(helloUsernameText, "Hello AdactinUser234!");
	}
	
	@Then("the user should see the footer message in booking confirmationpage")
	public void the_user_should_see_the_footer_message_in_booking_confirmationpage() {
	    
		String footerMessageText = bookingConfirmation.getFooterText();
		Assert.assertEquals(footerMessageText,"© 2020 - Adactin.com. All Rights Reserved. Adactin Group Pty. Ltd.");
	}
	
	@Then("the user should see the Hotel Name text in booking confirmation page")
	public void the_user_should_see_the_hotel_name_text_in_booking_confirmation_page() {
	    
		String hotelNameText = bookingConfirmation.getHotelNameText().trim();
		Assert.assertEquals(hotelNameText, "Hotel Name");
	}
	
	@Then("the user should see the Location text in booking confirmation page")
	public void the_user_should_see_the_location_text_in_booking_confirmation_page() {
		
		String locationText = bookingConfirmation.getLocationText().trim();
		Assert.assertEquals(locationText, "Location");
	}
	
	@Then("the user should see the Room Type text in booking confirmation page")
	public void the_user_should_see_the_room_type_text_in_booking_confirmation_page() {
	    
		String roomTypeText = bookingConfirmation.getRoomTypeText().trim();
		Assert.assertEquals(roomTypeText, "Room Type");
	}
	
	@Then("the user should see the Arrival Date text in booking confirmation page")
	public void the_user_should_see_the_arrival_date_text_in_booking_confirmation_page() {
	   
		String arrivalDateText = bookingConfirmation.getArrivalDateText().trim();
		Assert.assertEquals(arrivalDateText, "Arrival Date");
	}
	
	@Then("the user should see the Departure Date text in booking confirmation page")
	public void the_user_should_see_the_departure_date_text_in_booking_confirmation_page() {
	    
		String departureDateText = bookingConfirmation.getDepartureDateText().trim();
		Assert.assertEquals(departureDateText, "Departure Date");
	}
	
	@Then("the user should see the Total Rooms text in booking confirmation page")
	public void the_user_should_see_the_total_rooms_text_in_booking_confirmation_page() {
		
		String totalRoomsText = bookingConfirmation.getTotalRoomsText().trim();
		Assert.assertEquals(totalRoomsText, "Total Rooms");
	}
	
	@Then("the user should see the Adults Per Room text in booking confirmation page")
	public void the_user_should_see_the_adults_per_room_text_in_booking_confirmation_page() {
	    
		String adultsPerRoomText = bookingConfirmation.getAdultsPerRoomText().trim();
		Assert.assertEquals(adultsPerRoomText, "Adults Per Room");
	}
	
	@Then("the user should see the Children Per Room text in booking confirmation page")
	public void the_user_should_see_the_children_per_room_text_in_booking_confirmation_page() {
	    
		String childrenPerRoomText = bookingConfirmation.getChildrenPerRoomText().trim();
		Assert.assertEquals(childrenPerRoomText, "Children per Room");
	}
	
	@Then("the user should see the Price per Night text in booking confirmation page")
	public void the_user_should_see_the_price_per_night_text_in_booking_confirmation_page() {
	    
		String pricePerNightText = bookingConfirmation.getPricePerNightText().trim();
		Assert.assertEquals(pricePerNightText, "Price per Night");
	}
	
	@Then("the user should see the Total Price text in booking confirmation page")
	public void the_user_should_see_the_total_price_text_in_booking_confirmation_page() {
	 
		String totalPriceText = bookingConfirmation.getTotalPriceText().trim();
		Assert.assertEquals(totalPriceText, "Total Price");
	}
	
	@Then("the user should see the GST text in booking confirmation page")
	public void the_user_should_see_the_gst_text_in_booking_confirmation_page() {

		String gstText = bookingConfirmation.getGSTText().trim();
		Assert.assertEquals(gstText, "GST");
	}
	
	@Then("the user should see the Final Billed Price text in booking confirmation page")
	public void the_user_should_see_the_final_billed_price_text_in_booking_confirmation_page() {
	    
		String finalBilledPriceText = bookingConfirmation.getFinalBilledPriceText().trim();
		Assert.assertEquals(finalBilledPriceText, "Final Billed Price");
	}
	
	@Then("the user should see the First Name text in booking confirmation page")
	public void the_user_should_see_the_first_name_text_in_booking_confirmation_page() {
	     
		String firstNameText = bookingConfirmation.getFirstNameText().trim();
		Assert.assertEquals(firstNameText, "First Name");
	}
	
	@Then("the user should see the Last Name text in booking confirmation page")
	public void the_user_should_see_the_last_name_text_in_booking_confirmation_page() {
		 
		String lastNameText = bookingConfirmation.getLastNameText().trim();
		Assert.assertEquals(lastNameText, "Last Name");
	}
	
	@Then("the user should see the Billing Address text in booking confirmation page")
	public void the_user_should_see_the_billing_address_text_in_booking_confirmation_page() {
		 
		String billingAddressText = bookingConfirmation.getBillingAddressText().trim();
		Assert.assertEquals(billingAddressText, "Billing Address");
	}
	
	@Then("the user should see the Order No text in booking confirmation page")
	public void the_user_should_see_the_order_no_text_in_booking_confirmation_page() {
	    
		String orderNoText = bookingConfirmation.getOrderNoText().trim();
		Assert.assertEquals(orderNoText, "Order No.");
	}
	
	@When("the user clicks on the My Itinerary button in booking confirmation page")
	public void the_user_clicks_on_the_my_itinerary_button_in_booking_confirmation_page() {
	    
		bookingConfirmation.clickMyItineraryButton();
	}

}
