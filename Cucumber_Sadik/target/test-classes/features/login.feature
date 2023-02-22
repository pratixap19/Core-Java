Feature: Login functionality
  Scenario: Verify login with valid user
  Given User is on login page
  When User enters username and password in the input fields
  And user clicks on login button
  Then user will be navigated on home page
  And I logout from application