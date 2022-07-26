@TBD-30
Feature: Non-registered user login feature

  Scenario: As a Non registered user should be able to login so that can use the application
    Given Login Page
    When Non registered user enters valid inputs on to the login form
    And Clicks on Login button
    Then User should be able to login