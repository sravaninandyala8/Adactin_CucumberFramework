Feature: Booked Itinerary Page functionality

  Scenario: User sees all the fields
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user clicks on Booked Itinerary link in search hotel page
    Then the user should see the Welcome text in booked itinerary page
    And the user should see the Adactin Logo in booked itinerary hotel page
    And the user should see the Booked Itinerary text in booked itinerary hotel page
    And the user should see the Hello Username text in booked itinerary hotel page
    And the user should see the footer message in booked itinerary page
    And the user should see the Search order Id text in booked itinerary page

  Scenario: User sees all the column names
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user clicks on Booked Itinerary link in search hotel page
    Then the user should see the Order Id text in booked itinerary page
    And the user should see the Cancel text in booked itinerary page
    And the user should see the Hotel Name text in booked itinerary page
    And the user should see the Location text in booked itinerary page
    And the user should see the First Name text in booked itinerary page
    And the user should see the Last Name text in booked itinerary page
    And the user should see the No of Rooms text in booked itinerary page
    And the user should see the Arrival Date text in booked itinerary page
    And the user should see the Departure Date text in booked itinerary page
    And the user should see the No of Days text in booked itinerary page
    And the user should see the Room Type text in booked itinerary page
    And the user should see the Price per Night text in booked itinerary page
    And the user should see the Total Price text in booked itinerary page

  Scenario: User clicks on "Search Hotel" link
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user clicks on Booked Itinerary link in search hotel page
    And the user clicks on Search Hotel link in booked itinerary page
    Then the user should navigate to the Search Hotel page

  Scenario: User clicks on "Booked Itinerary" link
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user clicks on Booked Itinerary link in search hotel page
    And the user clicks on Booked Itinerary link in booked itinerary page
    Then the user should navigate to the Booked Itinerary page

  Scenario: User clicks on "Change Password" link
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user clicks on Booked Itinerary link in search hotel page
    And the user clicks on Change Password link in booked itinerary page
    Then the user should navigate to the Change Password page

  Scenario: User clicks on "Logout" link
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user clicks on Booked Itinerary link in search hotel page
    And the user clicks on Logout link in booked itinerary page
    Then the user should navigate to the Logout page

  Scenario: User clicks on "Search Hotel" button
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user clicks on Booked Itinerary link in search hotel page
    And the user clicks on Search Hotel button in booked itinerary page
    Then the user should navigate to the Search Hotel page

  Scenario: User clicks on "Logout" button
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user clicks on Booked Itinerary link in search hotel page
    And the user clicks on Logout button in booked itinerary page
    Then the user should navigate to the Logout page
    
   
      Scenario: User clicks on "Checkbox" column
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user clicks on Booked Itinerary link in search hotel page
    And the user clicks on the Checkbox column
    Then all checkboxes should be selected
    
