package com.duobank.pages;

import com.duobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
    public SignupPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "first_name" )
    public WebElement firstName;

    @FindBy(name = "last_name" )
    public WebElement lastName;

    @FindBy(name = "email" )
    public WebElement email;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name = "register")
    public WebElement registerSignup;

}
