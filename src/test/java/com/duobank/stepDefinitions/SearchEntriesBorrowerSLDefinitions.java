package com.duobank.stepDefinitions;

import com.duobank.pages.ApplicationsListPage;
import com.duobank.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchEntriesBorrowerSLDefinitions {

    @When("Enter S.L number on to search bar")
    public void enter_s_l_number_on_to_search_bar() {
        ApplicationsListPage listPage = new ApplicationsListPage();
        listPage.applicationList.click();
        listPage.searchBar.sendKeys("2");
    }

    @Then("I must be able to see the application lists that have the S.L number as search bar input")
    public void i_must_be_able_to_see_the_application_lists_that_have_the_s_l_number_as_search_bar_input() {
        ApplicationsListPage listPage = new  ApplicationsListPage();
        String expectedText = "2";
        Assert.assertEquals(expectedText, listPage.slNumber.getText());
    }
}
