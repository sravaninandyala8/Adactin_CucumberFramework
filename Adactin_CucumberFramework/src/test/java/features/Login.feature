Feature: Login Page Functionality

  Scenario: User Login with valid credentials
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    Then the user should navigate to the Search Hotel page

  Scenario: User Login with invalid credentials
    Given the user is on the login page
    When the user enters username "AdactinUse234" and password "A5974"
    And the user clicks on login button
    Then the user should see the error message

  Scenario: User clicks on the "Forgot Password" link
    Given the user is on the login page
    When the user clicks on  the forgot password link
    Then the user should be redirected to the Forgot Password page

  Scenario: User clicks on the "New User Registration Here" link
    Given the user is on the login page
    When the user clicks on  the New User Registration Here link
    Then the user should be redirected to the New User Registration Form

  Scenario: User sees the Login page elements
    Given the user is on the login page
    Then the user should see the Welcome text
    And the user should see the Adactin Logo
    And the user should see the Existing User Login text
    And the user should see the Username text
    And the user should see the Password text
    And the user should see the Important Note text
    And the user should see the footer message
    
