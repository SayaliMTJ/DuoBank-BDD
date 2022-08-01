@TBD-37
Feature: Mortgage Application - Expenses

  Background:
    Given URL LOGIN
    And REGISTERED user
    When I click on mortgage application on the left menu
    And Fill out the Pre-approval Details with valid inputs
    And Click next button on mortgage application
    And Fill out the Personal Information Details with valid inputs
    And Click next button on mortgage application

  Scenario Outline: Mortgage Application - Expenses - Valid
    When I enter "<MONTHLY RENTAL PAYMENT>" as a Rental Payment
    Then I must be able to navigate to the Employment and income tap

    Examples: valid monthly rental payment
      |MONTHLY RENTAL PAYMENT|
      |150000                |
      |1                     |
      |120                   |



  Scenario Outline: Mortgage Application - Expenses - InValid
    When I enter invalid "<MONTHLY RENTAL PAYMENT>" as an invalid Rental Payment
    Then I should not be able to navigate to the Employment and income tap

    Examples: invalid monthly rental payment
      |MONTHLY RENTAL PAYMENT|
      |helloworld            |
      |4jhbiufh              |
      |dhgvd0                |
