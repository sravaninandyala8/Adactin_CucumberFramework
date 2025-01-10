package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPage {
	
public WebDriver driver;
	
	//Constructor
	
	public BookingConfirmationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Locators
	
	@FindBy(xpath="//img[@alt='Adactin Group']") WebElement img_logo;
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[1]") WebElement text_welcome;
	@FindBy(xpath="//*[@id='booking_form']/table/tbody/tr[1]/td") WebElement text_bookingText;
	@FindBy(xpath="//input[@id='username_show']") WebElement text_helloUserName;
	
	@FindBy(xpath="//*[@id='booking_form']/table/tbody/tr[2]/td[1]") WebElement text_hotelName;
	@FindBy(xpath="//*[@id='booking_form']/table/tbody/tr[3]/td[1]") WebElement text_location;
	@FindBy(xpath="//*[@id='booking_form']/table/tbody/tr[4]/td[1]") WebElement text_roomType;
	@FindBy(xpath="//*[@id='booking_form']/table/tbody/tr[5]/td[1]") WebElement text_arrivalDate;
	@FindBy(xpath="//*[@id='booking_form']/table/tbody/tr[7]/td[1]") WebElement text_departureDate;
	@FindBy(xpath="//*[@id='booking_form']/table/tbody/tr[8]/td[1]") WebElement text_totalRooms;
	@FindBy(xpath="//*[@id='booking_form']/table/tbody/tr[9]/td[1]") WebElement text_adultsPerRoom;
	@FindBy(xpath="//*[@id='booking_form']/table/tbody/tr[10]/td[1]") WebElement text_childrenPerRoom;
	@FindBy(xpath="//*[@id='booking_form']/table/tbody/tr[11]/td[1]") WebElement text_pricePerNight;
	@FindBy(xpath="//*[@id='booking_form']/table/tbody/tr[12]/td[1]") WebElement text_totalPrice;
	@FindBy(xpath="//*[@id='booking_form']/table/tbody/tr[13]/td[1]") WebElement text_gst;
	@FindBy(xpath="//*[@id='booking_form']/table/tbody/tr[14]/td[1]") WebElement text_finalBilledPrice;
	@FindBy(xpath="//*[@id='booking_form']/table/tbody/tr[15]/td[1]") WebElement text_firstName;
	@FindBy(xpath="//*[@id='booking_form']/table/tbody/tr[16]/td[1]") WebElement text_lastName;
	@FindBy(xpath="//*[@id='booking_form']/table/tbody/tr[17]/td[1]") WebElement text_billingAddress;
	@FindBy(xpath="//*[@id='booking_form']/table/tbody/tr[18]/td[1]") WebElement text_orderNo;

	@FindBy(xpath="//*[@id='hotel_name']") WebElement textbox_hotelName;
	@FindBy(xpath="//*[@id='location']") WebElement textbox_location;
	@FindBy(xpath="//*[@id='room_type']") WebElement textbox_roomType;
	@FindBy(xpath="//*[@id='arrival_date']") WebElement textbox_arrivalDate;
	@FindBy(xpath="//*[@id='departure_text']") WebElement textbox_departureDate;
	
	@FindBy(xpath="//*[@id='total_rooms']") WebElement textbox_totalRooms;
	@FindBy(xpath="//*[@id='adults_room']") WebElement textbox_adultsPerRoom;
	@FindBy(xpath="//*[@id='children_room']") WebElement textbox_childrenPerRoom;
	@FindBy(xpath="//*[@id='price_night']") WebElement textbox_pricePerNight;
	@FindBy(xpath="//*[@id='total_price']") WebElement textbox_TotalPrice;
	@FindBy(xpath="//*[@id='gst']") WebElement textbox_gst;
	@FindBy(xpath="//*[@id='final_price']") WebElement textbox_finalBilledPrice;
	@FindBy(xpath="//*[@id='first_name']") WebElement textbox_firstName;
	@FindBy(xpath="//*[@id='last_name']") WebElement textbox_lastName;
	@FindBy(xpath="//*[@id='address']") WebElement textbox_address;
	@FindBy(xpath="//*[@id='order_no']") WebElement textbox_OrderNo;
	
	@FindBy(xpath="//input[@id='search_hotel']") WebElement btn_searchHotel;
	@FindBy(xpath="//input[@id='my_itinerary']") WebElement btn_myItinerary;
	@FindBy(xpath="//input[@id='logout']") WebElement btn_logout;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[1]") WebElement link_searchHotel;
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[2]") WebElement link_bookedItinerary;
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[3]") WebElement link_changePassword;
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[4]") WebElement link_logout;
	
	@FindBy(xpath="/html/body/table[3]/tbody/tr[2]/td") WebElement text_footer;
	
	public boolean getLogo()
	{
		return img_logo.isDisplayed();
	}
	
	public String getWelcomeText()
	{
		return text_welcome.getText();

	}
	
	public String getBookingText()
	{
		return text_bookingText.getText();

	}
	
	public String getHelloUserNameText()
	{
		return text_helloUserName.getDomProperty("value");

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
	
	public String getArrivalDateText()
	{
		return text_arrivalDate.getText();

	}
	
	public String getDepartureDateText()
	{
		return text_departureDate.getText();

	}
	
	public String getTotalRoomsText()
	{
		return text_totalRooms.getText();

	}
	
	public String getAdultsPerRoomText()
	{
		return text_adultsPerRoom.getText();

	}
	
	public String getChildrenPerRoomText()
	{
		return text_childrenPerRoom.getText();

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
	
	public String getOrderNoText()
	{
		return text_orderNo.getText();

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
	public String getArrivalDateInputText()
	{
		return textbox_arrivalDate.getDomProperty("value");

	}
	public String getDepartureDateInputText()
	{
		return textbox_departureDate.getDomProperty("value");

	}
	public String getTotalRoomsInputText()
	{
		return textbox_totalRooms.getDomProperty("value");

	}
	public String getChildrenPerRoomInputText()
	{
		return textbox_childrenPerRoom.getDomProperty("value");

	}
	public String getPricePerNightInputText()
	{
		return textbox_pricePerNight.getDomProperty("value");

	}
	
	public String getTotalPriceInputText()
	{
		return textbox_TotalPrice.getDomProperty("value");

	}
	
	public String getGSTInputText()
	{
		return textbox_gst.getDomProperty("value");

	}
	
	public String getFinalBilledPriceInputText()
	{
		return textbox_finalBilledPrice.getDomProperty("value");

	}
	
	public String getFirstNameInputText()
	{
		return textbox_firstName.getDomProperty("value");

	}
	
	public String getLastNameInputText()
	{
		return textbox_lastName.getDomProperty("value");

	}
	
	public String getBilledAddressPerRoomInputText()
	{
		return textbox_address.getDomProperty("value");

	}
	
	public boolean getOrderNoInputText()
	{
		return textbox_OrderNo.isDisplayed();

	}
	
	public String getFooterText()
	{
		return text_footer.getText();

	}
	
	public String getAdultsPerRoomInputText()
	{
		return textbox_adultsPerRoom.getDomProperty("value");

	}
	
	public void clickSearchHotelButton()
	{
		btn_searchHotel.click();
	}
	
	public void clickMyItineraryButton()
	{
		btn_myItinerary.click();
	}
	public void clickLogoutButton()
	{
		btn_logout.click();
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
	
}
