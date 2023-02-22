Feature: Test login functionality

  Scenario: Check login is successful with valid credentials
    Given User is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the login page