package com.duobank.pages;

import com.duobank.utilities.Driver;
import com.duobank.utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MortgageLoanDetailsPage {

    public MortgageLoanDetailsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//th[contains(text(), 'Loan Amount')]/following-sibling::td")
    public WebElement loanAmount;

    @FindBy(xpath = "//th[.='Name']/following-sibling::td")
    public WebElement borrowerName;

    public static void waitForBorrowerName(){
        SeleniumUtils.waitForVisibility(By.xpath("//th[.='Name']/following-sibling::td"), 5);
    }

}
