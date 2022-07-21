@TBD_4 @TBD_2
Feature: personal information

  Background:
    Given URL Login - Loan Application
    And REGISTERED user


  Scenario:Mortgage Application - Personal Information - Invalid
    When I click on mortgage application on the left menu
    And Fill out the Pre-approval Details with valid inputs
    And Click next button on mortgage application
    And Fill out the Personal Information Details with invalid inputs
    And Click next button on mortgage application
    Then I should not be able to go to the next step on mortgage application

  Scenario:Mortgage Application - Personal Information - Valid
    When I click on mortgage application on the left menu
    And Fill out the Pre-approval Details with valid inputs
    And Click next button on mortgage application
    And Fill out the Personal Information Details with valid inputs
    And Click next button on mortgage application
    Then I must be able to go to the Expenses part on the mortgage application

