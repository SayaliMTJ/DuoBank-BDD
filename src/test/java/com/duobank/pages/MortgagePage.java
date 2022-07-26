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
    public WebElement ClickOnMortgageApplication;

    @FindBy(id = "realtorinfo")
    public WebElement EnterPreApprovalDetails;

    @FindBy(xpath = "//a[.='Next']")
    public WebElement ClickNext;

    @FindBy(id = "b_firstName")
    public WebElement PersonalInformationDetails;

    @FindBy(xpath = "//input[@id='monthlyrentalpayment']")
    public WebElement ExpensesMonthlyRentPayment;

    @FindBy(id = "employername1")
    public WebElement EmploymentName;

    @FindBy(id = "position1")
    public WebElement EmploymentTapPosition;

    @FindBy(id = "city")
    public WebElement EmploymentTapCity;

    @FindBy(id = "state1")
    public WebElement EmploymentTapState;

    @FindBy(id = "start_date1")
    public WebElement DateEmploymentTapStartDate;

    @FindBy(id = "grossmonthlyincome")
    public WebElement DateEmploymentTapGrossMonthlyIncome;

    @FindBy(id = "eConsentdeclarerFirstName")
    public WebElement EConsentFirstName;

    @FindBy(id = "eConsentdeclarerLastName")
    public WebElement EConsentLastName;

    @FindBy(id = "eConsentdeclarerEmail")
    public WebElement EConsentEmail;

    @FindBy(id = "agree")
    public WebElement EConsentAgreeButton;

    @FindBy(id = "dontagree")
    public WebElement EConsentDontAgreeButton;

    @FindBy(id = "(//a[.='Save']")
    public WebElement CheckSummaryTap;

    @FindBy(id = "//label[.='Order Credit Report']")
    public WebElement CheckCreditReport;

    @FindBy(id = "//label[.='Monthly Rental Payment ']")
    public WebElement CheckExpenseReport;

    @FindBy(xpath = "//label[@class='danger']")
    public List<WebElement> requiredLabel;

    @FindBy(id = "creditreport2")
    public WebElement ClickNoCreditReport;


}


