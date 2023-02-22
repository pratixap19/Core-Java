Feature: addition of number

  Background: 
    Given I am background scenario

  @Tag1
  Scenario: add two numbers
    Given numbers are 10 and 12
    When I added both numbers
    Then I verify result is 22

  @Tag2
  Scenario Outline: add two numbers
    Given numbers are <firstValue> and <secondValue>
    When I added both numbers
    Then I verify result is <result>

    Examples: 
      | firstValue | secondValue | result |
      |          1 |           2 |      3 |
      |         10 |          20 |     31 |
      |          2 |           4 |      6 |
      |          5 |           6 |     11 |
