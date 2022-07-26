package com.duobank.stepDefinitions;

import com.duobank.pages.ApplicationsListPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchEntriesLoanAmountDefinitions {
    @When("Enter loan amount on to search bar")
    public void enter_loan_amount_on_to_search_bar() {
        ApplicationsListPage listPage=new  ApplicationsListPage();
        listPage.searchBar.sendKeys("720000");

    }
    @Then("I must be able to see the application lists that have the loan amount as search bar input")
    public void i_must_be_able_to_see_the_application_lists_that_have_the_loan_amount_as_search_bar_input() {
        ApplicationsListPage listPage=new  ApplicationsListPage();
        String expectedText = "720000";
        Assert.assertEquals(expectedText,listPage.loanNumber.getText());
    }
}
