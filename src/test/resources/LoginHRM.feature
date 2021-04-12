@tag
Feature: Login functionality

  @login
  Scenario Outline: Verify login functionality
    Given I navigate to "https://opensource-demo.orangehrmlive.com/index.php/auth/login"
    When I type username "<username>" and password "<password>"
    And Click login button
    Then I verify the "<expected_result>" in step

    Examples: 
      | username | password | expected_result                                               |
      | Admin    | admin123 | https://opensource-demo.orangehrmlive.com/index.php/dashboard |
      | invalid  | admin123 | Invalid credentials                                           |
      | Admin    | invalid  | Invalid credentials                                           |
      | invalid  | invalid  | Invalid credentials                                           |
      |          | admin123 | Username cannot be empty                                      |
      | Admin    |          | Password cannot be empty                                      |
