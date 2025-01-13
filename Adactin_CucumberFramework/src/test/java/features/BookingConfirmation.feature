Feature: Book Confirmation Page functionality

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
    And the user enters the First Name "Test" and Last Name "User"
    And the user enters the Billing Address "402, Adactin, Paramatta"
    And the user enters the Credit Card No "4521578542456215"
    And the user enters the CVV Number "582"
    And the user selects the values for the dropdowns in book hotel page:
      | Credit Card Type | Select Month | Select Year |
      | American Express | October      |        2029 |

  Scenario: User sees all the fields
    And the user clicks on the Book Now button in book hotel page
    Then the user should see the Welcome text in booking confirmation page
    And the user should see the Adactin Logo in booking confirmation page
    And the user should see the Booking Confirmation text in booking confirmation page
    And the user should see the Hello Username text in booking confirmation page
    And the user should see the footer message in booking confirmationpage
    And the user should see the Hotel Name text in booking confirmation page
    And the user should see the Location text in booking confirmation page
    And the user should see the Room Type text in booking confirmation page
    And the user should see the Arrival Date text in booking confirmation page
    And the user should see the Departure Date text in booking confirmation page
    And the user should see the Total Rooms text in booking confirmation page
    And the user should see the Adults Per Room text in booking confirmation page
    And the user should see the Children Per Room text in booking confirmation page
    And the user should see the Price per Night text in booking confirmation page
    And the user should see the Total Price text in booking confirmation page
    And the user should see the GST text in booking confirmation page
    And the user should see the Final Billed Price text in booking confirmation page
    And the user should see the First Name text in booking confirmation page
    And the user should see the Last Name text in booking confirmation page
    And the user should see the Billing Address text in booking confirmation page
    And the user should see the Order No text in booking confirmation page


  Scenario: User sees the fields with pre-filled data
    And the user sees the hotel name in the book hotel page
    And the user sees the location in the book hotel page
    And the user sees the room type in the book hotel page
    And the user sees the total rooms in the book hotel page
    And the user sees the price per night in the book hotel page
    And the user sees the total price in the book hotel page
    And the user sees the price per night in the book hotel page
    And the user sees the gst in the book hotel page
    And the user sees the final filled price in the book hotel page
    And the user clicks on the Book Now button in book hotel page
    Then the user should see hotel name in the Booking Confirmation page is same as the hotel selected in the Book Hotel page
    And the user should see location in the Booking Confirmation page is same as the location selected in the Book Hotel page
    And the user should see room type in the Booking Confirmation page is same as the rome type selected in the Book Hotel page
    And the user should see total rooms in the Booking Confirmation page is same as the number of rooms selected in the Book Hotel page
    And the user should see price per night in the Booking Confirmation page is same as the price per night in the Book Hotel page
    And the user should see total price in the Booking Confirmation page is same as the total price in the Book Hotel page
    And the user should see the gst in the Booking Confirmation page is same as the gst in the Book Hotel page
    And the user should see the final billed price in the Booking Confirmation page is same as the final billed price in the Book Hotel page

  Scenario: User sees the Order No
    And the user clicks on the Book Now button in book hotel page
    Then the user should see the Order No in the booking confirmation page

  Scenario: User clicks on "Search Hotel" button
    And the user clicks on the Book Now button in book hotel page
    And the user clicks on the Search Hotel button in booking confirmation page
    Then the user should navigate to the Search Hotel page

  Scenario: User clicks on "Search Hotel" link
    And the user clicks on the Book Now button in book hotel page
    And the user clicks on the Search Hotel link in booking confirmation page
    Then the user should navigate to the Search Hotel page

  Scenario: User clicks on "My Itinerary" button
    And the user clicks on the Book Now button in book hotel page
    And the user clicks on the My Itinerary button in booking confirmation page
    Then the user should navigate to the Booked Itinerary page

  Scenario: User clicks on "Booked Itinerary" link
    And the user clicks on the Book Now button in book hotel page
    And the user clicks on the Booked Itinerary link in booking confirmation page
    Then the user should navigate to the Booked Itinerary page

  Scenario: User clicks on "Logout" button
    And the user clicks on the Book Now button in book hotel page
    And the user clicks on the Logout button in booking confirmation page
    Then the user should navigate to the Logout page

  Scenario: User clicks on "Logout" link
    And the user clicks on the Book Now button in book hotel page
    And the user clicks on the Logout link in booking confirmation page
    Then the user should navigate to the Logout page

  Scenario: User clicks on "Change Password" link
    And the user clicks on the Book Now button in book hotel page
    And the user clicks on the Change Password link in booking confirmation page
    Then the user should navigate to the Change Password page
