package com.duobank.pages;

import com.duobank.utilities.Driver;
import com.duobank.utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@href='mortagage.php']")
    public WebElement mortgageApplicationButton;

    @FindBy(xpath = "//a[@href='applications.php']")
    public WebElement applicationListButton;


    public static void waitForMortgageApplicationButton(){
        SeleniumUtils.waitForVisibility(By.xpath("//a[@href='mortagage.php']"), 5);
    }

    public void clickMortgageApplicationButton(){
        mortgageApplicationButton.click();
    }



    public void clickApplicationListButton(){
        applicationListButton.click();
    }

}
