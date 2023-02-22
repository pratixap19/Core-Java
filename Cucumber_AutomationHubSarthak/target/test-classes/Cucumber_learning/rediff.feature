Feature: validating Rediff login logout functionality

@Login
Scenario: This is login scenario of Rediff
Given Open Chrome browser 
And I enter url
Then Click on signin link
And I enter the Rediffmail page 
And I enter correct username and password
Then I click on SignIn button
And I check if I am in the inbox page of Rediffmail

@Logout
Scenario: This is log out scenario of Rediff
Given I am inside the inbox page
And I validate the presence of the logout link
When I click on the logout link
Then I am logged out of Rediffmail
And I can validate the presence of the Rediff Home link