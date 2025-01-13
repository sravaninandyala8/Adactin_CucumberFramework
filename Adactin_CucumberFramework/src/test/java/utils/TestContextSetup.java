package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {

	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public GenericUtils genericUtils;
	public TestBase testBase;
	
	public String selectedLocation;
	public String selectedHotel;
	public String selectedRoomType;
	public String selectedNumberOfRooms;
	public String enteredCheckInDate;
	public String enteredCheckOutDate;
	public String selectedAdultsPerRoom;
	public String selectedChildrenPerRoom;
	
	public String hotelNameSelectPage;
	public String locationSelectPage;
	public String roomTypeSelectPage;
	public String numberOfRoomsSelectPage;
	public String totalDaysSelectPage;
	public String priceperNightSelectPage;
	public String totalPriceSelectPage;
	
	public String hotelNameBookPage;
	public String locationBookPage;
	public String roomTypeBookPage;
	public String totalRoomsBookPage;
	public String pricePerNightBookPage;
	public String totalPriceBookPage;
	public String gstBookPage;
	public String finalPriceBookPage;
	
	public TestContextSetup() throws IOException
	{
		testBase = new TestBase();
		driver=testBase.WebDriverManager();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		genericUtils = new GenericUtils(testBase.WebDriverManager());
	}
}
