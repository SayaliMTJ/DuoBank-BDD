package com.duobank.stepDefinitions;

import com.duobank.pages.DashboardPage;
import com.duobank.pages.LoginPage;
import com.duobank.pages.MortgagePage;
import com.duobank.utilities.ConfigReader;
import com.duobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MortgageApplicationSteps {
    MortgagePage mortgagePage = null;
    @Given("URL LOGIN")
    public void url_login() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Given("REGISTERED user")
    public void registered_user() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
    }
    @When("I click on mortgage application on the left menu")
    public void i_click_on_mortgage_application_on_the_left_menu() {
        DashboardPage.waitForMortgageApplicationButton();
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.clickMortgageApplicationButton();
    }
    @When("Fill out the Pre-approval Details with valid inputs")
    public void fill_out_the_pre_approval_details_with_valid_inputs() {
        MortgagePage.waitForRealtorInfoInput();
        mortgagePage = new MortgagePage();
        mortgagePage.fillOutPreApprovalInfo();
        Assert.assertEquals(mortgagePage.calculateDownPaymentPercentage(), mortgagePage.getPercentageAmount());
    }
    @When("Click next button on mortgage application")
    public void click_next_button_on_mortgage_application() {
        mortgagePage.clickNextButton();
    }

    @Then("I must be able to go to the Personal Information part on the mortgage application")
    public void i_must_be_able_to_go_to_the_personal_information_part_on_the_mortgage_application() {
        MortgagePage.waitForPersonalInformationTitle();
        Assert.assertTrue(mortgagePage.personalInformationTitle.isDisplayed());
    }

    @When("Fill out the Pre-approval Details with invalid inputs")
    public void fill_out_the_pre_approval_details_with_invalid_inputs() {
        MortgagePage.waitForRealtorInfoInput();
        mortgagePage = new MortgagePage();
        mortgagePage.fillOutPreApprovalInfoInvalid();
    }
    @Then("I should not be able to go to the next step on mortgage application")
    public void i_should_not_be_able_to_go_to_the_next_step_on_mortgage_application() {
        Assert.assertTrue(mortgagePage.requiredLabel.get(mortgagePage.requiredLabel.size() - 1).isDisplayed());
    }

    @When("Fill out the Personal Information Details with valid inputs")
    public void fill_out_the_personal_information_details_with_valid_inputs() {
        MortgagePage.waitForBorrowerFirstNameInput();
        mortgagePage.fillOutPersonalInfo();
    }
    @When("Fill out the Expenses Details with valid inputs")
    public void fill_out_the_expenses_details_with_valid_inputs() {
        MortgagePage.waitForExpensesMonthlyRentalPaymentInput();
        mortgagePage.fillOutMonthlyRentalPayment();
    }
    @Then("I must be able to go to the Employment and Income part on the mortgage application")
    public void i_must_be_able_to_go_to_the_employment_and_income_part_on_the_mortgage_application() {
        MortgagePage.waitForBorrowerEmploymentInformationTitle();
        Assert.assertTrue(mortgagePage.borrowerEmploymentInformationTitle.isDisplayed());
    }

    @When("Fill out the Expenses Details with invalid inputs")
    public void fill_out_the_expenses_details_with_invalid_inputs() {
        mortgagePage.fillOutMonthlyRentalPaymentInvalid();
    }

    @When("Fill out the Employment and Income Details with valid inputs")
    public void fill_out_the_employment_and_income_details_with_valid_inputs() {
        MortgagePage.waitForEmploymentAndIncome();
        mortgagePage.fillOutEmploymentAndIncomeInfo();
    }

    @When("Fill out the Credit Report Details with valid inputs")
    public void fill_out_the_credit_report_details_with_valid_inputs() {
        MortgagePage.waitForCreditReportYes();
        mortgagePage.clickOrderCreditReportYesInput();
    }

    @Then("I must be able to go to the E-consent part on the mortgage application")
    public void i_must_be_able_to_go_to_the_e_consent_part_on_the_mortgage_application() {
        MortgagePage.waitForeConsentTitle();
        Assert.assertTrue(mortgagePage.eConsentTitle.isDisplayed());
    }

    @When("Fill out the Credit Report Details with invalid inputs")
    public void fill_out_the_credit_report_details_with_invalid_inputs() {
        mortgagePage.creditReportInvalidInput();
    }
}
