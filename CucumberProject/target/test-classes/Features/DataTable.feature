Feature: Test the login functionality of OrangeHRM using Data Table

  Scenario: Test the valid login page
    Given user is on login page
    When user enters credentials using DataTable
    | admin    | admin123  |
    And click on login button
    Then user should land on home page

    