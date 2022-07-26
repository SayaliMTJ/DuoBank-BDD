Feature: User signup feature
  Scenario: A Non registered user should be able to sign up so can register to use the application

Given Signup Page
When Non registered user clicks on Sign Up
And Enters valid inputs on to the form
And Click on Sign up button
Then User should be able to sign up
