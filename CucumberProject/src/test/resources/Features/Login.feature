Feature: Test the login functionality of OrangeHRM

  Scenario Outline: Test the valid login page
    Given user is on login page
    When user enters <username> and <password>
    And click on login button
    Then user should land on home page

    Examples: 
      | username | password  |
      | admin    | admin123  |
      | admin1   | admin1234 |
