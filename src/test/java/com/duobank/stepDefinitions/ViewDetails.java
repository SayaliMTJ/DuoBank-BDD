package com.duobank.stepDefinitions;

import com.duobank.pages.LoginPage;
import com.duobank.utilities.ConfigReader;
import com.duobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewDetails {
    @When("Click on view details")
    public void click_on_view_details() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        LoginPage login= new LoginPage();
        login.enterEmailAddress.sendKeys("momo@momo.com");
        login.enterPassword.sendKeys("gojciP-zowkud-2fuhny");
        login.clickOnLogin.click();

    }
    @Then("I must be able to see the matching application information as it is shown on the list")
    public void i_must_be_able_to_see_the_matching_application_information_as_it_is_shown_on_the_list() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        LoginPage login= new LoginPage();
        login.enterEmailAddress.sendKeys("momo@momo.com");
        login.enterPassword.sendKeys("gojciP-zowkud-2fuhny");
        login.clickOnLogin.click();
    }

}
