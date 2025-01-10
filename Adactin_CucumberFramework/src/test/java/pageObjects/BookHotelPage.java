package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookHotelPage {
	
WebDriver driver;
	
	//Constructor
	
	public BookHotelPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	
			@FindBy(xpath="//img[@alt='Adactin Group']") WebElement img_logo;
			@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[1]") WebElement text_welcome;
			@FindBy(xpath="//*[@id=\"book_hotel_form\"]/table/tbody/tr[2]/td") WebElement text_bookHotel;
			@FindBy(xpath="//input[@id='username_show']") WebElement text_helloUserName;
			
			@FindBy(xpath="//*[@id='book_hotel_form']/table/tbody/tr[3]/td[1]") WebElement text_hotelName;
			@FindBy(xpath="//*[@id='book_hotel_form']/table/tbody/tr[4]/td[1]") WebElement text_location;
			@FindBy(xpath="//*[@id='book_hotel_form']/table/tbody/tr[5]/td[1]") WebElement text_roomType;
			@FindBy(xpath="//*[@id='book_hotel_form']/table/tbody/tr[6]/td[1]") WebElement text_numberOfRooms;
			@FindBy(xpath="//*[@id='book_hotel_form']/table/tbody/tr[7]/td[1]") WebElement text_totalDays;
			@FindBy(xpath="//*[@id='book_hotel_form']/table/tbody/tr[8]/td[1]") WebElement text_pricePerNight;
			@FindBy(xpath="//*[@id='book_hotel_form']/table/tbody/tr[9]/td[1]") WebElement text_totalPrice;
			@FindBy(xpath="//*[@id='book_hotel_form']/table/tbody/tr[10]/td[1]") WebElement text_gst;
			@FindBy(xpath="//*[@id='book_hotel_form']/table/tbody/tr[11]/td[1]") WebElement text_finalBilledPrice;
			@FindBy(xpath="//*[@id='book_hotel_form']/table/tbody/tr[12]/td[1]") WebElement text_firstName;
			@FindBy(xpath="//*[@id='book_hotel_form']/table/tbody/tr[13]/td[1]") WebElement text_lastName;
			@FindBy(xpath="//*[@id='book_hotel_form']/table/tbody/tr[14]/td[1]") WebElement text_billingAddress;
			@FindBy(xpath="//*[@id='book_hotel_form']/table/tbody/tr[15]/td[1]") WebElement text_creditCardNo;
			@FindBy(xpath="//*[@id='book_hotel_form']/table/tbody/tr[16]/td[1]") WebElement text_creditCardType;
			@FindBy(xpath="//*[@id='book_hotel_form']/table/tbody/tr[17]/td[1]") WebElement text_expiryDate;
			@FindBy(xpath="//*[@id='book_hotel_form']/table/tbody/tr[18]/td[1]") WebElement text_cvvNumber;
			
			@FindBy(xpath="//*[@id='hotel_name_dis']") WebElement textbox_hotelName;
			@FindBy(xpath="//*[@id='location_dis']") WebElement textbox_location;
			@FindBy(xpath="//*[@id='room_type_dis']") WebElement textbox_roomType;
			@FindBy(xpath="//*[@id='room_num_dis']") WebElement textbox_numberOfRooms;
			@FindBy(xpath="//*[@id='total_days_dis']") WebElement textbox_totalDays;
			@FindBy(xpath="//*[@id='price_night_dis']") WebElement textbox_pricePerNight;
			@FindBy(xpath="//*[@id='total_price_dis']") WebElement textbox_TotalPrice;
			@FindBy(xpath="//*[@id='gst_dis']") WebElement textbox_gst;
			@FindBy(xpath="//*[@id='final_price_dis']") WebElement textbox_finalBilledPrice;
			@FindBy(xpath="//*[@id='first_name']") WebElement textbox_firstName;
			@FindBy(xpath="//*[@id='last_name']") WebElement textbox_lastName;
			@FindBy(xpath="//*[@id='address']") WebElement textbox_address;
			@FindBy(xpath="//*[@id='cc_num']") WebElement textbox_creditCardNumber;
			@FindBy(xpath="//*[@id='cc_cvv']") WebElement textbox_cvvNumber;
			
			@FindBy(xpath="//select[@id='cc_type']") WebElement dropdown_creditCardType;
			@FindBy(xpath="//select[@id='cc_exp_month']") WebElement dropdown_expiryMonth;
			@FindBy(xpath="//select[@id='cc_exp_year']") WebElement dropdown_expiryYear;
			
			@FindBy(xpath="//input[@id='book_now']") WebElement btn_bookNow;
			@FindBy(xpath="//input[@id='cancel']") WebElement btn_cancel;
			
			@FindBy(xpath="//*[@id='book_hotel_form']/table/tbody/tr[1]/td/a") WebElement link_back;
			@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[1]") WebElement link_searchHotel;
			@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[2]") WebElement link_bookedItinerary;
			@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[3]") WebElement link_changePassword;
			@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[4]") WebElement link_logout;
			
			@FindBy(xpath="/html/body/table[3]/tbody/tr[2]/td") WebElement text_footer;
			
			@FindBy(xpath="//*[@id='first_name_span']") WebElement text_firstNameErrorMessage;
			@FindBy(xpath="//*[@id='last_name_span']") WebElement text_lastNameErrorMessage;
			@FindBy(xpath="//*[@id='address_span']") WebElement text_addressErrorMessage;
			@FindBy(xpath="//*[@id='cc_num_span']") WebElement text_creditCardNoErrorMessage;
			@FindBy(xpath="//*[@id='cc_type_span']") WebElement text_creditCardTypeErrorMessage;
			@FindBy(xpath="//*[@id='cc_expiry_span']") WebElement text_expiryDateErrorMessage;
			@FindBy(xpath="//*[@id='cc_cvv_span']") WebElement text_cvvNumberErrorMessage;
			
			
			public String getWelcomeText()
			{
				return text_welcome.getText();
			}
			
			public boolean getLogo()
			{
				return img_logo.isDisplayed();
			}
			
			public String getBookHotelText()
			{
				return text_bookHotel.getText();
			}
			
			public String getHelloUsernameText()
			{
				return text_helloUserName.getDomProperty("value");
			}
			
			public String getFooterText()
			{
				return text_footer.getText();
			}
			
			public String getHotelNameText()
			{
				return text_hotelName.getText();
			}
			
			public String getLocationText()
			{
				return text_location.getText();
			}
			
			public String getRoomTypeText()
			{
				return text_roomType.getText();
			}
			
			public String getNumberOfRoomsText()
			{
				return text_numberOfRooms.getText();
			}
			
			public String getTotalDaysText()
			{
				return text_totalDays.getText();
			}
			
			public String getPricePerNightText()
			{
				return text_pricePerNight.getText();
			}
			
			public String getTotalPriceText()
			{
				return text_totalPrice.getText();
			}
			
			public String getGSTText()
			{
				return text_gst.getText();
			}
			
			public String getFinalBilledPriceText()
			{
				return text_finalBilledPrice.getText();
			}
			
			public String getFirstNameText()
			{
				return text_firstName.getText();
			}
			
			public String getLastNameText()
			{
				return text_lastName.getText();
			}
			
			public String getBillingAddressText()
			{
				return text_billingAddress.getText();
			}
			
			public String getCreditCardNoText()
			{
				return text_creditCardNo.getText();
			}
			
			public String getCreditCardTypeText()
			{
				return text_creditCardType.getText();
			}
			
			public String getExpiryDateText()
			{
				return text_expiryDate.getText();
			}
			
			public String getCvvNumberText()
			{
				return text_cvvNumber.getText();
			}
			
			public String getHotelNameInputText()
			{
				return textbox_hotelName.getDomProperty("value");
			}
			
			public String getLocationInputText()
			{
				return textbox_location.getDomProperty("value");
			}
			
			public String getRoomTypeInputText()
			{
				return textbox_roomType.getDomProperty("value");
			}
			
			public String getNumberOfRoomsInputText()
			{
				return textbox_numberOfRooms.getDomProperty("value");
			}
			
			public String getTotalDaysInputText()
			{
				return textbox_totalDays.getDomProperty("value");
			}
			
			public String getPricePerNightInputText()
			{
				return textbox_pricePerNight.getDomProperty("value");
			}
			
			public String getTotalPriceInputText()
			{
				return textbox_TotalPrice.getDomProperty("value");
			}
			
			public String getGstInputText()
			{
				return textbox_gst.getDomProperty("value");
			}
			
			public String getFinalBilledInputText()
			{
				return textbox_finalBilledPrice.getDomProperty("value");
			}
			
			 // Method to extract numeric value from price string
		    public double extractPrice(String priceWithText) {
		        // Remove non-numeric characters and parse the number
		        return Double.parseDouble(priceWithText.replaceAll("[^0-9.]", ""));
		    }
		    
		    public void clickBookNowButton() 
		    {
		    	btn_bookNow.click();
		    }
		    
		    public void clickCancelButton()
		    {
		    	btn_cancel.click();
		    }
		    
		    public void clickBackLink()
		    {
		    	link_back.click();
		    }
		    
		    public void clickSearchHotelLink()
		    {
		    	link_searchHotel.click();
		    }
		    
		    public void clickBookedItineraryLink()
		    {
		    	link_bookedItinerary.click();
		    }
		    
		    public void clickChangePasswordLink()
		    {
		    	link_changePassword.click();
		    }
		    
		    public void clickLogoutLink()
		    {
		    	link_logout.click();
		    }
		    
		    public String getFirstNameErrorMessageText()
			{
				return text_firstNameErrorMessage.getText();
			}
		    
		    public String getLastNameErrorMessageText()
			{
				return text_lastNameErrorMessage.getText();
			}
		    
		    public String getBillingAddressErrorMessageText()
			{
				return text_addressErrorMessage.getText();
			}
		    
		    public String getCreditCardNoErrorMessageText()
			{
				return text_creditCardNoErrorMessage.getText();
			}
		    
		    public String getCreditCardTypeErrorMessageText()
			{
				return text_creditCardTypeErrorMessage.getText();
			}
		    
		    public String getExpiryDateErrorMessageText()
			{
				return text_expiryDateErrorMessage.getText();
			}
		    
		    public String getCvvNumberErrorMessageText()
			{
				return text_cvvNumberErrorMessage.getText();
			}
		    
		    public void setFirstName(String firstname)
			{
				textbox_firstName.sendKeys(firstname);
			}
			
			public void setLastName(String lastname)
			{
				textbox_lastName.sendKeys(lastname);
			}
			
			public void setBillingAddress(String billingAddress)
			{
				textbox_address.sendKeys(billingAddress);
			}
			
			public void setCreditCardNo(String creditCardNo)
			{
				textbox_creditCardNumber.sendKeys(creditCardNo);
			}
			
			public void setCvvNumber(String cvvNumber)
			{
				textbox_cvvNumber.sendKeys(cvvNumber);
			}
			
			public void selectCreditCardType(String creditCardType) {
		        new Select(dropdown_creditCardType).selectByVisibleText(creditCardType);
		    }
			
			public void selectExpiryMonth(String expiryMonth) {
		        new Select(dropdown_expiryMonth).selectByVisibleText(expiryMonth);
		    }
			
			public void selectExpiryYear(String expiryYear) {
		        new Select(dropdown_expiryYear).selectByVisibleText(expiryYear);
		    }
			
}
