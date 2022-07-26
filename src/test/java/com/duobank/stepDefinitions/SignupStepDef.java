package com.duobank.stepDefinitions;

import com.duobank.pages.LoginPage;
import com.duobank.pages.SignupPage;
import com.duobank.utilities.ConfigReader;
import com.duobank.utilities.Driver;
import com.duobank.utilities.SeleniumUtils;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SignupStepDef {

    @Given("Signup Page")
    public void signup_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("Non registered user clicks on Sign Up")
    public void non_registered_user_clicks_on_sign_up() {
        LoginPage loginPage = new LoginPage();
        loginPage.signup.click();
    }

    @And("Enters valid inputs on to the form")
    public void enters_valid_inputs_on_to_the_form() {
        Faker faker = new Faker();
        SignupPage signupPage = new SignupPage();
        signupPage.firstName.sendKeys(faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                faker.internet().password());
    }

    @And("Click on Sign up button")
    public void click_on_sign_up_button() {
        SignupPage signupPage = new SignupPage();
        SeleniumUtils.jsClick(signupPage.registerSignup);
    }

    @Then("User should be able to sign up")
    public void user_should_be_able_to_sign_up() {
        Assert.assertEquals("http://qa-duobank.us-east-2.elasticbeanstalk.com/index.php", Driver.getDriver().getCurrentUrl());
    }
}
