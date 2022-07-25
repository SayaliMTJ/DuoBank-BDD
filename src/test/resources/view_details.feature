@TBD-25
Feature: Application List - View Details

  Scenario: Application List - Change Page
    Given URL LOGIN
    And REGISTERED user
    When I click on application list on the left menu
    And Get borrower information and click on view details
    Then I must be able to see the matching application information as it is shown on the list