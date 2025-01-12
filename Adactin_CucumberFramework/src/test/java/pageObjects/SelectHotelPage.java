package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.shaded.messages.types.Duration;




public class SelectHotelPage {
	
WebDriver driver;
	
	//Constructor
	
	public SelectHotelPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators

	@FindBy(xpath="//img[@alt='Adactin Group']") WebElement img_logo;
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[1]") WebElement text_welcome;
	@FindBy(xpath="//*[@id='select_form']/table/tbody/tr[1]/td") WebElement text_selectHotel;
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2][text()='Hello Username! ']") WebElement text_helloUserName;
	@FindBy(xpath="//*[@id='select_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[1]") WebElement text_select;
	@FindBy(xpath="//*[@id='select_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]") WebElement text_hotelName;
	@FindBy(xpath="//*[@id='select_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[3]") WebElement text_location;
	@FindBy(xpath="//*[@id='select_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[4]") WebElement text_rooms;
	@FindBy(xpath="//*[@id='select_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[5]") WebElement text_arrivalDate;
	@FindBy(xpath="//*[@id='select_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[6]") WebElement text_departureDate;
	@FindBy(xpath="//*[@id='select_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[7]") WebElement text_noOfDays;
	@FindBy(xpath="//*[@id='select_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[8]") WebElement text_roomsType;
	@FindBy(xpath="//*[@id='select_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[9]") WebElement text_pricePerNight;
	@FindBy(xpath="//*[@id='select_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[10]") WebElement text_totalPrice;
	@FindBy(xpath="//*[@id='select_form']/table/tbody/tr[2]/td/table/tbody/tr[position()>1]/td[1]") List<WebElement> col_radioButtons;
	@FindBy(xpath="//*[@id='location_0']") WebElement col_location;
	@FindBy(xpath="//*[@id='rooms_0']") WebElement col_rooms;
	@FindBy(xpath="//*[@id='hotel_name_0']") WebElement col_hotelName;
	@FindBy(xpath="//*[@id='arr_date_0']") WebElement col_arrivalDate;
	@FindBy(xpath="//*[@id='dep_date_0']") WebElement col_departureDate;
	@FindBy(xpath="//input[@id='no_days_0']") WebElement col_noOfDays;
	@FindBy(xpath="//*[@id='room_type_0']") WebElement col_roomType;
	@FindBy(xpath="//*[@id='price_night_0']") WebElement col_pricePerNight;
	@FindBy(xpath="//*[@id='total_price_0']") WebElement col_totalPrice;
	@FindBy(xpath="//*[@id='radiobutton_0']") WebElement btn_radio;
	@FindBy(xpath="//input[@name='continue']") WebElement btn_continue;
	@FindBy(xpath="//input[@name='cancel']") WebElement btn_cancel;
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[1]") WebElement link_searchHotel;
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[2]") WebElement link_bookedItinerary;
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[3]") WebElement link_changePassword;
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[4]") WebElement link_logout;
	@FindBy(xpath="/html/body/table[3]/tbody/tr[2]/td") WebElement text_footer;
	
	
	//Action Methods
	
	public boolean getLogo()
	{
		WebElement logo = img_logo;
		return logo.isDisplayed();
	}
	
	public String getWelcomeText()
	{
		return text_welcome.getText();
	}
	
	public String getSelectHotelText()
	{
		return text_selectHotel.getText();
	}
	
	public String getHelloUserNameText()
	{
		
		String fullText =  text_helloUserName.getText();
		String username = fullText.split(" ")[0] + " " + fullText.split(" ")[1];
		return username;
	}
	
	public String getFooterMessageText()
	{
		return text_footer.getText();
	}
	
	public String getSelectText()
	{
		return text_select.getText();
	}
	
	
	public String getHotelNameText()
	{
		return text_hotelName.getText();
	}
	
	public String getLocationText()
	{
		return text_location.getText();
	}
	 
	public String getRoomsText()
	{
		return text_rooms.getText();
	}
	
	public String getArrivalDateText()
	{
		return text_arrivalDate .getText();
	}
	
	public String getDepartureDateText()
	{
		return text_departureDate.getText();
	}
	
	public String getNoOfDaysText()
	{
		return text_noOfDays.getText();
	}
	
	public String getRoomsTypeText()
	{
		return text_roomsType.getText();
	}
	
	public String getPricePerNightText()
	{
		return text_pricePerNight.getText();
	}
	
	public String getTotalPriceText()
	{
		return text_totalPrice.getText();
	}
	
	 // Method to check if all radio buttons are displayed
    public boolean areRadioButtonsDisplayed() {
        List<WebElement> radioBtns = col_radioButtons;
        return !radioBtns.isEmpty(); // Return true if radio buttons are found
    }
    
    public String getHotelNameDisplayed() {
    	String hotelName = col_hotelName.getDomProperty("value");
        return hotelName;
    }
    
    public String getLocationDisplayed() {
    	String location = col_location.getDomProperty("value");
        return location;
    }
    
    public String getRoomsDisplayed() {
    	String rooms = col_rooms.getDomProperty("value");
        return rooms;
    }
    
    public String getArrivalDateDisplayed() {
    	String arrivalDate = col_arrivalDate.getDomProperty("value");
        return arrivalDate;
    }
    
    public String getDepartureDateDisplayed() {
    	String departureDate = col_departureDate.getDomProperty("value");
        return departureDate;
    }
    
    public String getNoOfDaysDisplayed() {
    	String noOfDays = col_noOfDays.getDomProperty("value");
        return noOfDays;
    }
    
    public String getRoomTypeDisplayed() {
    	String roomType = col_roomType.getDomProperty("value");
        return roomType;
    }
    
    public String  getPricePerNightDisplayed() {
    	String pricePerNight = col_pricePerNight.getDomProperty("value");
        return pricePerNight;
    }
    
    public String getTotalPriceDisplayed() {
    	
    	String totalPrice = col_totalPrice.getDomProperty("value");
    	return totalPrice;
    }

	public void clickRadioButton()
	{
		btn_radio.click();
	}
    
	public void clickContinueButton()
	{
		btn_continue.click();
	}
	public void clickCancelButton()
	{
		btn_cancel.click();
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
