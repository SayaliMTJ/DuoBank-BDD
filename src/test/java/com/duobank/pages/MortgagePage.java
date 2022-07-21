package com.duobank.pages;

import com.duobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MortgagePage {
    public MortgagePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//span[.='Mortgage Application']")
    public WebElement ClickOnMortgageApplication;

    @FindBy(id = "realtorinfo")
    public WebElement EnterPreApprovalDetails;
}


