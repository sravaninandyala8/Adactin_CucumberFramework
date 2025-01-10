package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
public WebDriver driver;
	
	public GenericUtils(WebDriver driver)
	{
		this.driver = driver;
	}
	

	public void SwitchWindowToChild()
	{
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1 =s1.iterator();
		String parentWindow = i1.next();
		String childWindow = i1.next();
		driver.switchTo().window(childWindow);
	}

	 public String getTodaysDate() {
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  // Adjust format if needed
	        return dateFormat.format(new Date());
	    }
	 
	 public String getTomorrowsDate() {
	        Calendar calendar = Calendar.getInstance();
	        calendar.add(Calendar.DAY_OF_YEAR, 1); // Add one day to the current date
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  // Adjust format if needed
	        return dateFormat.format(calendar.getTime());
	    }
}
