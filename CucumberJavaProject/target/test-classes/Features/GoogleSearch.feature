Feature: Test Google search functionality

  Scenario: Validate Google search is working
    Given launch the browser
    And user is on Google search page
    When user enters a text in searchbox
    And hits enter
    Then user is navigated to search results
