package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotelPage {
	
	WebDriver driver;
	
	//Constructor
	
	public SearchHotelPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	
		@FindBy(xpath="//img[@alt='Adactin Group']") WebElement img_logo;
		@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[1]") WebElement text_welcome;
		@FindBy(xpath="//*[@id='search_form']/table/tbody/tr[1]/td") WebElement text_searchHotel;
		@FindBy(xpath="//input[@id='username_show']") WebElement text_helloUserName;
		@FindBy(xpath="//*[@id='search_form']/table/tbody/tr[2]/td[1]") WebElement text_location;
		@FindBy(xpath="//*[@id='search_form']/table/tbody/tr[3]/td[1]") WebElement text_hotels;
		@FindBy(xpath="//*[@id='search_form']/table/tbody/tr[4]/td[1]") WebElement text_roomType;
		@FindBy(xpath="//*[@id='search_form']/table/tbody/tr[5]/td[1]") WebElement text_numberOfRooms;
		@FindBy(xpath="//*[@id='search_form']/table/tbody/tr[6]/td[1]") WebElement text_checkInDate;
		@FindBy(xpath="//*[@id='search_form']/table/tbody/tr[7]/td[1]") WebElement text_checkOutDate;
		@FindBy(xpath="//*[@id='search_form']/table/tbody/tr[8]/td[1]") WebElement text_adultsPerRoom;
		@FindBy(xpath="//*[@id='search_form']/table/tbody/tr[9]/td[1]") WebElement text_childrenPerRoom;
		@FindBy(xpath="//select[@id='location']") WebElement dropdown_location;
		@FindBy(xpath="//select[@id='hotels']") WebElement dropdown_hotels;
		@FindBy(xpath="//select[@id='room_type']") WebElement dropdown_roomType;
		@FindBy(xpath="//select[@id='room_nos']") WebElement dropdown_numberOfRooms;
		@FindBy(xpath="//select[@id='adult_room']") WebElement dropdown_adultPerRoom;
		@FindBy(xpath="//select[@id='child_room']") WebElement dropdown_childrenPerRoom;
		@FindBy(xpath="//input[@name='datepick_in']") WebElement textbox_checkInDate;
		@FindBy(xpath="//input[@name='datepick_out']") WebElement textbox_checkOutDate;
		@FindBy(xpath="//input[@id='Submit']") WebElement btn_search;
		@FindBy(xpath="//input[@id='Reset']") WebElement btn_reset;
		@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[1]") WebElement link_searchHotel;
		@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[2]") WebElement link_bookItinerary;
		@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[3]") WebElement link_changePassword;
		@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[4]") WebElement link_logout;
		@FindBy(xpath="/html/body/table[3]/tbody/tr[2]/td") WebElement text_footer;
		@FindBy(xpath="//span[@id='location_span']") WebElement text_locationErrorMesage;
		@FindBy(xpath="//span[@id='checkin_span']") WebElement text_checkInErrorMesage;
		@FindBy(xpath="//span[@id='checkout_span']") WebElement text_checkOutErrorMesage;
		
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
		
		public String getSearchHotelText()
		{
			return text_searchHotel.getText();
		}
		
		public String getHelloUserNameText()
		{
			return text_helloUserName.getDomProperty("value");
		}
		
		public String getLocationText()
		{
			return text_location.getText();
		}
		
		public String getHotelsText()
		{
			return text_hotels.getText();
		}
		
		public String getRoomTypeText()
		{
			return text_roomType.getText();
		}
		
		public String getNumberOfRoomsText()
		{
			return text_numberOfRooms.getText();
		}
		
		public String getCheckInDateText()
		{
			return text_checkInDate.getText();
		}
		
		public String getCheckOutDateText()
		{
			return text_checkOutDate.getText();
		}
		
		public String getAdultsPerRoomText()
		{
			return text_adultsPerRoom.getText();
		}
		
		public String getChildrenPerRoomText()
		{
			return text_childrenPerRoom.getText();
		}
		
	    public String getLocation() {
	        return new Select(dropdown_location).getFirstSelectedOption().getText();
	    }

	    public String getHotels() {
	        return new Select(dropdown_hotels).getFirstSelectedOption().getText();
	    }

	    public String getRoomType() {
	        return new Select(dropdown_roomType).getFirstSelectedOption().getText();
	    }

	    public String getNumberOfRooms() {
	        return new Select(dropdown_numberOfRooms).getFirstSelectedOption().getText();
	    }

	    public String getAdultsPerRoom() {
	        return new Select(dropdown_adultPerRoom).getFirstSelectedOption().getText();
	    }

	    public String getChildrenPerRoom() {
	        return new Select(dropdown_childrenPerRoom).getFirstSelectedOption().getText();
	    }
		
		public void clickLocationDropdown()
		{
			dropdown_location.click();
		}
		
		public void clickHotelsDropdown()
		{
			dropdown_hotels.click();
		}
		
		public void clickRoomTypeDropdown()
		{
			dropdown_roomType.click();
		}
		
		public void clickNumberOfRoomsDropdown()
		{
			text_numberOfRooms.click();
		}
		
		public void clickAdultPerRoomDropdown()
		{
			dropdown_adultPerRoom.click();
		}
		
		public void clickChildrenPerRoomDropdown()
		{
			dropdown_childrenPerRoom.click();
		}
		
		public List<WebElement> getLocationList()
		{
			WebElement locationDropdown = dropdown_location;
			Select locationDropdownOptions = new Select(locationDropdown);
			return locationDropdownOptions.getOptions();
		}
		
		public List<WebElement> getHotelsList()
		{
			WebElement hotelDropdown = dropdown_hotels;
			Select hotelDropdownOptions = new Select(hotelDropdown);
			return hotelDropdownOptions.getOptions();
		}
		
		public List<WebElement> getRoomTypeList()
		{
			WebElement roomTypeDropdown = dropdown_roomType;
			Select roomTypeDropdownOptions = new Select(roomTypeDropdown);
			return roomTypeDropdownOptions.getOptions();
		}
		
		public List<WebElement> getNumberOfRoomsList()
		{
			WebElement numberOfRoomsDropdown = dropdown_numberOfRooms;
			Select numberOfRoomsDropdownOptions = new Select(numberOfRoomsDropdown);
			return numberOfRoomsDropdownOptions.getOptions();
		}
		
		public List<WebElement> getAdultPerRoomList()
		{
			WebElement adultPerRoomDropdown = dropdown_adultPerRoom;
			Select adultPerRoomDropdownOptions = new Select(adultPerRoomDropdown);
			return adultPerRoomDropdownOptions.getOptions();
		}
		
		public List<WebElement> getChildrenPerRoomList()
		{
			WebElement childrenPerRoomDropdown = dropdown_childrenPerRoom;
			Select childrenPerRoomDropdownOptions = new Select(childrenPerRoomDropdown);
			return childrenPerRoomDropdownOptions.getOptions();
		}
		
		
		public String getCheckInDate()
		{
			return textbox_checkInDate.getDomProperty("value");
			
		}
		
		public String getCheckOutDate()
		{
			return textbox_checkOutDate.getDomProperty("value");
			
		}
		
		public void clearCheckInDate()
		{
			textbox_checkInDate.clear();
		}
		
		
		public void clearCheckOutDate()
		{
			textbox_checkOutDate.clear();
		}
		
		
		public void clickSearchButton()
		{
			btn_search.click();
		}
		
		public void clickResetButton()
		{
			btn_reset.click();
		}
		
		public void clickSearchHotelLink()
		{
			link_searchHotel.click();
		}
		
		public void clickBookedItineraryLink()
		{
			link_bookItinerary.click();
		}
		
		public void clickChangePasswordLink()
		{
			link_changePassword.click();
		}
	
		
		public void clickLogoutLink()
		{
			link_logout.click();
		}
		
		public String getFooterMessageText()
		{
			return text_footer.getText();
		}
		
	
		public String getLocationErrorMesageText()
		{
			return text_locationErrorMesage.getText();
		}
		
		public String getCheckInErrorMesageText()
		{
			return text_checkInErrorMesage.getText();
		}
		
		public String getCheckOutErrorMesageText()
		{
			return text_checkOutErrorMesage.getText();
		}
		
		
		public void selectLocation(String location) {
	        new Select(dropdown_location).selectByVisibleText(location);
	    }

	    public void selectHotel(String hotel) {
	        new Select(dropdown_hotels).selectByVisibleText(hotel);
	    }

	    public void selectRoomType(String roomType) {
	        new Select(dropdown_roomType).selectByVisibleText(roomType);
	    }

	    public void selectNumberOfRooms(String numberOfRooms) {
	        new Select(dropdown_numberOfRooms).selectByVisibleText(numberOfRooms);
	    }

	    public void selectAdultsPerRoom(String adultsPerRoom) {
	        new Select(dropdown_adultPerRoom).selectByVisibleText(adultsPerRoom);
	    }

	    public void selectChildrenPerRoom(String childrenPerRoom) {
	        new Select(dropdown_childrenPerRoom).selectByVisibleText(childrenPerRoom);
	    }

	    // Methods to enter the dates
	    public void enterCheckInDate(String checkInDate) {
	    	textbox_checkInDate.clear();
	        textbox_checkInDate.sendKeys(checkInDate);
	    }

	    public void enterCheckOutDate(String checkOutDate) {
	    	textbox_checkOutDate.clear();
	        textbox_checkOutDate.sendKeys(checkOutDate);
	    }
	    
	    
}		

