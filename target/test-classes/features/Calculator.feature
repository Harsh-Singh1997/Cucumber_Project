Feature: This feature would be creating a calculator for Add and Subtract

  @sanity
  Scenario: To Add two numbers
    Given I have a calculator
    When I add 4 and 5
    Then I should get the result as 9

  Scenario Outline: To Add two numbers
    Given I have a calculator
    When I add <int1> and <int2>
    Then I should get the result as <intR>

    Examples: 
      | int1 | int2 | intR |
      |    3 |    6 |    9 |
      |   13 |    2 |   15 |
      |    6 |    7 |   13 |

  Scenario: To Add two numbers
    Given I have a calculator
    When I add below numbers
      | 3 |
      | 2 |
      | 5 |
      | 4 |
      | 3 |
    Then I should get the result as 17
