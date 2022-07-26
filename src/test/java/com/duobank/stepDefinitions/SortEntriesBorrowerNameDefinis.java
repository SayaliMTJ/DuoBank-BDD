package com.duobank.stepDefinitions;

import com.duobank.pages.ApplicationsListPage;
import com.duobank.pages.LoginPage;
import com.duobank.utilities.ConfigReader;
import com.duobank.utilities.Driver;
import com.duobank.utilities.SeleniumUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class SortEntriesBorrowerNameDefinis {


    @When("Click on Borrower Name in the application list")
    public void click_on_borrower_name_in_the_application_list() {

        ApplicationsListPage listPage = new ApplicationsListPage();
        listPage.borrowerName.click();
    }

    @Then("I must be able to see the application list sorted based on ascending Borrower Name")
    public void i_must_be_able_to_see_the_application_list_sorted_based_on_ascending_borrower_name() {
        ApplicationsListPage listPage = new ApplicationsListPage();
        Assert.assertTrue(listPage.checkApplicationListSorted(2, true));
    }
    @When("Double click on Borrower Name in the application list")
    public void double_click_on_borrower_name_in_the_application_list() {
        ApplicationsListPage listPage = new ApplicationsListPage();
        listPage.borrowerName.click();
        listPage.borrowerName.click();
    }


    @Then("I must be able to see the application list sorted based on descending Borrower Name")
    public void i_must_be_able_to_see_the_application_list_sorted_based_on_descending_borrower_name() {
        ApplicationsListPage listPage = new ApplicationsListPage();
        Assert.assertTrue(listPage.checkApplicationListSorted(2, false));
}}
