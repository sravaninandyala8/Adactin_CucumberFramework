package stepDefinitions;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utils.TestContextSetup;

public class LoginSteps {
	
	public WebDriver driver;
	TestContextSetup testContextSetup;
	LoginPage loginPage;
	
	public LoginSteps(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup; 
		this.loginPage = testContextSetup.pageObjectManager.getLoginPage();

	}
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		
		String actualTitle = testContextSetup.driver.getTitle();
		Assert.assertEquals(actualTitle, "Adactin.com - Hotel Reservation System");
	   
	}

	@When("the user enters username {string} and password {string}")
	public void the_user_enters_username_and_password(String username, String password) {
		
		loginPage.setUsername(username);
		loginPage.setPassword(password);
	    
	}

	@When("the user clicks on login button")
	public void the_user_clicks_on_login_button() {
		loginPage.clickButton();
	}

	@Then("the user should navigate to the Search Hotel page")
	public void the_user_should_navigate_to_the_search_hotel_page() {
		
		Assert.assertEquals(testContextSetup.driver.getTitle(), "Adactin.com - Search Hotel");   
	}

	@Then("the user should see the error message")
	public void the_user_should_see_the_error_message() {
		
		String actualErrorMessage = loginPage.getErrorMessage();
		String expectedErrorMessage = "Invalid Login details or Your Password might have expired. Click here to reset your password";
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
		
	}

	@When("the user clicks on  the forgot password link")
	public void the_user_clicks_on_the_forgot_password_link() {
		
		loginPage.clickForgotPasswordLink();
	 
	}

	@Then("the user should be redirected to the Forgot Password page")
	public void the_user_should_be_redirected_to_the_forgot_password_page() {
	    
		Assert.assertEquals(testContextSetup.driver.getTitle(), "Adactin.com - Forgot Password");
	}
	
	
	@When("the user clicks on  the New User Registration Here link")
	public void the_user_clicks_on_the_new_user_registration_here_link() {
	    
		loginPage.clickNewRegistrationLink();
		
	}

	@Then("the user should be redirected to the New User Registration Form")
	public void the_user_should_be_redirected_to_the_new_user_registration_form() {
	    
		Assert.assertEquals(testContextSetup.driver.getTitle(), "Adactin.com - New User Registration");
		
	}
	
	@Then("the user should see the Adactin Logo")
	public void the_user_should_see_the_adactin_logo() throws InterruptedException {
	    
		boolean logo = loginPage.getLogo();
		Assert.assertTrue(logo, "Logo is not present");
		
	}
	
	@Then("the user should see the Welcome text")
	public void the_user_should_see_the_welcome_text() {
	    
		String welcomeText = loginPage.getWelcomeText();
		Assert.assertEquals(welcomeText, "Welcome to Adactin Group of Hotels");
	}
	
	@Then("the user should see the Existing User Login text")
	public void the_user_should_see_the_existing_user_login_text() {
		
		String existingLoginText = loginPage.getUserLoginText();
		Assert.assertEquals(existingLoginText, "Existing User Login - Build 2");
	   
	}

	@Then("the user should see the Username text")
	public void the_user_should_see_the_username_text() {
	    
		String usernameText = loginPage.getUsernameText();
		Assert.assertEquals(usernameText, "Username ");
		
	}

	@Then("the user should see the Password text")
	public void the_user_should_see_the_password_text() {
		
		String passwordText = loginPage.getPasswordText();
		Assert.assertEquals(passwordText, "Password ");
	}

	@Then("the user should see the footer message")
	public void the_user_should_see_the_footer_message() {
	    
		String footerText = loginPage.getFooterText();
		Assert.assertEquals(footerText, "© 2020 - Adactin.com. All Rights Reserved. Adactin Group Pty. Ltd.");
	}
	
	@Then("the user should see the Important Note text")
	public void the_user_should_see_the_important_note_text() {
	    
		String importantNoteText = loginPage.getImportantNoteText();
		Assert.assertEquals(importantNoteText, "Important Note:");
		
	}


}
