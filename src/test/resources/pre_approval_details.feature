@TBD-1 @TBD-3
Feature: Mortgage Application - Pre-approval Details

  Background:
    Given URL LOGIN
    And REGISTERED user
    When I click on mortgage application on the left menu

  Scenario: Mortgage Application - Pre-approval Details - Valid
    And Fill out the Pre-approval Details with valid inputs
    And Click next button on mortgage application
    Then I must be able to go to the Personal Information part on the mortgage application

  Scenario: Mortgage Application - Pre-approval Details - Invalid
    And Fill out the Pre-approval Details with invalid inputs
    And Click next button on mortgage application
    Then I should not be able to go to the next step on mortgage application