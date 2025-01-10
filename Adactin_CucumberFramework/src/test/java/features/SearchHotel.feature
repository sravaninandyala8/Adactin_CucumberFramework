Feature: Search Hotel Page functionality

  Background: 
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button

  Scenario: User sees all the fields
    Then the user should see the Location text in search hotel page
    And the user should see the Hotels text in search hotel page
    And the user should see the Room Type text in search hotel page
    And the user should see the Number of Rooms text in search hotel page
    And the user should see the Check In Date text in search hotel page
    And the user should see the Check Out Date text in search hotel page
    And the user should see the Adults Per Room text in search hotel page
    And the user should see the Children Per Room text in search hotel page
    And the user should see the Welcome text in search hotel page
    And the user should see the Adactin Logo in search hotel page
    And the user should see the Search hotel text in search hotel page
    And the user should see the Hello Username text in search hotel page
    And the user should see the footer message in search hotel page

  Scenario: User clicks on Location dropdown
    And the user clicks on location dropdown in search hotel page
    Then the user should see the Location dropdown options in search hotel page

  Scenario: User clicks on Hotels dropdown
    And the user clicks on Hotels dropdown in search hotel page
    Then the user should see the Hotels dropdown options in search hotel page

  Scenario: User clicks on Room Type dropdown
    And the user clicks on Room Type dropdown in search hotel page
    Then the user should see the Room Type dropdown options in search hotel page

  Scenario: User clicks on Number of Rooms dropdown
    And the user clicks on Number of Rooms dropdown in search hotel page
    Then the user should see the Number of Rooms dropdown options in search hotel page

  Scenario: User clicks on  Adult per Room dropdown
    And the user clicks on Adult per Room dropdown in search hotel page
    Then the user should see the Adult per Room dropdown options in search hotel page

  Scenario: User clicks on  Children per Room dropdown
    And the user clicks on Children per Room dropdown in search hotel page
    Then the user should see the Children per Room dropdown options in search hotel page

  Scenario: User sees the Check In Date
    Then the user should see the default value in the Check In Date field as todays date in search hotel page

  Scenario: User sees the Check In Date
    Then the user should see the default value in the Check Out Date field as tomorrows date in search hotel page

  Scenario: User is navigated to Select Hotel page by selecting all fields and clicking on Search button
    And the user selects the values for the dropdowns in search hotel page:
      | Location | Hotels      | Room Type | Number of Rooms | Adults Per Room | Children Per Room |
      | Sydney   | Hotel Creek | Double    | 1 - One         | 1 - One         | 1 - One           |
    And the user enters a valid Check In Date as "18/05/2025" in search hotel page
    And the user enters a valid Check Out Date as "20/05/2025" in search hotel page
    And the user clicks on the Search button in search hotel page
    Then the user should be navigated to the select hotel page

  Scenario: Verify the Reset button resets all fields to their default values
    And the user selects the values for the dropdowns in search hotel page:
      | Location  | Hotels      | Room Type | Number of Rooms | Adults Per Room | Children Per Room |
      | Melbourne | Hotel Creek | Double    | 8 - Eight       | 3 - Three       | 4 - Four          |
    And the user enters a valid Check In Date as "15/02/2025" in search hotel page
    And the user enters a valid Check Out Date as "21/02/2025" in search hotel page
    And the user clicks on the Reset button in search hotel page
    Then all the fields should be reset to their default values in search hotel page

  Scenario: User sees the error message by clicking on Search button without giving input in the mandatory field
    And the user clears the date in the Check In Date textbox in search hotel page
    And the user clears the date in the Check Out Date textbox in search hotel page
    And the user clicks on the Search button in search hotel page
    Then the user should see the error message next to Location dropdown in search hotel page
    And the user should see the error message next to Check In Date textbox in search hotel page
    And the user should see the error message next to Check Out Date textbox in search hotel page

  Scenario: User clicks on "Search Hotel" link
    And the user clicks on Search Hotel link in search hotel page
    Then the user should navigate to the Search Hotel page

  Scenario: User clicks on "Booked Itinerary" link
    And the user clicks on Booked Itinerary link in search hotel page
    Then the user should navigate to the Booked Itinerary page

  Scenario: User clicks on "Change Password" link
    And the user clicks on Change Password link in search hotel page
    Then the user should navigate to the Change Password page

  Scenario: User clicks on "Logout" link
    And the user clicks on Logout link in search hotel page
    Then the user should navigate to the Logout page
