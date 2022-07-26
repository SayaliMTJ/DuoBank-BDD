
Feature: User can Sort Entries Action

  Scenario: Sort Entries - Action
    Given i am on application page
    And REGISTERED user
    When I click on application list on the left menu
    And Click on Action in the application list
    Then I should not be able to change the order of application list
