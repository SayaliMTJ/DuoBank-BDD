@TBD-23
Feature: User Search Entries In Borrower Name

  Scenario: Search Entries - Borrower Name
    Given application list page
    And REGISTERED user
    When I click on application list on the left menu
    And Enter borrower name on to search bar
    Then I must be able to see the application lists that have the borrower name as search bar input

  @parameterized
  Scenario: Search Entries - Borrower Name - Parameterized
    Given application list page
    And REGISTERED user
    When I click on application list on the left menu
    And Enter "Jeffrey Quentin" on to search bar
    Then I must be able to see the application lists that have the "Jeffrey Quentin" as search bar input
