package com.duobank.pages;

import com.duobank.utilities.Driver;
import com.duobank.utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='register.php']")
    public WebElement signup;

    @FindBy(id = "exampleInputEmail1")
    public WebElement enterEmailAddress;

    @FindBy(id = "exampleInputPassword1")
    public WebElement enterPassword;

    @FindBy(name = "login")
    public WebElement clickOnLogin;

    public static void waitForClickOnLogin(){
        SeleniumUtils.waitForVisibility(By.name("login"), 5);
    }

    public void login(String username, String password){
        enterEmailAddress.sendKeys(username);
        enterPassword.sendKeys(password + Keys.ENTER);
    }


}
