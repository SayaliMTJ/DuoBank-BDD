@TBD-9 @TBD-10
Feature: Mortgage Application - Credit Report

  Background:
    Given URL LOGIN
    And REGISTERED user
    When I click on mortgage application on the left menu
    And Fill out the Pre-approval Details with valid inputs
    And Click next button on mortgage application
    And Fill out the Personal Information Details with valid inputs
    And Click next button on mortgage application
    And Fill out the Expenses Details with valid inputs
    And Click next button on mortgage application

  Scenario: Mortgage Application - Credit Report - Valid
    And Fill out the Employment and Income Details with valid inputs
    And Click next button on mortgage application
    And Fill out the Credit Report Details with valid inputs
    And Click next button on mortgage application
    Then I must be able to go to the E-consent part on the mortgage application

  Scenario: Mortgage Application - Credit Report - Invalid
    And Fill out the Employment and Income Details with valid inputs
    And Click next button on mortgage application
    And Fill out the Credit Report Details with invalid inputs
    And Click next button on mortgage application
    Then I should not be able to go to the next step on mortgage application