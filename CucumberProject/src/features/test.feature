# Author : Mamun Chowdhury
# Date : 7/13/2021
Feature: Positive & Nagetive Test

  Background: For the login page
    Given user in the login page
    When users click on the login button

@regression
  Scenario: Positive Testing for Login
    When user enter right username
    And users enter right password
    Then user should be able to login

  Scenario: Nagetive Dat testing for Sauce Demo
    When user enter wrong username
    And users enter wrong password
    Then user should not be able to login
