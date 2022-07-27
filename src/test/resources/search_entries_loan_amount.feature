@TBD-24
Feature: User Search in  Loan Amount

  Scenario: Search Entries - Loan Amount
    Given application list page
    And REGISTERED user
    When I click on application list on the left menu
    And Enter loan amount on to search bar
    Then I must be able to see the application lists that have the loan amount as search bar input

  @parameterized
  Scenario: Search Entries - Loan Amount - Parameterized
    Given application list page
    And REGISTERED user
    When I click on application list on the left menu
    And Enter 800000 on to search bar
    Then I must be able to see the application lists that have the 800000 as search bar input

  @parameterized
  Scenario: Search Entries - Loan Amount - Parameterized - Double
    Given application list page
    And REGISTERED user
    When I click on application list on the left menu
    And Enter 950000.00 on to search bar - double
    Then I should not be able to see the application lists entries