Feature: Dashboard question test
  Background: user logs in to the web app
    Given  User enters following credentials:
      | Enter Username | test@yahoo.com |
      | Enter Password | test123        |
    And User clicks on "Login" button


  Scenario: Dashboard question add question Coding
    Given User click on "Coding" app
    When User clicks on "Enter new question " button in coding question
    Then User should be able to add question with letter, number and special characters in coding.
    And User "Click Enter" button

  Scenario: Dashboard question add question Soft skills
    Given User click on "Soft skills" app
    When User clicks on "Enter new question " button in coding question
    Then User should be able to add question with letter, number and special characters in Soft skills.
    And User "Click Enter" button




    
