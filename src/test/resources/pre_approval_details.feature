@TBD-32
Feature: Mortgage Application - Pre-approval Details

  Background:
    Given URL LOGIN
    And REGISTERED user
    When I click on mortgage application on the left menu

  Scenario Outline: Mortgage Application - Expenses - Valid
    When I enter valid "<REALTOR INFORMATION>" as realtor info, "<ESTIMATED PURCHASE>" as purchase, "<DOWN PAYMENT AMOUNT>" as down payment amount, "<DOWN PAYMENT PERCENTAGE>" as down payment percentage
    Then I must be able to go to the Personal Information part on the mortgage application
    Examples: valid Pre-Approval

      |REALTOR INFORMATION||ESTIMATED PURCHASE||DOWN PAYMENT AMOUNT||DOWN PAYMENT PERCENTAGE|
      |Jason Smith        ||100000            ||5000               ||5                      |
      |(408)744-2333      ||200000            ||30000              ||15                     |
      |jason@gmail.com    ||1000000           ||70000              ||7                      |

  Scenario Outline: Mortgage Application - Expenses - InValid

    When I enter invalid "<REALTOR INFORMATION>" as realtor info, "<ESTIMATED PURCHASE>" as purchase, "<DOWN PAYMENT AMOUNT>" as down payment amount, "<DOWN PAYMENT PERCENTAGE>" as down payment percentage

    Then I should not be able to navigate to the Personal Information tap

    Examples: invalid Pre-Approval

      |REALTOR INFORMATION||ESTIMATED PURCHASE||DOWN PAYMENT AMOUNT||DOWN PAYMENT PERCENTAGE|
      |12vdhf3456jdhd     ||6jdhd             ||a20d               ||fhgdd                  |
      |dsds5363           ||a4y57jfjf         ||a20d               ||jhjgi                  |

  Scenario Outline: Mortgage Application - Expenses - Invalid Percentage

   When I enter valid "<REALTOR INFORMATION>" as realtor info, "<ESTIMATED PURCHASE>" as purchase, "<DOWN PAYMENT PERCENTAGE>" as down payment percentage, "<DOWN PAYMENT AMOUNT>" as invalid down payment amount

    Then I should not be able to navigate to the Personal Information tap

    Examples: valid Pre-Approval with invalid percentage

      |REALTOR INFORMATION||ESTIMATED PURCHASE||DOWN PAYMENT PERCENTAGE||DOWN PAYMENT AMOUNT|

      |Jason Smith        ||100000            ||105                    ||5000               |
      |(408)744-2333      ||200000            ||1500                   ||30000              |
      |jason@gmail.com    ||1000000           ||700                    ||70000              |
