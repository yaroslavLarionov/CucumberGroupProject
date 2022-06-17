Feature: Dashboard question test
  Background: user logs in to the web app
    Given  User enters following credentials:
      | Enter Username | test@yahoo.com |
      | Enter Password | test123        |
    And User clicks on "Login" button


  Scenario: Dashboard question add question Coding
    When User click on "Coding" app
    And User clicks on "Enter new question " button in coding question
    And User submits a "Love$$Java@Coding##123" question
    And User clicks on "Enter" button
    Then User should see "Love$$Java@Coding##123" question displayed


  Scenario: Dashboard question add question Soft skills
    When User click on "Soft skills" app
    When User clicks on "Enter new question " button in coding question
    And User submits a "Love$$@SoftSkills##123" question
    And User clicks on "Enter" button
    Then User should see "Love$$@SoftSkills##123" question displayed




    
