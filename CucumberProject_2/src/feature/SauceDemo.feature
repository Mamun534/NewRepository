Feature: Positive & Nagetive Test and Sauce Demo Shopping

  Background: 
    Given user in the login page
    When users click on the login button

  Scenario: Positive Testing for Login
    When user enter right username
    And users enter right password
    Then user should be able to login

  Scenario: Nagetive Dat testing for Sauce Demo
    When user enter wrong username
    And users enter wrong password
    Then user should not be able to login