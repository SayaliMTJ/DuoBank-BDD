package com.duobank.stepDefinitions;

import com.duobank.pages.ApplicationsListPage;
import com.duobank.pages.LoginPage;
import com.duobank.utilities.ConfigReader;
import com.duobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javafx.scene.input.InputMethodTextRun;
import org.junit.Assert;

public class SearchEntriesBorrowerNameDefins {
    @Given("application list page")
    public void application_list_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        LoginPage login= new LoginPage();
        login.enterEmailAddress.sendKeys("momo@momo.com");
        login.enterPassword.sendKeys("gojciP-zowkud-2fuhny");
        login.clickOnLogin.click();

    }
    @When("Enter borrower name on to search bar")
    public void enter_borrower_name_on_to_search_bar() throws InterruptedException {

        ApplicationsListPage listPage=new  ApplicationsListPage();
        listPage.applicationList.click();
        listPage.searchBar.sendKeys("Majd Aslan");

    }
    @Then("I must be able to see the application lists that have the borrower name as search bar input")
    public void i_must_be_able_to_see_the_application_lists_that_have_the_borrower_name_as_search_bar_input() {

        ApplicationsListPage listPage=new  ApplicationsListPage();
        String expectedText = "Majd Aslan";
        Assert.assertTrue(expectedText.contains(listPage.nameText.getText()));
    }
    }


