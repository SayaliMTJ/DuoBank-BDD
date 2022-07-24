
Feature: Application List

  Background:
    Given As a REGISTERED User
    When I click on application list on the left menu
    And  Click on S.L in the application list

  @TBD-16
  Scenario: Application List  Sort Entries by S.L.

    Then  I must be able to see the application list sorted based on ascending S.L



  @TBD-17
  Scenario: Application List  Sort_Entries by S.L.

    Then  I must be able to see the application list sorted based on descending S.L

