Feature: Homepage related scenarios
  Background: user logs in to the web app
    Given  User enters following credentials:
      | Enter Username | test@yahoo.com |
      | Enter Password | test123        |
    And User clicks on "Login" button


  @scenarioOutlineExample
  Scenario Outline: Verify 3 dashboards are present on the homepage
    Then Verify "<dashboard>" link is displayed
    Examples:
      | dashboard   |
      | All Topics  |
      | Coding      |
      | Soft skills |


  Scenario: User should have an option to add statements in Do's section
    When User clicks on "Add do " button
    And creates a "Test message" message
    And User clicks on "Enter" button
    Then User will see "Test message" displayed in Do section


  Scenario: User should have an option to add statements in Dont's section
    When User presses the add dont button
    And creates a "Test question" message
    And User clicks on "Enter" button
    Then User will see "Test question" displayed in Don't section