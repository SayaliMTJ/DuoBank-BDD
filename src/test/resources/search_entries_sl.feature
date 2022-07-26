
Feature: user can Search Entries in S.L

  Scenario: Search Entries-S.L
    Given application list page
    And REGISTERED user
    When I click on application list on the left menu
    And Enter S.L number on to search bar
    Then I must be able to see the application lists that have the S.L number as search bar input

