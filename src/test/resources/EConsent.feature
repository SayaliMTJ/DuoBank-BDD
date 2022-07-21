@TBD_11 @TBD_12
Feature: Mortgage Application - E-consent -
Background:
  Given URL Login - Loan Application
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


  Scenario:Mortgage Application - E-consent - Invalid
    And Fill out the E-consent Details with invalid inputs
    And Click next button on mortgage application
    Then I should not be able to go to the next step on mortgage application

  Scenario: Mortgage Application - E-consent - Valid
    And Fill out the E-consent Details with valid inputs
    And Click next button on mortgage application
    Then I must be able to go to the summary part on the mortgage application