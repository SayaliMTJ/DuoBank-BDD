package com.duobank.stepDefinitions;

import com.duobank.pages.LoginPage;
import com.duobank.pages.MortgagePage;
import com.duobank.utilities.ConfigReader;
import com.duobank.utilities.Driver;
import com.duobank.utilities.SeleniumUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class MortgageApplicationDuoBank {
    @Given("URL Login - Loan Application")
    public void url_login_loan_application() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Given("REGISTERED user")
    public void registered_user() throws InterruptedException {
        LoginPage loginPage=new LoginPage();
        loginPage.login(ConfigReader.getProperty("username"),ConfigReader.getProperty("password"));

//        LoginStepDefs login = new LoginStepDefs();
//        login.i_enter_as_a_username_and_as_password(ConfigReader.getProperty("username"),ConfigReader.getProperty("password"));


    }
    @When("I click on mortgage application on the left menu")
    public void i_click_on_mortgage_application_on_the_left_menu() throws InterruptedException {
        Thread.sleep(4000);
        MortgagePage mortgagePage =new MortgagePage();
        SeleniumUtils.jsClick(mortgagePage.ClickOnMortgageApplication);
    }
    @When("Fill out the Pre-approval Details with valid inputs")
    public void fill_out_the_pre_approval_details_with_valid_inputs() throws InterruptedException {
        Thread.sleep(2000);
        MortgagePage mortgagePage =new MortgagePage();
        mortgagePage.EnterPreApprovalDetails.sendKeys("Majd fisher"+ Keys.TAB +Keys.TAB + "1000000");
    }
    @When("Click next button on mortgage application")
    public void click_next_button_on_mortgage_application() {

    }
    @When("Fill out the Personal Information Details with valid inputs")
    public void fill_out_the_personal_information_details_with_valid_inputs() {

    }
    @When("Fill out the Expenses Details with valid inputs")
    public void fill_out_the_expenses_details_with_valid_inputs() {

    }
    @When("Fill out the Employment and Income Details with valid inputs")
    public void fill_out_the_employment_and_income_details_with_valid_inputs() {

    }
    @When("Fill out the Credit Report Details with valid inputs")
    public void fill_out_the_credit_report_details_with_valid_inputs() {

    }
    @When("Fill out the E-consent Details with invalid inputs")
    public void fill_out_the_e_consent_details_with_invalid_inputs() {

    }
    @Then("I should not be able to go to the next step on mortgage application")
    public void i_should_not_be_able_to_go_to_the_next_step_on_mortgage_application() {

    }
    @When("Fill out the E-consent Details with valid inputs")
    public void fill_out_the_e_consent_details_with_valid_inputs() {

    }
    @Then("I must be able to go to the summary part on the mortgage application")
    public void i_must_be_able_to_go_to_the_summary_part_on_the_mortgage_application() {

    }
    @When("Fill out the Employment and Income Details with invalid inputs")
    public void fill_out_the_employment_and_income_details_with_invalid_inputs() {

    }
    @Then("I must be able to go to the Credit Report part on the mortgage application")
    public void i_must_be_able_to_go_to_the_credit_report_part_on_the_mortgage_application() {

    }
    @When("Fill out the Personal Information Details with invalid inputs")
    public void fill_out_the_personal_information_details_with_invalid_inputs() {

    }
    @Then("I must be able to go to the Expenses part on the mortgage application")
    public void i_must_be_able_to_go_to_the_expenses_part_on_the_mortgage_application() {

    }


}