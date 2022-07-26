package com.duobank.stepDefinitions;

import com.duobank.pages.ApplicationsListPage;
import com.duobank.pages.LoginPage;
import com.duobank.utilities.ConfigReader;
import com.duobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchEntriesLoanAmountDefin {


//    @Given("application list page")
//    public void application_list_page() {
//        Driver.getDriver().get(ConfigReader.getProperty("url"));
//        LoginPage login = new LoginPage();
//        login.enterEmailAddress.sendKeys("momo@momo.com");
//        login.enterPassword.sendKeys("gojciP-zowkud-2fuhny");
//        login.clickOnLogin.click();
//    }
//
//    @When("I click on application list on the left menu")
//    public void i_click_on_application_list_on_the_left_menu() {
//        ApplicationsListPage listPage=new  ApplicationsListPage();
//        listPage.applicationList.click();

    //}
    @When("Enter loan amount on to search bar")
    public void enter_loan_amount_on_to_search_bar() {
        ApplicationsListPage listPage=new  ApplicationsListPage();
        listPage.searchBar.sendKeys("720000");

    }
    @Then("I must be able to see the application lists that have the loan amount as search bar input")
    public void i_must_be_able_to_see_the_application_lists_that_have_the_loan_amount_as_search_bar_input() {
        ApplicationsListPage listPage=new  ApplicationsListPage();
        String expectedText = "720000";
        Assert.assertEquals(expectedText,listPage.loanNumber.getText());


    }


}