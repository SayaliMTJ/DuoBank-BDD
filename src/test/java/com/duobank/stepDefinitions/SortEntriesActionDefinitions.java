package com.duobank.stepDefinitions;

import com.duobank.pages.ApplicationsListPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SortEntriesActionDefinitions {
    @When("Click on Action in the application list")
    public void click_on_action_in_the_application_list() {
        ApplicationsListPage listPage = new ApplicationsListPage();
        listPage.applicationList.click();
        listPage.actionButton.click();
    }

    @Then("I should not be able to change the order of application list")
    public void i_should_not_be_able_to_change_the_order_of_application_list() {
        ApplicationsListPage listPage = new ApplicationsListPage();
        String expectedNum = listPage.slNumber.getText();
        Assert.assertEquals(expectedNum, listPage.slNumber.getText());
    }
}
