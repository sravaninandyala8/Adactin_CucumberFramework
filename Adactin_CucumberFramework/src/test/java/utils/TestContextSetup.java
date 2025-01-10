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
	
	public String pricePerNightSelectPage;
	public String NoOfDaysSelectPage;
	public String totalPriceSelectPage;
	
	public String pricePerNightBookHotelPage;
	public String totalPriceBookHotelPage;
	public String gstBookHotelPage;
	public String finalBilledPriceBookHotelPage;
	
	public TestContextSetup() throws IOException
	{
		testBase = new TestBase();
		driver=testBase.WebDriverManager();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		genericUtils = new GenericUtils(testBase.WebDriverManager());
	}
}
