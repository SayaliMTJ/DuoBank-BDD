@TBD-5 @TBD-6
Feature: Mortgage Application - Expenses

  Background:
    Given URL LOGIN
    And REGISTERED user
    When I click on mortgage application on the left menu
    And Fill out the Pre-approval Details with valid inputs
    And Click next button on mortgage application
    And Fill out the Personal Information Details with valid inputs
    And Click next button on mortgage application

  Scenario: Mortgage Application - Expenses - Valid
    And Fill out the Expenses Details with valid inputs
    And Click next button on mortgage application
    Then I must be able to go to the Employment and Income part on the mortgage application

  Scenario: Mortgage Application - Expenses - Invalid
    And Fill out the Expenses Details with invalid inputs
    And Click next button on mortgage application
    Then I should not be able to go to the next step on mortgage application