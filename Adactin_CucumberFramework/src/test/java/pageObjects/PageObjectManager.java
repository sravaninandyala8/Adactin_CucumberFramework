package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public LoginPage loginPage;
	public SearchHotelPage searchHotelPage;
	public SelectHotelPage selectHotelPage;
	public BookHotelPage bookHotelPage;
	public BookingConfirmationPage bookingConfirmationPage;
	public BookedItineraryPage bookedItineraryPage;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public LoginPage getLoginPage()
	{
	
		loginPage= new LoginPage(driver);
		return loginPage;
	}
	
	public SearchHotelPage getSearchHotelPage()
	{
		searchHotelPage = new SearchHotelPage(driver);
		return searchHotelPage;
	}
	
	public SelectHotelPage getSelectHotelPage()
	{
	
		selectHotelPage= new SelectHotelPage(driver);
		return selectHotelPage;
	}
	
	public BookHotelPage getBookHotelPage()
	{
		bookHotelPage= new BookHotelPage(driver);
		return bookHotelPage;
	}
	
	public BookingConfirmationPage getBookingConfirmationPage()
	{
		bookingConfirmationPage = new BookingConfirmationPage(driver);
		return bookingConfirmationPage;
	}
	
	public BookedItineraryPage getBookedItineraryPage()
	{
		bookedItineraryPage = new BookedItineraryPage(driver);
		return bookedItineraryPage;
	}
}
