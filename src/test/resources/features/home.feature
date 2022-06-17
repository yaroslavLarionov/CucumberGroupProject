Feature: Homepage related scenarios
  Background: user logs in to the web app
    Given  User enters following credentials:
      | Enter Username | test@yahoo.com |
      | Enter Password | test123        |
    And User clicks on "Login" button


  Scenario: User should have an option to add statements in Do's section
    When User clicks on "Add do " button
    And creates a "Test question" message
    And User clicks on "Enter" button
    Then User will see "Test question" displayed in that section

  Scenario: User should have an option to add statements in Dont's section
    When User clicks on "Add don't" button
    And creates a "Test question" message
    And User clicks on "Enter" button
    Then User will see "Test question" displayed in that section