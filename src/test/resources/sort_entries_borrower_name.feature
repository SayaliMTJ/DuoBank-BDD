@TBD-19 @TBD-18
Feature: User Can Sort Entries - Borrower Name - ASC/DESC

  Scenario:Sort Entries - Borrower Name - ASC
    Given application list page
    And REGISTERED user
    When I click on application list on the left menu
    And Click on Borrower Name in the application list
    Then I must be able to see the application list sorted based on ascending Borrower Name


  Scenario:Sort Entries - Borrower Name - DESC
    Given application list page
    And REGISTERED user
    When I click on application list on the left menu
    And Double click on Borrower Name in the application list
    Then I must be able to see the application list sorted based on descending Borrower Name
