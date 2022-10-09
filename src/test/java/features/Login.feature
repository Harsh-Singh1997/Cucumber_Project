Feature: Login Feature Scenario

  Background: 
    Given I have launched the application
    And I click on the Login Link

  @regression
  Scenario: The scenario is to define login happy path
    When I entered the correct username and password
    And I Click the Login Button
    Then I should land on the home page

  Scenario: This scenario is to define failure path
    When I entered the incorrect username and password
    And I Click the Login Button
    Then I should get error message "The email or password you have entered is invalid."

  @sanity
  Scenario: This scenario is to define failure path
    When I enter username as "abc@xyz.com" and password as "Abcd@12344"
    And I Click the Login Button
    Then I should get error message "The email or password you have entered is invalid."

  Scenario Outline: This scenario is to define failure path
    When I enter username as "<UserName>" and password as "<Password>"
    And I Click the Login Button
    Then I should get error message "The email or password you have entered is invalid."

    Examples: 
      | UserName    | Password   |
      | abc@xyz.com | Abcd@12345 |
      | ert@pqr.com | Vxyz@67890 |
