package com.duobank.pages;

import com.duobank.utilities.Driver;
import com.duobank.utilities.SeleniumUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MortgagePage {
    public MortgagePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Pre-approval Details Inputs
    @FindBy(id = "realtorinfo")
    public WebElement realtorInfoInput;

    @FindBy(name = "est_purchase_price")
    public WebElement estPurchasePriceInput;

    @FindBy(name = "down_payment")
    public WebElement downPaymentAmountInput;

    @FindBy(name = "total_loan_amount")
    public WebElement totalLoanAmountInput;

    @FindBy(name = "down_payment_percent")
    public WebElement dowPaymentPercentageAmountInput;

    @FindBy(xpath = "//a[@href='#previous']")
    public WebElement previousButton;
    @FindBy(xpath = "//a[@href='#next']")
    public WebElement nextButton;

    @FindBy(xpath = "//h6[.='Personal Information']")
    public WebElement personalInformationTitle;

    @FindBy(xpath = "//label[@class='danger']")
    public List<WebElement> requiredLabel;

    //Personal Information Inputs
    @FindBy(id = "b_firstName")
    public WebElement borrowerFirstNameInput;

    @FindBy(id = "b_lastName")
    public WebElement borrowerLastNameInput;

    @FindBy(id = "b_email")
    public WebElement borrowerEmailInput;

    @FindBy(id = "b_dob")
    public WebElement borrowerBirthdayInput;

    @FindBy(id = "b_ssn")
    public WebElement borrowerSSNInput;

    @FindBy(id = "b_marital")
    public WebElement borrowerMaritalInput;

    @FindBy(id = "b_cell")
    public WebElement borrowerCellPhoneInput;

    @FindBy(xpath = "//h6[.='Borrower Employment Information']")
    public WebElement borrowerEmploymentInformationTitle;

    //Expenses Inputs
    @FindBy(id = "monthlyrentalpayment")
    public WebElement expensesMonthlyRentalPaymentInput;

    //Employment and Income Inputs

    @FindBy(id = "employername1")
    public WebElement employerNameInput;

    @FindBy(id = "position1")
    public WebElement jobPositionInput;

    @FindBy(id = "city")
    public WebElement jobCityInput;

    @FindBy(id = "state1")
    public WebElement jobStateInput;

    @FindBy(id = "start_date1")
    public WebElement jobStartDateInput;

    @FindBy(id = "grossmonthlyincome")
    public WebElement grossMonthlyIncomeInput;

    //Credit Report
    @FindBy(id = "creditreport1")
    public WebElement orderCreditReportYesInput;

    @FindBy(id = "creditreport2")
    public WebElement orderCreditReportNoInput;

    @FindBy(xpath = "//h4[.='eConsent']")
    public WebElement eConsentTitle;

    //Econsent
    @FindBy(id = "eConsentdeclarerFirstName")
    public WebElement eConsentFirstNameInput;

    @FindBy(id = "eConsentdeclarerLastName")
    public WebElement eConsentLastNameInput;

    @FindBy(id = "eConsentdeclarerEmail")
    public WebElement eConsentEmailInput;

    @FindBy(id = "agree")
    public WebElement eConsentAgreeInput;

    //Summary
    @FindBy(xpath = "//a[@href='#finish']")
    public WebElement finishButton;

    @FindBy(xpath = "//div[.='Application Submiited Successfully']")
    public WebElement submittedSuccessfullyAlert;

    public static void waitForRealtorInfoInput(){
        SeleniumUtils.waitForVisibility(By.id("realtorinfo"), 5);
    }

    public static void waitForBorrowerFirstNameInput(){
        SeleniumUtils.waitForVisibility(By.id("b_firstName"), 5);
    }

    public static void waitForPersonalInformationTitle(){
        SeleniumUtils.waitForVisibility(By.xpath("//h6[.='Personal Information']"), 5);
    }

    public static void waitForBorrowerEmploymentInformationTitle(){
        SeleniumUtils.waitForVisibility(By.xpath("//h6[.='Borrower Employment Information']"), 5);
    }

    public static void waitForExpensesMonthlyRentalPaymentInput(){
        SeleniumUtils.waitForVisibility(By.id("monthlyrentalpayment"), 5);
    }

    public static void waitForEmploymentAndIncome(){
        SeleniumUtils.waitForVisibility(By.id("grossmonthlyincome"), 5);
    }

    public static void waitForCreditReportYes(){
        SeleniumUtils.waitForVisibility(By.xpath("//label[@for='creditreport1']"), 5);
    }

    public static void waitForeConsentTitle(){
        SeleniumUtils.waitForVisibility(By.xpath("//h4[.='eConsent']"), 5);
    }

    public static void waitForeConsentFirstNameInput(){
        SeleniumUtils.waitForVisibility(By.id("eConsentdeclarerFirstName"), 5);
    }

    public static void waitForSubmittedSuccessfullyAlert(){
        SeleniumUtils.waitForVisibility(By.xpath("//div[.='Application Submiited Successfully']"), 5);
    }

    public void fillOutPreApprovalInfo(){
        Faker faker = new Faker();
        String fullName = faker.name().fullName();
        int purchasePrice = faker.number().numberBetween(100000, 999999);
        int downPaymentAmount = (int)(purchasePrice * 0.2);

        realtorInfoInput.sendKeys(fullName);
        estPurchasePriceInput.sendKeys(""+purchasePrice);
        downPaymentAmountInput.sendKeys(""+downPaymentAmount);
    }

    public void fillOutPreApprovalInfoInvalid(){
        Faker faker = new Faker();
        int fullNameInvalid = faker.number().randomDigit();
        String purchasePriceInvalid = faker.name().username();
        String downPaymentAmountInvalid = faker.name().nameWithMiddle();

        realtorInfoInput.sendKeys(""+fullNameInvalid);
        estPurchasePriceInput.sendKeys(""+purchasePriceInvalid);
        downPaymentAmountInput.sendKeys(""+downPaymentAmountInvalid);
    }

    public void fillOutPreApprovalInfo(String real_info, String purchase, String down_amount, String down_percentage){
        realtorInfoInput.sendKeys(real_info);
        estPurchasePriceInput.sendKeys(purchase);
        downPaymentAmountInput.sendKeys(down_amount);
        dowPaymentPercentageAmountInput.sendKeys(down_percentage);
        clickNextButton();
    }

    public void fillOutPreApprovalInfoInvalidPercentage(String real_info1, String purchase1, String down_percentage1, String down_amount1){
        realtorInfoInput.sendKeys(real_info1);
        estPurchasePriceInput.sendKeys(purchase1);
        dowPaymentPercentageAmountInput.sendKeys(down_percentage1);
        downPaymentAmountInput.sendKeys(down_amount1);
        clickNextButton();
    }



    public void fillOutPersonalInfo(){
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().firstName();
        String email = faker.internet().emailAddress();
        String bod = "01/01/1985";
        String ssn = faker.idNumber().ssnValid();
        String cellPhone = faker.phoneNumber().cellPhone();

        borrowerFirstNameInput.sendKeys(firstName);
        borrowerLastNameInput.sendKeys(lastName);
        borrowerEmailInput.sendKeys(email);
        borrowerBirthdayInput.sendKeys(bod);
        borrowerSSNInput.sendKeys(ssn);
        new Select(borrowerMaritalInput).selectByValue("Married");
        borrowerCellPhoneInput.sendKeys(cellPhone);
    }

    public void fillOutEmploymentAndIncomeInfo(){
        Faker faker = new Faker();
        String employerName = faker.company().name();
        String position = faker.company().profession();
        String city = faker.address().city();
        String startDate = "01/01/2015";
        String monthlyIncome = String.valueOf(faker.number().numberBetween(50000, 120000));

        employerNameInput.sendKeys(employerName);
        jobPositionInput.sendKeys(position);
        jobCityInput.sendKeys(city);
        new Select(jobStateInput).selectByValue("AL");
        jobStartDateInput.sendKeys(startDate);
        grossMonthlyIncomeInput.sendKeys(monthlyIncome);
    }

    public void fillOutEConsentInfo(){
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().firstName();
        String email = faker.internet().emailAddress();

        eConsentFirstNameInput.sendKeys(firstName);
        eConsentLastNameInput.sendKeys(lastName);
        eConsentEmailInput.sendKeys(email);
        clickAgreeOnEConsent();
    }

    public void fillOutMonthlyRentalPayment(){
        expensesMonthlyRentalPaymentInput.sendKeys("3000");
    }
    public void sendKeysMonthlyRentalPayment(String str){
        expensesMonthlyRentalPaymentInput.sendKeys(str);
    }

    public void fillOutMonthlyRentalPaymentInvalid(){
        expensesMonthlyRentalPaymentInput.sendKeys("asdfasdf");
    }
    public void clickNextButton(){
        nextButton.click();
    }

    public void clickPrevButton(){
        previousButton.click();
    }

    public void clickFinishButton(){
        finishButton.click();
    }

    public void clickOrderCreditReportYesInput(){
        SeleniumUtils.jsClick(orderCreditReportYesInput);
    }

    public void clickAgreeOnEConsent() { SeleniumUtils.jsClick(eConsentAgreeInput); }

    public void creditReportInvalidInput(){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].checked = false;", orderCreditReportYesInput);
        js.executeScript("arguments[0].checked = false;", orderCreditReportNoInput);
    }

    public int getPercentageAmount(){
        return Integer.parseInt(dowPaymentPercentageAmountInput.getAttribute("value"));
    }

    public int calculateDownPaymentPercentage(){
        return (int)((getDownPaymentAmount() / (double)getPurchasePriceAmount()) * 100);
    }

    public int getPurchasePriceAmount(){
        return Integer.parseInt(estPurchasePriceInput.getAttribute("value"));
    }
    public int getDownPaymentAmount(){
        return Integer.parseInt(downPaymentAmountInput.getAttribute("value"));
    }
    public int getTotalLoanAmount(){
        return Integer.parseInt(totalLoanAmountInput.getAttribute("value"));
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

    @FindBy(id = "creditreport2")
    public WebElement clickNoCreditReport;

}
