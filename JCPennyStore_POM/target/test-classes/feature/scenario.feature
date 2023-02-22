Feature: Addiion of number

  Scenario: add two numbers
    Given numbers are 10 and 12
    When I added both numbers
    Then I verify result is 22

  Scenario Outline: add two numbers
    Given numbers are <first value> and <second value>
    When I added both numbers
    Then I verify result is <result>

    Examples: 
      | first value | second value | result |
      |           1 |            2 |      3 |
      |          10 |           20 |     30 |
      |           2 |            4 |      6 |
      |           5 |            6 |     11 |
