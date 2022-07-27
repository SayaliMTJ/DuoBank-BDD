package com.duobank.stepDefinitions;

import com.duobank.pages.LoginPage;
import com.duobank.pages.MortgagePage;
import com.duobank.utilities.ConfigReader;
import com.duobank.utilities.Driver;
import com.duobank.utilities.SeleniumUtils;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class MortgageApplicationDuoBank {

    @Given("URL Login - Loan Application")
    public void url_login_loan_application(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Given("REGISTERED user")
    public void registered_user() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigReader.getProperty("username"),ConfigReader.getProperty("password"));
    }

    @When("I click on mortgage application on the left menu")
    public void i_click_on_mortgage_application_on_the_left_menu() {
        MortgagePage mortgagePage = new MortgagePage();
        SeleniumUtils.jsClick(mortgagePage.clickOnMortgageApplication);
    }

    @When("Fill out the Pre-approval Details with valid inputs")
    public void fill_out_the_pre_approval_details_with_valid_inputs() {
        MortgagePage mortgagePage = new MortgagePage();
        mortgagePage.enterPreApprovalDetails.sendKeys("Majd fisher"+ Keys.TAB +Keys.TAB + "1000000"+Keys.TAB+
        Keys.TAB+"20");
    }

    @When("Click next button on mortgage application")
    public void click_next_button_on_mortgage_application() {
        MortgagePage mortgagePage = new MortgagePage();
        SeleniumUtils.jsClick(mortgagePage.clickNext);
    }

    @When("Fill out the Personal Information Details with valid inputs")
    public void fill_out_the_personal_information_details_with_valid_inputs() {
        MortgagePage mortgagePage = new MortgagePage();
        Faker faker = new Faker();
        mortgagePage.personalInformationDetails.sendKeys("majd"+Keys.TAB+Keys.TAB+"fisher"+Keys.TAB+Keys.TAB
                +faker.internet().emailAddress()+Keys.TAB+"11"+"12"+"1990"+Keys.TAB+faker.number().digits(9)+Keys.TAB+
                Keys.ENTER+Keys.ARROW_DOWN+Keys.ENTER+Keys.TAB+ faker.phoneNumber().cellPhone());
    }

    @When("Fill out the Expenses Details with valid inputs")
    public void fill_out_the_expenses_details_with_valid_inputs() {
        MortgagePage mortgagePage = new MortgagePage();
        Faker faker = new Faker();
        mortgagePage.expensesMonthlyRentPayment.sendKeys(faker.number().digits(4));

    }
    @When("Fill out the Employment and Income Details with valid inputs")
    public void fill_out_the_employment_and_income_details_with_valid_inputs() {
        MortgagePage mortgagePage = new MortgagePage();
        Faker faker = new Faker();
        mortgagePage.employmentName.sendKeys(faker.name().fullName());
        mortgagePage.employmentTapPosition.sendKeys(faker.job().position());
        mortgagePage.employmentTapCity.sendKeys(faker.address().city());
        Select select = new Select(mortgagePage.employmentTapState);
        select.selectByValue("AK");
        mortgagePage.dateEmploymentTapStartDate.sendKeys("11132021");
        mortgagePage.dateEmploymentTapGrossMonthlyIncome.sendKeys(faker.number().digits(4));
    }

    @When("Fill out the Credit Report Details with valid inputs")
    public void fill_out_the_credit_report_details_with_valid_inputs() {
        MortgagePage mortgagePage = new MortgagePage();
        SeleniumUtils.jsClick(mortgagePage.clickNoCreditReport);
    }

    @When("Fill out the E-consent Details with invalid inputs")
    public void fill_out_the_e_consent_details_with_invalid_inputs() {
        MortgagePage mortgagePage = new MortgagePage();
        Faker faker = new Faker();
        mortgagePage.eConsentFirstName.sendKeys(faker.name().firstName());
        mortgagePage.eConsentLastName.sendKeys(faker.name().lastName());
        mortgagePage.eConsentEmail.sendKeys(faker.internet().emailAddress());
        SeleniumUtils.jsClick(mortgagePage.eConsentDontAgreeButton);
    }

    @Then("I should not be able to go to the next step on mortgage application")
    public void i_should_not_be_able_to_go_to_the_next_step_on_mortgage_application() {
        MortgagePage mortgagePage = new MortgagePage();

        if(mortgagePage.requiredLabel.size() > 1){
            Assert.assertTrue(mortgagePage.requiredLabel.get(mortgagePage.requiredLabel.size() - 1).isDisplayed());
        }
        else{
            Assert.assertTrue(mortgagePage.previousButton.isDisplayed());
        }
    }

    @When("Fill out the E-consent Details with valid inputs")
    public void fill_out_the_e_consent_details_with_valid_inputs() {
        MortgagePage mortgagePage = new MortgagePage();
        Faker faker = new Faker();
        mortgagePage.eConsentFirstName.sendKeys(faker.name().firstName());
        mortgagePage.eConsentLastName.sendKeys(faker.name().lastName());
        mortgagePage.eConsentEmail.sendKeys(faker.internet().emailAddress());
        SeleniumUtils.jsClick(mortgagePage.eConsentAgreeButton);
    }

    @Then("I must be able to go to the summary part on the mortgage application")
    public void i_must_be_able_to_go_to_the_summary_part_on_the_mortgage_application() {
        SeleniumUtils.waitForVisibility(By.xpath("//a[.='Save']"),4);
        MortgagePage mortgagePage = new MortgagePage();
        Assert.assertTrue(mortgagePage.checkSummaryTap.isDisplayed());
    }

    @When("Fill out the Employment and Income Details with invalid inputs")
    public void fill_out_the_employment_and_income_details_with_invalid_inputs() {
        MortgagePage mortgagePage = new MortgagePage();
        Faker faker = new Faker();
        mortgagePage.employmentName.sendKeys(faker.name().fullName());
        mortgagePage.employmentTapPosition.sendKeys(faker.job().position());
        mortgagePage.employmentTapCity.sendKeys(faker.address().city());
        Select select = new Select(mortgagePage.employmentTapState);
        select.selectByValue("AK");
        mortgagePage.dateEmploymentTapStartDate.sendKeys("11132021");
    }

    @Then("I must be able to go to the Credit Report part on the mortgage application")
    public void i_must_be_able_to_go_to_the_credit_report_part_on_the_mortgage_application() {
        SeleniumUtils.waitForVisibility(By.xpath("//label[.='Order Credit Report']"),3);
        MortgagePage mortgagePage = new MortgagePage();
        Assert.assertTrue(mortgagePage.checkCreditReport.isDisplayed());
    }

    @When("Fill out the Personal Information Details with invalid inputs")
    public void fill_out_the_personal_information_details_with_invalid_inputs() {
        MortgagePage mortgagePage = new MortgagePage();
        Faker faker = new Faker();
        mortgagePage.personalInformationDetails.sendKeys(faker.name().firstName() + Keys.TAB + Keys.TAB + faker.number().digits(3) + Keys.TAB + Keys.TAB
                + faker.internet().emailAddress() + Keys.TAB + "11" + "12" + "1990" + Keys.TAB + faker.number().digits(9) + Keys.TAB +
                Keys.ENTER + Keys.ARROW_DOWN + Keys.ENTER + Keys.TAB + faker.phoneNumber().cellPhone());
    }
    @Then("I must be able to go to the Expenses part on the mortgage application")
    public void i_must_be_able_to_go_to_the_expenses_part_on_the_mortgage_application () {
        MortgagePage mortgagePage = new MortgagePage();
        SeleniumUtils.waitForVisibility(mortgagePage.checkExpenseReport,3);
        Assert.assertTrue(mortgagePage.checkExpenseReport.isDisplayed());
    }
}
