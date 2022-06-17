Feature: Login page related scenario

  Scenario: Verify user can login using valid credentials
    When User enters following credentials:
      | Enter Username | test@yahoo.com |
      | Enter Password | test123        |
    And User clicks on "Login" button
    Then Verify the title is "Interview App"