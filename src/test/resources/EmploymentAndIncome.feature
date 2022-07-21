@TBD_7 @TBD_8
Feature:Mortgage Application - Employment and Income
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


  Scenario:Mortgage Application - Employment and Income - Invalid
    And Fill out the Employment and Income Details with invalid inputs
    And Click next button on mortgage application
    Then I should not be able to go to the next step on mortgage application

  Scenario:Mortgage Application - Employment and Income - Valid
    And Fill out the Employment and Income Details with valid inputs
    And Click next button on mortgage application
    Then I must be able to go to the Credit Report part on the mortgage application