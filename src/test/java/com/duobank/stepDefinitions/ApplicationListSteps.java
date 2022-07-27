package com.duobank.stepDefinitions;

import com.duobank.pages.ApplicationListPage;
import com.duobank.pages.DashboardPage;
import com.duobank.pages.LoginPage;
import com.duobank.pages.MortgageLoanDetailsPage;
import com.duobank.utilities.ConfigReader;
import com.duobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ApplicationListSteps {

    ApplicationListPage applicationListPage = null;
    MortgageLoanDetailsPage mortgageLoanDetailsPage = null;
    String borrowerFirstName = "";
    int borrowerAmount;

    @When("I click on application list on the left menu")
    public void i_click_on_application_list_on_the_left_menu() {
        DashboardPage.waitForMortgageApplicationButton();
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.clickApplicationListButton();
    }
    @When("Click on Next to change the current page on right bottom")
    public void click_on_next_to_change_the_current_page_on_right_bottom() {
        ApplicationListPage.waitForPaginationNextButton();
        applicationListPage = new ApplicationListPage();
        applicationListPage.clickPaginationNextButton();
    }
    @Then("I must be able to see application list repopulating")
    public void i_must_be_able_to_see_application_list_repopulating_with_the_next_amount_of_entries() {
        Assert.assertNotEquals(applicationListPage.currentActivePageNumber.getText(), "1");
    }

    @Then("Double click on S.L in the application list")
    public void double_click_on_s_l_in_the_application_list() {
        ApplicationListPage.waitApplicationListTableHeaderFirst();
        applicationListPage = new ApplicationListPage();
        applicationListPage.clickApplicationListTableHeaderFirst();
        applicationListPage.clickApplicationListTableHeaderFirst();
    }
    @Then("I must be able to see the application list sorted based on ascending S.L")
    public void i_must_be_able_to_see_the_application_list_sorted_based_on_ascending_s_l() {
        Assert.assertTrue(applicationListPage.checkApplicationListSorted(1, true));
    }

    @Then("Click on S.L in the application list")
    public void click_on_s_l_in_the_application_list() {
        ApplicationListPage.waitApplicationListTableHeaderFirst();
        applicationListPage = new ApplicationListPage();
        applicationListPage.clickApplicationListTableHeaderFirst();
    }
    @Then("I must be able to see the application list sorted based on descending S.L")
    public void i_must_be_able_to_see_the_application_list_sorted_based_on_descending_s_l() {
        Assert.assertTrue(applicationListPage.checkApplicationListSorted(1, false));
    }

    @Then("Click on Loan Amount in the application list")
    public void click_on_loan_amount_in_the_application_list() {
        ApplicationListPage.waitApplicationListTableHeaderThird();
        applicationListPage = new ApplicationListPage();
        applicationListPage.clickApplicationListTableHeaderThird();
    }

    @Then("Double click on Loan Amount in the application list")
    public void double_click_on_loan_amount_in_the_application_list() {
        ApplicationListPage.waitApplicationListTableHeaderThird();
        applicationListPage = new ApplicationListPage();
        applicationListPage.clickApplicationListTableHeaderThird();
        applicationListPage.clickApplicationListTableHeaderThird();
    }
    @Then("I must be able to see the application list sorted based on ascending Loan Amount")
    public void i_must_be_able_to_see_the_application_list_sorted_based_on_ascending_loan_amount() {
        Assert.assertTrue(applicationListPage.checkApplicationListSorted(3, true));
    }

    @Then("I must be able to see the application list sorted based on descending Loan Amount")
    public void i_must_be_able_to_see_the_application_list_sorted_based_on_descending_loan_amount() {
        Assert.assertTrue(applicationListPage.checkApplicationListSorted(3, false));
    }

    @When("Get borrower information and click on view details")
    public void get_borrower_information_and_click_on_view_details() {
        ApplicationListPage.waitForPaginationNextButton();
        applicationListPage = new ApplicationListPage();
        String borrower = applicationListPage.getFirstBorrowerInformation();
        borrowerFirstName = borrower.split(" ")[1];
        borrowerAmount = Integer.parseInt(borrower.split(" ")[3]);
        applicationListPage.clickViewDetailOnGivenRow(0);
    }
    @Then("I must be able to see the matching application information as it is shown on the list")
    public void i_must_be_able_to_see_the_matching_application_information_as_it_is_shown_on_the_list() {
        MortgageLoanDetailsPage.waitForBorrowerName();
        mortgageLoanDetailsPage = new MortgageLoanDetailsPage();
        Assert.assertEquals(mortgageLoanDetailsPage.borrowerName.getText(), borrowerFirstName);
        Assert.assertEquals(Integer.parseInt(mortgageLoanDetailsPage.loanAmount.getText()), borrowerAmount);
    }
}
