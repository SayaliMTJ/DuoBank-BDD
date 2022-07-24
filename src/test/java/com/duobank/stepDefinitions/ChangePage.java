package com.duobank.stepDefinitions;

import com.duobank.pages.AppList;
import com.duobank.pages.LoginPage;
import com.duobank.utilities.ConfigReader;
import com.duobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ChangePage {
    @When("Click on Next to change the current page on right bottom")
    public void click_on_next_to_change_the_current_page_on_right_bottom() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        LoginPage login= new LoginPage();
        login.enterEmailAddress.sendKeys("momo@momo.com");
        login.enterPassword.sendKeys("gojciP-zowkud-2fuhny");
        login.clickOnLogin.click();

        AppList appList = new AppList ();
        appList.nextButton.click();

        //Assert.assertTrue();





    }
    @Then("I must be able to see application list repopulating")
    public void i_must_be_able_to_see_application_list_repopulating() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        LoginPage login= new LoginPage();
        login.enterEmailAddress.sendKeys("momo@momo.com");
        login.enterPassword.sendKeys("gojciP-zowkud-2fuhny");
        login.clickOnLogin.click();




    }


}
