@TBD-26
Feature: Application List - Change Page

  Scenario: Application List - Change Page
    Given URL LOGIN
    And REGISTERED user
    When I click on application list on the left menu
    And Click on Next to change the current page on right bottom
    Then I must be able to see application list repopulating

