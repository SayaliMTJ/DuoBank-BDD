package com.duobank.pages;

import com.duobank.utilities.Driver;
import com.duobank.utilities.SeleniumUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MortgagePage {
    public MortgagePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

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

    @FindBy(xpath = "//a[@href='#next']")
    public WebElement nextButton;

    @FindBy(xpath = "//h6[.='Personal Information']")
    public WebElement personalInformationTitle;

    @FindBy(xpath = "//label[@class='danger']")
    public List<WebElement> requiredLabel;

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

    @FindBy(id = "monthlyrentalpayment")
    public WebElement expensesMonthlyRentalPaymentInput;
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

    public void fillOutMonthlyRentalPayment(){
        expensesMonthlyRentalPaymentInput.sendKeys("3000");
    }

    public void fillOutMonthlyRentalPaymentInvalid(){
        expensesMonthlyRentalPaymentInput.sendKeys("asdfasdf");
    }

    public void clickNextButton(){
        nextButton.click();
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



}
