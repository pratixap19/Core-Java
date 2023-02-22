Feature: Search product

  @Selenium
  Scenario: Search Product
    Given I am on home page
    When I enter product name in search field
    And I click on search button
    Then I verify product displayed on product page
    

 
