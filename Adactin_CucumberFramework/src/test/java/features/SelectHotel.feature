Feature: Select Hotel Page functionality


  Scenario: User sees all the fields
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user selects the values for the dropdowns in search hotel page:
      | Location | Hotels         | Room Type | Number of Rooms | Adults Per Room | Children Per Room |
      | Brisbane | Hotel Sunshine | Standard  | 1 - One         | 2 - Two         | 1 - One           |
    And the user enters a valid Check In Date as "03/05/2025" in search hotel page
    And the user enters a valid Check Out Date as "06/05/2025" in search hotel page
    And the user clicks on the Search button in search hotel page
    Then the user should be navigated to the select hotel page
    Then the user should see the Welcome text in select hotel page
    And the user should see the Adactin Logo in select hotel page
    And the user should see the Select hotel text in select hotel page
    And the user should see the Hello Username text in select hotel page
    And the user should see the footer message in select hotel page

  Scenario: User sees all the column names
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user selects the values for the dropdowns in search hotel page:
      | Location | Hotels         | Room Type | Number of Rooms | Adults Per Room | Children Per Room |
      | Brisbane | Hotel Sunshine | Standard  | 1 - One         | 2 - Two         | 1 - One           |
    And the user enters a valid Check In Date as "03/05/2025" in search hotel page
    And the user enters a valid Check Out Date as "06/05/2025" in search hotel page
    And the user clicks on the Search button in search hotel page
    Then the user should see the select column name
    And the user should see the Hotel Name column name
    And the user should see the Location column name
    And the user should see the Rooms column name
    And the user should see the Arrival Date column name
    And the user should see the Departure Date column name
    And the user should see the No. of Days column name
    And the user should see the Rooms Type column name
    And the user should see the Price Per Night column name
    And the user should see the Total Price(excl. GST) column name
     

  Scenario: User sees the radio button for each hotel under "Select Column"
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user selects the values for the dropdowns in search hotel page:
      | Location | Hotels         | Room Type | Number of Rooms | Adults Per Room | Children Per Room |
      | Brisbane | Hotel Sunshine | Standard  | 2 - Two         | 1 - One         | 1 - One           |
    And the user enters a valid Check In Date as "13/06/2025" in search hotel page
    And the user enters a valid Check Out Date as "14/06/2025" in search hotel page
    And the user clicks on the Search button in search hotel page
    Then the user should see radio buttons under the Select column in select hotel page

  Scenario: User sees the Location displayed in "Select Hotel" page is same as Location selected in "Search Hotel" page
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user selects the values for the dropdowns in search hotel page:
      | Location | Hotels         | Room Type | Number of Rooms | Adults Per Room | Children Per Room |
      | Brisbane | Hotel Sunshine | Standard  | 2 - Two         | 1 - One         | 1 - One           |
    And the user enters a valid Check In Date as "13/06/2025" in search hotel page
    And the user enters a valid Check Out Date as "14/06/2025" in search hotel page
    And the user clicks on the Search button in search hotel page
    Then the user should see location displayed in the Select Hotel page is same as the location selected in the Search Hotel page

  Scenario: User sees the Hotel Name displayed in "Select Hotel" page is same as Hotel Name selected in "Search Hotel" page
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user selects the values for the dropdowns in search hotel page:
      | Location | Hotels         | Room Type | Number of Rooms | Adults Per Room | Children Per Room |
      | Brisbane | Hotel Sunshine | Standard  | 2 - Two         | 1 - One         | 1 - One           |
    And the user enters a valid Check In Date as "13/06/2025" in search hotel page
    And the user enters a valid Check Out Date as "14/06/2025" in search hotel page
    And the user clicks on the Search button in search hotel page
    Then the user should see hotel name displayed in the Select Hotel page is same as the hotel name selected in the Search Hotel page

  Scenario: User sees the Rooms displayed in "Select Hotel" page is same as Number of rooms selected in "Search Hotel" page
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user selects the values for the dropdowns in search hotel page:
      | Location | Hotels         | Room Type | Number of Rooms | Adults Per Room | Children Per Room |
      | Brisbane | Hotel Sunshine | Standard  | 2 - Two         | 1 - One         | 1 - One           |
    And the user enters a valid Check In Date as "13/06/2025" in search hotel page
    And the user enters a valid Check Out Date as "14/06/2025" in search hotel page
    And the user clicks on the Search button in search hotel page
    Then the user should see Rooms displayed in the Select Hotel page is same as the Number  of Rooms selected in the Search Hotel page

  Scenario: User sees the Arrival Date displayed in "Select Hotel" page is same as Check In Date entered in "Search Hotel" page
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user selects the values for the dropdowns in search hotel page:
      | Location | Hotels         | Room Type | Number of Rooms | Adults Per Room | Children Per Room |
      | Brisbane | Hotel Sunshine | Standard  | 2 - Two         | 1 - One         | 1 - One           |
    And the user enters a valid Check In Date as "13/06/2025" in search hotel page
    And the user enters a valid Check Out Date as "14/06/2025" in search hotel page
    And the user clicks on the Search button in search hotel page
    Then the user should see Arrival date displayed in the Select Hotel page is same as the Check In Date entered in the Search Hotel page

  Scenario: User sees the Departure Date displayed in "Select Hotel" page is same as Check Out Date entered in "Search Hotel" page
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user selects the values for the dropdowns in search hotel page:
      | Location | Hotels         | Room Type | Number of Rooms | Adults Per Room | Children Per Room |
      | Brisbane | Hotel Sunshine | Standard  | 2 - Two         | 1 - One         | 1 - One           |
    And the user enters a valid Check In Date as "13/06/2025" in search hotel page
    And the user enters a valid Check Out Date as "14/06/2025" in search hotel page
    And the user clicks on the Search button in search hotel page
    Then the user should see Departure Date displayed in the Select Hotel page is same as the Check Out Date entered in the Search Hotel page

  Scenario: User sees the No. of Days calcutates correctly
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user selects the values for the dropdowns in search hotel page:
      | Location | Hotels         | Room Type | Number of Rooms | Adults Per Room | Children Per Room |
      | Brisbane | Hotel Sunshine | Standard  | 2 - Two         | 1 - One         | 1 - One           |
    And the user enters a valid Check In Date as "13/06/2025" in search hotel page
    And the user enters a valid Check Out Date as "17/06/2025" in search hotel page
    And the user clicks on the Search button in search hotel page
    Then the user should see No. of Days correctly calculates the number of nights between the Arrival Date and Departure Date

  Scenario: User sees the Room Type displayed in "Select Hotel" page is same as Room Type selected in "Search Hotel" page
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user selects the values for the dropdowns in search hotel page:
      | Location | Hotels         | Room Type | Number of Rooms | Adults Per Room | Children Per Room |
      | Brisbane | Hotel Sunshine | Standard  | 2 - Two         | 1 - One         | 1 - One           |
    And the user enters a valid Check In Date as "13/06/2025" in search hotel page
    And the user enters a valid Check Out Date as "14/06/2025" in search hotel page
    And the user clicks on the Search button in search hotel page
    Then the user should see Room Type displayed in the Select Hotel page is same as the Room Type selected in the Search Hotel page

  Scenario: User sees the price per night displays the price
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user selects the values for the dropdowns in search hotel page:
      | Location | Hotels         | Room Type | Number of Rooms | Adults Per Room | Children Per Room |
      | Brisbane | Hotel Sunshine | Standard  | 2 - Two         | 1 - One         | 1 - One           |
    And the user enters a valid Check In Date as "13/06/2025" in search hotel page
    And the user enters a valid Check Out Date as "14/06/2025" in search hotel page
    And the user clicks on the Search button in search hotel page
    Then the should see the Price Per Night column displays the price for hotel in select hotel page

  Scenario: User sees the Total Price (excl. GST) calculates correctly
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user selects the values for the dropdowns in search hotel page:
      | Location | Hotels         | Room Type | Number of Rooms | Adults Per Room | Children Per Room |
      | Brisbane | Hotel Sunshine | Standard  | 2 - Two         | 1 - One         | 1 - One           |
    And the user enters a valid Check In Date as "13/06/2025" in search hotel page
    And the user enters a valid Check Out Date as "14/06/2025" in search hotel page
    And the user clicks on the Search button in search hotel page
    Then the user should see the  Total Price (excl. GST) column displays the price in select hotel page

  Scenario: User clicks on the "Continue" button
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
    Then the user should navigate to the Book Hotel Page

  Scenario: User clicks on the "Cancel" button
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user selects the values for the dropdowns in search hotel page:
      | Location | Hotels      | Room Type | Number of Rooms | Adults Per Room | Children Per Room |
      | Sydney   | Hotel Creek | Standard  | 3 - Three       | 2 - Two         | 2 - Two           |
    And the user enters a valid Check In Date as "23/07/2025" in search hotel page
    And the user enters a valid Check Out Date as "27/07/2025" in search hotel page
    And the user clicks on the Search button in search hotel page
    And the user clicks on Cancel button in select hotel page
    Then the user should navigate to the Search Hotel page

  Scenario: User clicks on "Search Hotel" link
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user selects the values for the dropdowns in search hotel page:
      | Location | Hotels      | Room Type | Number of Rooms | Adults Per Room | Children Per Room |
      | Sydney   | Hotel Creek | Standard  | 3 - Three       | 2 - Two         | 2 - Two           |
    And the user enters a valid Check In Date as "23/07/2025" in search hotel page
    And the user enters a valid Check Out Date as "27/07/2025" in search hotel page
    And the user clicks on the Search button in search hotel page
    And the user clicks on Search Hotel link in select hotel page
    Then the user should navigate to the Search Hotel page

  Scenario: User clicks on "Booked Itinerary" link
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user selects the values for the dropdowns in search hotel page:
      | Location | Hotels      | Room Type | Number of Rooms | Adults Per Room | Children Per Room |
      | Sydney   | Hotel Creek | Standard  | 3 - Three       | 2 - Two         | 2 - Two           |
    And the user enters a valid Check In Date as "23/07/2025" in search hotel page
    And the user enters a valid Check Out Date as "27/07/2025" in search hotel page
    And the user clicks on the Search button in search hotel page
    And the user clicks on Booked Itinerary link in select hotel page
    Then the user should navigate to the Booked Itinerary page

  Scenario: User clicks on "Change Password" link
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user selects the values for the dropdowns in search hotel page:
      | Location | Hotels      | Room Type | Number of Rooms | Adults Per Room | Children Per Room |
      | Sydney   | Hotel Creek | Standard  | 3 - Three       | 2 - Two         | 2 - Two           |
    And the user enters a valid Check In Date as "23/07/2025" in search hotel page
    And the user enters a valid Check Out Date as "27/07/2025" in search hotel page
    And the user clicks on the Search button in search hotel page
    And the user clicks on Change Password link in select hotel page
    Then the user should navigate to the Change Password page

  Scenario: User clicks on "Logout" link
    Given the user is on the login page
    When the user enters username "AdactinUser234" and password "RA5974"
    And the user clicks on login button
    And the user selects the values for the dropdowns in search hotel page:
      | Location | Hotels      | Room Type | Number of Rooms | Adults Per Room | Children Per Room |
      | Sydney   | Hotel Creek | Standard  | 3 - Three       | 2 - Two         | 2 - Two           |
    And the user enters a valid Check In Date as "23/07/2025" in search hotel page
    And the user enters a valid Check Out Date as "27/07/2025" in search hotel page
    And the user clicks on the Search button in search hotel page
    And the user clicks on Logout link in select hotel page
    Then the user should navigate to the Logout page
