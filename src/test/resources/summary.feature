Feature: Mortgage Application - Summary

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
    And Fill out the Employment and Income Details with valid inputs
    And Click next button on mortgage application
    And Fill out the Credit Report Details with valid inputs
    And Click next button on mortgage application

  Scenario: Mortgage Application - Summary - Valid
    And Fill out the E-consent Details with valid inputs
    And Click next button on mortgage application
    And Click save button on mortgage application
    Then I must be able to save the mortgage application

  Scenario: Mortgage Application - Summary - Invalid
    And Fill out the E-consent Details with valid inputs
    And Click next button on mortgage application
    And Do not click save button on mortgage application
    Then I should not be able to save the mortgage application

