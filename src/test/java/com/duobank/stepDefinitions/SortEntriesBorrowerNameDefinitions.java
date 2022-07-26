package com.duobank.stepDefinitions;

import com.duobank.pages.ApplicationsListPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;

public class SortEntriesBorrowerNameDefinitions {
    @When("Click on Borrower Name in the application list")
    public void click_on_borrower_name_in_the_application_list() {
        ApplicationsListPage listPage = new ApplicationsListPage();
        listPage.borrowerName.click();
    }

    @Then("I must be able to see the application list sorted based on ascending Borrower Name")
    public void i_must_be_able_to_see_the_application_list_sorted_based_on_ascending_borrower_name() {
        ApplicationsListPage listPage = new ApplicationsListPage();
        Assert.assertTrue(listPage.checkApplicationListSortedString(2, true));
    }
    @When("Double click on Borrower Name in the application list")
    public void double_click_on_borrower_name_in_the_application_list() {
        ApplicationsListPage listPage = new ApplicationsListPage();
        listPage.borrowerName.click();
        listPage.borrowerName.click();
    }

    @Then("I must be able to see the application list sorted based on descending Borrower Name")
    public void i_must_be_able_to_see_the_application_list_sorted_based_on_descending_borrower_name() {
        ApplicationsListPage listPage = new ApplicationsListPage();
        Assert.assertTrue(listPage.checkApplicationListSortedString(2, false));
    }
}
