Feature: feature to test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters "<username>" and "<password>"
    And click on login button
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Raghav   |    12345 |
      | Pratixa  |     6789 |
