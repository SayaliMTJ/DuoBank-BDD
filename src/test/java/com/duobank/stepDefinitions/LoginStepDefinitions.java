package com.duobank.stepDefinitions;

import com.duobank.pages.LoginPage;
import com.duobank.utilities.ConfigReader;
import com.duobank.utilities.Driver;
import com.duobank.utilities.SeleniumUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

    @Given("Login Page")
    public void login_page() {
    Driver.getDriver().get(ConfigReader.getProperty("url"));
        }

    @When("Non registered user enters valid inputs on to the login form")
    public void non_registered_user_enters_valid_inputs_on_to_the_login_form() {
        LoginPage login = new LoginPage();
        login.enterEmailAddress.sendKeys("momo@momo.com");
        login.enterPassword.sendKeys("gojciP-zowkud-2fuhny");
    }

    @And("Clicks on Login button")
    public void clicks_on_login_button() {
        LoginPage loginPage = new LoginPage();
        SeleniumUtils.jsClick(loginPage.clickOnLogin);
    }

    @Then("User should be able to login")
    public void user_should_be_able_to_login() {
        Assert.assertEquals("http://qa-duobank.us-east-2.elasticbeanstalk.com/dashboard.php", Driver.getDriver().getCurrentUrl());
    }
}
