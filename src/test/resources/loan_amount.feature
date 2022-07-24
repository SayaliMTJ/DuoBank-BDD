
Feature: Loan Amount

  Background:
    Given As a REGISTERED User
    When I click on application list on the left menu
    And  Click on Loan Amount in the application list

  @TBD-20
  Scenario: Application List  Sort Entries Loan Amount - ASC

    Then I must be able to see the application list sorted based on ascending Loan Amount

  @TBD-21
  Scenario: Application List  Sort Entries Loan Amount - DESC

    Then  I must be able to see the application list sorted based on descending Loan Amount

