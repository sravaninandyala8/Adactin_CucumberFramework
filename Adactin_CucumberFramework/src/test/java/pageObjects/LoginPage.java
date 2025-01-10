package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	//Constructor
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Locators
	
	@FindBy(xpath="//img[@alt='Adactin Group']") WebElement img_logo;
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td[1]/p[1]") WebElement text_welcome;
	@FindBy(xpath="//td[@class='login_title']") WebElement text_userLogin;
	@FindBy(xpath="//*[@id='login_form']/table/tbody/tr[2]/td[1]") WebElement text_username;
	@FindBy(xpath="//*[@id='login_form']/table/tbody/tr[3]/td[1]") WebElement text_password;
	@FindBy(xpath="//input[@id='username']") WebElement textbox_username;
	@FindBy(xpath="//input[@id='password']") WebElement textbox_password;
	@FindBy(xpath="//input[@id='login']") WebElement btn_login;
	@FindBy(xpath="//*[@id=\"login_form\"]/table/tbody/tr[4]/td[2]/div/a") WebElement link_forgotPassword;
	@FindBy(xpath="//*[@id=\"login_form\"]/table/tbody/tr[7]/td/a") WebElement link_register;
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td") WebElement text_importantNote;
	@FindBy(xpath="//td[@class='footer']") WebElement text_footer;
	@FindBy(xpath="//*[@id=\"login_form\"]/table/tbody/tr[5]/td[2]/div/b") WebElement text_errorMesage;
	
	
	//Action methods
	
	public boolean getLogo()
	{
		WebElement logo = img_logo;
		return logo.isDisplayed();
	}
	
	public String getWelcomeText()
	{
		return text_welcome.getText();
	}
	
	public String getUserLoginText()
	{
		return text_userLogin.getText();
	}
	
	public String getUsernameText()
	{
		return text_username.getText();
	}
	
	public String getPasswordText()
	{
		return text_password.getText();
	}
	
	public void setUsername(String username)
	{
		textbox_username.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		textbox_password.sendKeys(password);
	}
	
	public void clickButton()
	{
		btn_login.click();
	}
	
	public String getErrorMessage()
	{
		return text_errorMesage.getText();
	}
	
	public void clickForgotPasswordLink()
	{
		link_forgotPassword.click();
	}
	
	public void clickNewRegistrationLink()
	{
		link_register.click();
	}
	
	public String getImportantNoteText()
	{
		return text_importantNote.getText();
	}
	

	public String getFooterText()
	{
		return text_footer.getText();
	}
	
}


