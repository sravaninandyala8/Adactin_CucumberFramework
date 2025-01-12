package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BookHotelPage;
import pageObjects.SearchHotelPage;
import pageObjects.SelectHotelPage;
import utils.TestContextSetup;

public class BookHotelSteps {
	
	TestContextSetup testContextSetup;
	BookHotelPage bookHotel;
	SelectHotelPage selectHotel;
	SearchHotelPage searchHotel;
	public String totalPriceBookHotelPage;
	public String gstBookHotelPage;
	public String finalBilledPriceBookHotelPage;
	public String pricePerNightBookHotelPage;
	

	
	public BookHotelSteps(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup; 
		this.bookHotel = testContextSetup.pageObjectManager.getBookHotelPage();
		this.selectHotel = testContextSetup.pageObjectManager.getSelectHotelPage();
		this.searchHotel = testContextSetup.pageObjectManager.getSearchHotelPage();
		
	}
	
	@Then("the user should see the Welcome text in book hotel page")
	public void the_user_should_see_the_welcome_text_in_book_hotel_page() {
	      
		String welcomeText = bookHotel.getWelcomeText();
		Assert.assertEquals(welcomeText, "Welcome to Adactin Group of Hotels");
	}
	
	@Then("the user should see the Adactin Logo in book hotel page")
	public void the_user_should_see_the_adactin_logo_in_book_hotel_page() {
		
		boolean logo = bookHotel.getLogo();
		Assert.assertTrue(logo, "Logo is not displayed");
		
	}
	
	@Then("the user should see the Book A hotel text in book hotel page")
	public void the_user_should_see_the_book_a_hotel_text_in_book_hotel_page() {
	    
		String bookHotelText = bookHotel.getBookHotelText().trim();
		Assert.assertEquals(bookHotelText, "Book A Hotel");
	}
	
	@Then("the user should see the Hello Username text in book hotel page")
	public void the_user_should_see_the_hello_username_text_in_book_hotel_page() {
		 
		String helloUsernameText = bookHotel.getHelloUsernameText();
		Assert.assertEquals(helloUsernameText, "Hello AdactinUser234!");
	}
	
	@Then("the user should see the footer message in book hotel page")
	public void the_user_should_see_the_footer_message_in_book_hotel_page() {
	    
		String footerMessageText = bookHotel.getFooterText();
		Assert.assertEquals(footerMessageText,"© 2020 - Adactin.com. All Rights Reserved. Adactin Group Pty. Ltd.");
	}
	
	@Then("the user should see the Hotel Name text in book hotel page")
	public void the_user_should_see_the_hotel_name_text_in_book_hotel_page() {
		
		String hotelNameText = bookHotel.getHotelNameText().trim();
		Assert.assertEquals(hotelNameText,"Hotel Name");
	}
	
	@Then("the user should see the Location text in book hotel page")
	public void the_user_should_see_the_location_text_in_book_hotel_page() {
	    
		String locationText = bookHotel.getLocationText().trim();
		Assert.assertEquals(locationText,"Location");
	}
	
	@Then("the user should see the Room Type text in book hotel page")
	public void the_user_should_see_the_room_type_text_in_book_hotel_page() {
	    
		String roomTypeText = bookHotel.getRoomTypeText().trim();
		Assert.assertEquals(roomTypeText,"Room Type");
		
	}
	
	@Then("the user should see the Number of Rooms text in book hotel page")
	public void the_user_should_see_the_number_of_rooms_text_in_book_hotel_page() {
	    
		String numberOfRoomsText = bookHotel.getNumberOfRoomsText().trim();
		Assert.assertEquals(numberOfRoomsText,"Number of Rooms");
	}
	
	@Then("the user should see the Total Days text in book hotel page")
	public void the_user_should_see_the_total_days_text_in_book_hotel_page() {
	    
		String totalDaysText = bookHotel.getTotalDaysText().trim();
		Assert.assertEquals(totalDaysText,"Total Days");
	}
	@Then("the user should see the Price per Night text in book hotel page")
	public void the_user_should_see_the_price_per_night_text_in_book_hotel_page() {
	   
		String pricePerNightText = bookHotel.getPricePerNightText().trim();
		Assert.assertEquals(pricePerNightText,"Price per Night");
		
	}
	@Then("the user should see the Total Price text in book hotel page")
	public void the_user_should_see_the_total_price_text_in_book_hotel_page() {
	    
		String totalPriceText = bookHotel.getTotalPriceText().trim();
		Assert.assertEquals(totalPriceText,"Total Price");
	}
	@Then("the user should see the GST text in book hotel page")
	public void the_user_should_see_the_gst_text_in_book_hotel_page() {
	    
		String gstText = bookHotel.getGSTText().trim();
		Assert.assertEquals(gstText,"GST");
	}
	
	@Then("the user should see the Final Billed Price text in book hotel page")
	public void the_user_should_see_the_final_billed_price_text_in_book_hotel_page() {
	    
		String finalBilledPriceText = bookHotel.getFinalBilledPriceText().trim();
		Assert.assertEquals(finalBilledPriceText,"Final Billed Price");
	}
	
	@Then("the user should see the First Name text in book hotel page")
	public void the_user_should_see_the_first_name_text_in_book_hotel_page() {
	    
		String firstNameText = bookHotel.getFirstNameText().trim();
		Assert.assertEquals(firstNameText,"First Name*");
	}
	
	@Then("the user should see the Last Name text in book hotel page")
	public void the_user_should_see_the_last_name_text_in_book_hotel_page() {
	    
		String lastNameText = bookHotel.getLastNameText().trim();
		Assert.assertEquals(lastNameText,"Last Name*");
	}
	
	@Then("the user should see the Billing Address text in book hotel page")
	public void the_user_should_see_the_billing_address_text_in_book_hotel_page() {
		
		String billingAddressText = bookHotel.getBillingAddressText().trim();
		Assert.assertEquals(billingAddressText,"Billing Address*");
	}
	
	@Then("the user should see the Credit Card No text in book hotel page")
	public void the_user_should_see_the_credit_card_no_text_in_book_hotel_page() {
	    
		String creditCardNoText = bookHotel.getCreditCardNoText().trim();
		Assert.assertEquals(creditCardNoText,"Credit Card No.*");
	}
	
	@Then("the user should see the Credit Card Type text in book hotel page")
	public void the_user_should_see_the_credit_card_type_text_in_book_hotel_page() {
		
		String creditCardTypeText = bookHotel.getCreditCardTypeText().trim();
		Assert.assertEquals(creditCardTypeText,"Credit Card Type*");
	}
	
	@Then("the user should see the Expiry date text in book hotel page")
	public void the_user_should_see_the_expiry_date_text_in_book_hotel_page() {
		
		String expiryDateText = bookHotel.getExpiryDateText().trim();
		Assert.assertEquals(expiryDateText,"Expiry Date*");
	}
	
	@Then("the user should see the CVV Number text in book hotel page")
	public void the_user_should_see_the_cvv_number_text_in_book_hotel_page() {
	   
		String cvvNumberText = bookHotel.getCvvNumberText().trim();
		Assert.assertEquals(cvvNumberText,"CVV Number*");
	}
	
	@Then("the user should see hotel name in the Book hotel page is same as the hotel selected in the Search Hotel page")
	public void the_user_should_see_hotel_name_in_the_book_hotel_page_is_same_as_the_hotel_selected_in_the_search_hotel_page() {
	    
		String hotelName = bookHotel.getHotelNameInputText();
		Assert.assertEquals(hotelName, testContextSetup.selectedHotel);
	}
	
	@Then("the user should see location in the Book hotel page is same as the location selected in the Search Hotel page")
	public void the_user_should_see_location_in_the_book_hotel_page_is_same_as_the_location_selected_in_the_search_hotel_page() {
	    
		String location = bookHotel.getLocationInputText();
		Assert.assertEquals(location, testContextSetup.selectedLocation);
	}
	
	@Then("the user should see room type in the Book hotel page is same as the rome type selected in the Search Hotel page")
	public void the_user_should_see_room_type_in_the_book_hotel_page_is_same_as_the_rome_type_selected_in_the_search_hotel_page() {
	   
		String roomType = bookHotel.getRoomTypeInputText();
		Assert.assertEquals(roomType, testContextSetup.selectedRoomType);
	}
	
	@Then("the user should see number of rooms in the Book hotel page is same as the number of rooms selected in the Search Hotel page")
	public void the_user_should_see_number_of_rooms_in_the_book_hotel_page_is_same_as_the_number_of_rooms_selected_in_the_search_hotel_page() {
	    
		String numberOfRooms = bookHotel.getNumberOfRoomsInputText();
		Assert.assertEquals(numberOfRooms.split(" ")[0].trim(), testContextSetup.selectedNumberOfRooms.split(" ")[0].trim());
	}
	
	@Then("the user should see total days in the Book hotel page is same as the no of days in the Select Hotel page")
	public void the_user_should_see_total_days_in_the_book_hotel_page_is_same_as_the_no_of_days_in_the_select_hotel_page() {
	    
		//String bookHotelTotalDays = bookHotel.getTotalDaysInputText();
		
		//String selectHotelTotalDays = testContextSetup.NoOfDaysSelectPage;
		//System.out.println(bookHotelTotalDays + " Book Hotel Page total days");
		//System.out.println(selectHotelTotalDays + " Select Hotel Page total days");
		
		
		//bookHotelTotalDays.trim().replace("Day(s)", "Days");
	    //selectHotelTotalDays.trim().replace("Days", "Days");
		
	    //Assert.assertEquals(bookHotelTotalDays, totalNoOfDaysBook);
	    
	String totalDays = bookHotel.getTotalDaysInputText();
	System.out.println(totalDays + " Total days in book hotel page");
	System.out.println(testContextSetup.NoOfDaysSelectPage + "Total days in select hotel page");
	Assert.assertEquals(totalDays.split(" ")[0].trim(), testContextSetup.NoOfDaysSelectPage);
	}
	
	@Then("the user should see price per night in the Book hotel page is same as the price per night in the Select Hotel page")
	public void the_user_should_see_price_per_night_in_the_book_hotel_page_is_same_as_the_price_per_night_in_the_select_hotel_page() {
		
		String pricePerNight = bookHotel.getPricePerNightInputText();
		Assert.assertEquals(pricePerNight, testContextSetup.pricePerNightSelectPage);
		testContextSetup.pricePerNightBookHotelPage = pricePerNight;
	}
	
	
	
	@Then("the user should see total price in the Book hotel page is same as the total price in the Select Hotel page")
	public void the_user_should_see_total_price_in_the_book_hotel_page_is_same_as_the_total_price_in_the_select_hotel_page() {
	    
		String totalPrice = bookHotel.getTotalPriceInputText();
		Assert.assertEquals(totalPrice, testContextSetup.totalPriceSelectPage);
		testContextSetup.totalPriceBookHotelPage = totalPrice;
	}
	
	@Then("the user should see the GST is calculated correctly in Book Hotel page")
	public void the_user_should_see_the_gst_is_calculated_correctly_in_book_hotel_page() {
	    
		String actualGst = bookHotel.getGstInputText();
		testContextSetup.gstBookHotelPage = actualGst;
		
		String actualGstNumeric = actualGst.replaceAll("[^0-9.]", "");  // Remove non-numeric characters
	    double actualGstValue = Double.parseDouble(actualGstNumeric);  // Now parse the numeric value 
	    
		double totalPrice = bookHotel.extractPrice(testContextSetup.totalPriceBookHotelPage); 
		double expectedGST = (totalPrice * 10) / 100;
		
		Assert.assertEquals("AUD $ " +actualGstValue, "AUD $ " +expectedGST);
		
	}
	
	@Then("the user should see the Final Billed Price is calculated correctly in Book Hotel page")
	public void the_user_should_see_the_final_billed_price_is_calculated_correctly_in_book_hotel_page() {
	  
		String actualFinalBilledPrice = bookHotel.getFinalBilledInputText();
		testContextSetup.finalBilledPriceBookHotelPage = actualFinalBilledPrice;
		
		String actualFinalBilledPriceNumeric = actualFinalBilledPrice.replaceAll("[^0-9.]", "");  // Remove non-numeric characters
	    double actualFinalBilledPriceValue = Double.parseDouble(actualFinalBilledPriceNumeric);  // Now parse the numeric value
	    
		double totalPrice = bookHotel.extractPrice(testContextSetup.totalPriceBookHotelPage); 
		double gst = bookHotel.extractPrice(testContextSetup.gstBookHotelPage); 
		double expectedFinalBilledPrice = (totalPrice+gst);
		
		Assert.assertEquals("AUD $ " +actualFinalBilledPriceValue, "AUD $ " +expectedFinalBilledPrice);	
		
	}
	
	@When("the user clicks on the Book Now button in book hotel page")
	public void the_user_clicks_on_the_book_now_button_in_book_hotel_page() {
		
	    bookHotel.clickBookNowButton();
	}
	
	@Then("the user should see the error message next to First Name textbox in book hotel page")
	public void the_user_should_see_the_error_message_next_to_first_name_textbox_in_book_hotel_page() {
	    
		String actualFirstName = bookHotel.getFirstNameErrorMessageText();
		Assert.assertEquals(actualFirstName, "Please Enter your First Name");
	}
	
	@Then("the user should see the error message next to Last Name textbox in book hotel page")
	public void the_user_should_see_the_error_message_next_to_last_name_textbox_in_book_hotel_page() {
	    
		String actualLastName = bookHotel.getLastNameErrorMessageText();
		Assert.assertEquals(actualLastName, "Please Enter you Last Name");
	}
	
	@Then("the user should see the error message next to Billing Address textbox in book hotel page")
	public void the_user_should_see_the_error_message_next_to_billing_address_textbox_in_book_hotel_page() {
	    
		String actualBillingAddress = bookHotel.getBillingAddressErrorMessageText();
		Assert.assertEquals(actualBillingAddress, "Please Enter your Address");
	}
	
	@Then("the user should see the error message next to Credit Card No textbox in book hotel page")
	public void the_user_should_see_the_error_message_next_to_credit_card_no_textbox_in_book_hotel_page() {
	    
		String actualCreditCardNo = bookHotel.getCreditCardNoErrorMessageText();
		Assert.assertEquals(actualCreditCardNo, "Please Enter your 16 Digit Credit Card Number");
	}
	
	@Then("the user should see the error message next to Credit Card Type dropdown in book hotel page")
	public void the_user_should_see_the_error_message_next_to_credit_card_type_dropdown_in_book_hotel_page() {
	   
		String actualCreditCardType = bookHotel.getCreditCardTypeErrorMessageText();
		Assert.assertEquals(actualCreditCardType, "Please Select your Credit Card Type");
	}
	
	@Then("the user should see the error message next to Expiry Date dropdown in book hotel page")
	public void the_user_should_see_the_error_message_next_to_expiry_date_dropdown_in_book_hotel_page() {
		
		String actualExpiryDate = bookHotel.getExpiryDateErrorMessageText();
		Assert.assertEquals(actualExpiryDate, "Please Select your Credit Card Expiry Month");
	}
	
	@Then("the user should see the error message next to CVV Number dropdown in book hotel page")
	public void the_user_should_see_the_error_message_next_to_cvv_number_dropdown_in_book_hotel_page() {
	    
		String actualCvvNumber = bookHotel.getCvvNumberErrorMessageText();
		Assert.assertEquals(actualCvvNumber, "Please Enter your Credit Card CVV Number");
	}
	
	@When("the user enters the First Name {string} and Last Name {string}")
	public void the_user_enters_the_first_name_and_last_name(String firstname, String lastname) {
	    
		bookHotel.setFirstName(firstname);
		bookHotel.setLastName(lastname);
	}
	
	@When("the user enters the Billing Address {string}")
	public void the_user_enters_the_billing_address(String address) {
	    
		bookHotel.setBillingAddress(address);
	}
	
	@When("the user enters the Credit Card No {string}")
	public void the_user_enters_the_credit_card_no(String creditCardNo) {
	    
		bookHotel.setCreditCardNo(creditCardNo);
	}
	
	@When("the user enters the CVV Number {string}")
	public void the_user_enters_the_cvv_number(String cvvNumber) {
	    
		bookHotel.setCvvNumber(cvvNumber);
	}
	@When("the user selects the values for the dropdowns in book hotel page:")
	public void the_user_selects_the_values_for_the_dropdowns_in_book_hotel_page(io.cucumber.datatable.DataTable dataTable) {
	     // Get the data from the table
        String creditCardType = dataTable.cell(1, 0);
        String expiryMonth = dataTable.cell(1, 1);
        String expiryYear = dataTable.cell(1, 2);
       
        // Select values from the dropdowns
        bookHotel.selectCreditCardType(creditCardType);
        bookHotel.selectExpiryMonth(expiryMonth);
        bookHotel.selectExpiryYear(expiryYear);
	}
	@Then("the user should navigate to the Booking Confirm page")
	public void the_user_should_navigate_to_the_booking_confirm_page() throws InterruptedException {
	    
		Thread.sleep(5000);
		String actualTitle = testContextSetup.driver.getTitle();
		Assert.assertEquals(actualTitle, "Adactin.com - Hotel Booking Confirmation");
	}
	
	@When("the user clicks on Cancel button in book hotel page")
	public void the_user_clicks_on_cancel_button_in_book_hotel_page() {
	   
		bookHotel.clickCancelButton();
	}
	
	@When("the user clicks on back link in book hotel page")
	public void the_user_clicks_on_back_link_in_book_hotel_page() {
	    
		bookHotel.clickBackLink();
	}

	@When("the user clicks on Booked Itinerary link in book hotel page")
	public void the_user_clicks_on_booked_itinerary_link_in_book_hotel_page() {
	    
		bookHotel.clickBookedItineraryLink();
	}
	
	@When("the user clicks on Search Hotel link in book hotel page")
	public void the_user_clicks_on_search_hotel_link_in_book_hotel_page() {
	    
		bookHotel.clickSearchHotelLink();
	}
	
	@When("the user clicks on Change Password link in book hotel page")
	public void the_user_clicks_on_change_password_link_in_book_hotel_page() {
	   
		bookHotel.clickChangePasswordLink();
	}
	
	@When("the user clicks on Logout link in book hotel page")
	public void the_user_clicks_on_logout_link_in_book_hotel_page() {
	    
		bookHotel.clickLogoutLink();
	}
}
