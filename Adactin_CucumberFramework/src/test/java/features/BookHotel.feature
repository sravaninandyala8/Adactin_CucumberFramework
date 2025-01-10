Feature: Book A Hotel Page functionality

  Background: 
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user selects the values for the dropdowns in search hotel page:
      | Location | Hotels      | Room Type | Number of Rooms | Adults Per Room | Children Per Room |
      | Sydney   | Hotel Creek | Standard  | 3 - Three       | 2 - Two         | 2 - Two           |
    And the user enters a valid Check In Date as "23/07/2025" in search hotel page
    And the user enters a valid Check Out Date as "27/07/2025" in search hotel page
    And the user clicks on the Search button in search hotel page
    And the user selects a hotel by clicking on radio button in select hotel page
    And the user clicks on Continue button in select hotel page

  Scenario: User sees all the fields
    Then the user should see the Welcome text in book hotel page
    And the user should see the Adactin Logo in book hotel page
    And the user should see the Book A hotel text in book hotel page
    And the user should see the Hello Username text in book hotel page
    And the user should see the footer message in book hotel page
    And the user should see the Hotel Name text in book hotel page
    And the user should see the Location text in book hotel page
    And the user should see the Room Type text in book hotel page
    And the user should see the Number of Rooms text in book hotel page
    And the user should see the Total Days text in book hotel page
    And the user should see the Price per Night text in book hotel page
    And the user should see the Total Price text in book hotel page
    And the user should see the GST text in book hotel page
    And the user should see the Final Billed Price text in book hotel page
    And the user should see the First Name text in book hotel page
    And the user should see the Last Name text in book hotel page
    And the user should see the Billing Address text in book hotel page
    And the user should see the Credit Card No text in book hotel page
    And the user should see the Credit Card Type text in book hotel page
    And the user should see the Expiry date text in book hotel page
    And the user should see the CVV Number text in book hotel page

  @Testing
  Scenario: User sees the fields with pre-filled data
    Then the user should see hotel name in the Book hotel page is same as the hotel selected in the Search Hotel page
    And the user should see location in the Book hotel page is same as the location selected in the Search Hotel page
    And the user should see room type in the Book hotel page is same as the rome type selected in the Search Hotel page
    And the user should see number of rooms in the Book hotel page is same as the number of rooms selected in the Search Hotel page
    And the user should see total days in the Book hotel page is same as the no of days in the Select Hotel page
    And the user should see price per night in the Book hotel page is same as the price per night in the Select Hotel page
    And the user should see total price in the Book hotel page is same as the total price in the Select Hotel page
    And the user should see the GST is calculated correctly in Book Hotel page
    And the user should see the Final Billed Price is calculated correctly in Book Hotel page

  Scenario: User sees the error message by clicking on Book Now button without giving input in the mandatory field
    And the user clicks on the Book Now button in book hotel page
    Then the user should see the error message next to First Name textbox in book hotel page
    And the user should see the error message next to Last Name textbox in book hotel page
    And the user should see the error message next to Billing Address textbox in book hotel page
    And the user should see the error message next to Credit Card No textbox in book hotel page
    And the user should see the error message next to Credit Card Type dropdown in book hotel page
    And the user should see the error message next to Expiry Date dropdown in book hotel page
    And the user should see the error message next to CVV Number dropdown in book hotel page

  Scenario: User clicks on "Book Now" button
    And the user enters the First Name "Test" and Last Name "User"
    And the user enters the Billing Address "402, Adactin, Paramatta"
    And the user enters the Credit Card No "4521578542456215"
    And the user enters the CVV Number "582"
    And the user selects the values for the dropdowns in book hotel page:
      | Credit Card Type | Select Month | Select Year |
      | American Express | October      |        2029 |
    And the user clicks on the Book Now button in book hotel page
    Then the user should navigate to the Booking Confirm page

  Scenario: User clicks on "Cancel" button
    And the user clicks on Cancel button in book hotel page
    Then the user should be navigated to the select hotel page

  Scenario: User clicks on "Back" link
    And the user clicks on back link in book hotel page
    Then the user should be navigated to the select hotel page

  Scenario: User clicks on "Search hotel" link
    And the user clicks on Search Hotel link in book hotel page
    Then the user should navigate to the Search Hotel page

  Scenario: User clicks on "Booked Itinerary" link
    And the user clicks on Booked Itinerary link in book hotel page
    Then the user should navigate to the Booked Itinerary page

  Scenario: User clicks on "Change Password" link
    And the user clicks on Change Password link in book hotel page
    Then the user should navigate to the Change Password page

  Scenario: User clicks on "Logout" link
    And the user clicks on Logout link in book hotel page
    Then the user should navigate to the Logout page
