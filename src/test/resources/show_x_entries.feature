@TBD-15
Feature: User Show X Entries feature

  Scenario:Application List - Show X Entries
    Given application list page
    And REGISTERED user
    When I click on application list on the left menu
    And Update the show entries value
    Then I must be able to see updated amount of mortgage applications or lower amount of mortgage applications under application list


