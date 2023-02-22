Feature: Verify search functionality of application

Background:
Given I am on home page
@smoke
  Scenario: Verify product in jcpenny
  #Given I am on home page
  When I search product in application
  Then I verify product listed successfully on product page
 @regression 
  Scenario Outline: Verify product in jcpenny
    #Given I am on home page
    When I search product "<product>"in application
    Then I verify "<product>" display successfully on product page

    Examples: 
      | product                                      |
      | liz-claiborne-sleeveless-shift-dress         |
      | Nike Flex Experience RN 9 Mens Running Shoes |
      | mens nike air monarch shoes                  |
