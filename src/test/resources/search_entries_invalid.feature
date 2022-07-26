
Feature: User Can Search Invalid Entries

  Scenario: Search Entries - Invalid
    Given application list page
    And REGISTERED user
    When I click on application list on the left menu
    And Enter an invalid input on to search bar
    Then I should not be able to see the application lists entries
