package com.duobank.stepDefinitions;

import com.duobank.pages.ApplicationsListPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class ShowXEntriesDefinitions {
    @When("Update the show entries value")
    public void update_the_show_entries_value() {
        ApplicationsListPage listPage = new ApplicationsListPage();
        listPage.entriesButton.click();
        Select xEntries = new Select(listPage.entriesButton);
        xEntries.selectByVisibleText("50");
    }

    @Then("I must be able to see updated amount of mortgage applications or lower amount of mortgage applications under application list")
    public void i_must_be_able_to_see_updated_amount_of_mortgage_applications_or_lower_amount_of_mortgage_applications_under_application_list() {
        ApplicationsListPage listPage = new ApplicationsListPage();
        String entriesValueAfterChanging = listPage.entriesButtonAfterChanging.getText();
        String messageAfterChanging = listPage.entriesMsg.getText();
        Assert.assertTrue(messageAfterChanging.contains(entriesValueAfterChanging));
    }
}
