package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItineraryPage {

WebDriver driver;
	
	//Constructor
	
	public BookedItineraryPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//Locators

	@FindBy(xpath="//img[@alt='Adactin Group']") WebElement img_logo;
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[1]") WebElement text_welcome;
	@FindBy(xpath="//*[@id='booked_form']/table/tbody/tr[1]/td/table/tbody/tr/td[1]") WebElement text_bookedItinerary;
	@FindBy(xpath="//input[@id='username_show']") WebElement text_helloUserName;
	@FindBy(xpath="//*[@id='booked_form']/table/tbody/tr[1]/td/table/tbody/tr/td[3]") WebElement text_searchOrderId;
	
	@FindBy(xpath="//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]") WebElement text_orderId;
	@FindBy(xpath="//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[3]") WebElement text_cancel;
	@FindBy(xpath="//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[4]") WebElement text_hotelName;
	@FindBy(xpath="//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[5]") WebElement text_location;
	@FindBy(xpath="//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[6]") WebElement text_noOfRooms;
	@FindBy(xpath="//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[7]") WebElement text_firstName;
	@FindBy(xpath="//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[8]") WebElement text_lastName;
	@FindBy(xpath="//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[9]") WebElement text_arrivalDate;
	@FindBy(xpath="//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[10]") WebElement text_departureDate;
	@FindBy(xpath="//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[11]") WebElement text_noOfDays;
	@FindBy(xpath="//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[12]") WebElement text_roomType;
	@FindBy(xpath="//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[13]") WebElement text_pricePerNight;
	@FindBy(xpath="//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[14]") WebElement text_totalPrice;
	
	@FindBy(xpath="//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[1]") WebElement col_checkbox;
	@FindBy(xpath="//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr/td[1]") List<WebElement> col_checkboxes;
	
	@FindBy(xpath="//input[@id='order_id_text']") WebElement textbox_searchOrder;
	
	
	@FindBy(xpath="//input[@id='search_hotel_id']") WebElement btn_go;
	@FindBy(xpath="//input[@name='cancelall']") WebElement btn_cancelSelected;
	@FindBy(xpath="//input[@id='search_hotel']") WebElement btn_searchHotel;
	@FindBy(xpath="//input[@id='logout']") WebElement btn_logout;
	
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
	
	public String getBookedItineraryText()
	{
		return text_bookedItinerary.getText();
	}
	
	public String getHelloUserNameText()
	{
		
		return text_helloUserName.getDomProperty("value");
	}
	
	public String getFooterMessageText()
	{
		return text_footer.getText();
	}
	
	public String getSearchOrderIdText()
	{
		return text_searchOrderId.getText();
	}
	
	public String getOrderIdText()
	{
		return text_orderId.getText();
	}
	
	public String getCancelText()
	{
		return text_cancel.getText();
	}
	
	
	public String getHotelNameText()
	{
		return text_hotelName.getText();
	}
	
	public String getLocationText()
	{
		return text_location.getText();
	}
	 
	public String getNoOfRoomsText()
	{
		return text_noOfRooms.getText();
	}
	
	public String getFirstNameText()
	{
		return text_firstName.getText();
	}
	
	public String getLastNameText()
	{
		return text_lastName.getText();
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
		return text_roomType.getText();
	}
	
	public String getPricePerNightText()
	{
		return text_pricePerNight.getText();
	}
	
	public String getTotalPriceText()
	{
		return text_totalPrice.getText();
	}
	
	 // Method to check if all checkboxes are displayed
    public List<WebElement> getCheckboxes() {
        List<WebElement> checkboxes = col_checkboxes;
        return checkboxes; 
    }
    
    public void setSearchOrderId(String orderId)
    {
    	 textbox_searchOrder.sendKeys(orderId);
    }
    
    public void clickCheckBoxColumn()
    {
    	col_checkbox.click();
    }
    
    public void clickCancelSelectedButton()
	{
		btn_cancelSelected.click();
	}
	public void clickSearchHotelButton()
	{
		btn_searchHotel.click();
	}
	
	public void clickLogoutButton()
	{
		btn_logout.click();
	}
	
	public void clickGoButton()
	{
		btn_go.click();
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
