@TBD-16 @TBD-17 @TBD-20 @TBD-21
Feature: Application List - Sort Entries

  Background:
    Given URL LOGIN
    And REGISTERED user
    When I click on application list on the left menu
    And Click on Next to change the current page on right bottom
    Then I must be able to see application list repopulating

  Scenario: Application List - Sort Entries - S.L - ASC
    And Double click on S.L in the application list
    Then I must be able to see the application list sorted based on ascending S.L

  Scenario: Application List - Sort Entries - S.L - DESC
    And Click on S.L in the application list
    Then I must be able to see the application list sorted based on descending S.L

  Scenario: Application List - Sort Entries - Loan Amount - ASC
    And Click on Loan Amount in the application list
    Then I must be able to see the application list sorted based on ascending Loan Amount

  Scenario: Application List - Sort Entries - Loan Amount - DESC
    And Double click on Loan Amount in the application list
    Then I must be able to see the application list sorted based on descending Loan Amount


