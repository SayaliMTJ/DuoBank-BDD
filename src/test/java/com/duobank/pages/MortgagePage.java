package com.duobank.pages;

import com.duobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MortgagePage {
    public MortgagePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//span[.='Mortgage Application']")
    public WebElement clickOnMortgageApplication;

    @FindBy(id = "realtorinfo")
    public WebElement enterPreApprovalDetails;

    @FindBy(xpath = "//a[.='Next']")
    public WebElement clickNext;

    @FindBy(id = "b_firstName")
    public WebElement personalInformationDetails;

    @FindBy(xpath = "//input[@id='monthlyrentalpayment']")
    public WebElement expensesMonthlyRentPayment;

    @FindBy(id = "employername1")
    public WebElement employmentName;

    @FindBy(id = "position1")
    public WebElement employmentTapPosition;

    @FindBy(id = "city")
    public WebElement employmentTapCity;

    @FindBy(id = "state1")
    public WebElement employmentTapState;

    @FindBy(id = "start_date1")
    public WebElement dateEmploymentTapStartDate;

    @FindBy(id = "grossmonthlyincome")
    public WebElement dateEmploymentTapGrossMonthlyIncome;

    @FindBy(id = "eConsentdeclarerFirstName")
    public WebElement eConsentFirstName;

    @FindBy(id = "eConsentdeclarerLastName")
    public WebElement eConsentLastName;

    @FindBy(id = "eConsentdeclarerEmail")
    public WebElement eConsentEmail;

    @FindBy(id = "agree")
    public WebElement eConsentAgreeButton;

    @FindBy(id = "dontagree")
    public WebElement eConsentDontAgreeButton;

    @FindBy(xpath = "//a[.='Save']")
    public WebElement checkSummaryTap;

    @FindBy(xpath = "//label[.='Order Credit Report']")
    public WebElement checkCreditReport;

    @FindBy(xpath = "//label[.='Monthly Rental Payment ']")
    public WebElement checkExpenseReport;

    @FindBy(xpath = "//label[@class='danger']")
    public List<WebElement> requiredLabel;

    @FindBy(id = "creditreport2")
    public WebElement clickNoCreditReport;

    @FindBy(xpath = "//a[@href='#previous']")
    public WebElement previousButton;

}
