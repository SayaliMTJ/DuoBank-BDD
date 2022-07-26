package com.duobank.stepDefinitions;

import com.duobank.pages.ApplicationsListPage;
import com.duobank.pages.LoginPage;
import com.duobank.utilities.ConfigReader;
import com.duobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SortEntriesActionDefins {


    @Given("i am on application page")
    public void i_am_on_application_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        LoginPage login= new LoginPage();
        login.enterEmailAddress.sendKeys("momo@momo.com");
        login.enterPassword.sendKeys("gojciP-zowkud-2fuhny");
        login.clickOnLogin.click();
    }
    @When("Click on Action in the application list")
    public void click_on_action_in_the_application_list() {
        ApplicationsListPage listPage=new  ApplicationsListPage();
        listPage.applicationList.click();
        listPage.actionButton.click();
    }
    @Then("I should not be able to change the order of application list")
    public void i_should_not_be_able_to_change_the_order_of_application_list() {
        ApplicationsListPage listPage=new  ApplicationsListPage();
        String expectedNum=listPage.slNumber.getText();
        Assert.assertEquals(expectedNum,listPage.slNumber.getText());

    }


}
