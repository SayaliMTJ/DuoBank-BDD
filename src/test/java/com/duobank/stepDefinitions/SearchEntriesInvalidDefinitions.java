package com.duobank.stepDefinitions;

import com.duobank.pages.ApplicationsListPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchEntriesInvalidDefinitions {
    @When("Enter an invalid input on to search bar")
    public void enter_an_invalid_input_on_to_search_bar() {
        ApplicationsListPage listPage= new  ApplicationsListPage();
        listPage.applicationList.click();
        listPage.searchBar.sendKeys("@");
    }
    @Then("I should not be able to see the application lists entries")
    public void i_should_not_be_able_to_see_the_application_lists_entries() {
        ApplicationsListPage listPage=new  ApplicationsListPage();
        String expectedText = "No matching records found";
        Assert.assertEquals(expectedText,listPage.noMatchingMsg.getText());
    }
}
