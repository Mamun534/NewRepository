# Author : Mamun Chowdhury
# Date : 7/13/2021
Feature: Positive & Nagetive Test

  Scenario: Positive Testing for Login
  
    Given user in the login page
    When user enter right username
    And users enter right password
    When users click on the login button
    Then user should be able to login

  Scenario: Nagetive Dat testing for Sauce Demo
  
    Given user in the login page
    When user enter wrong username
    And users enter wrong password
    When users click on the login button
    Then user should not be able to login
