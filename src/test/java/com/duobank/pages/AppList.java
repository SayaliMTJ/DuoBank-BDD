package com.duobank.pages;

import com.duobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppList {

    public AppList(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

  @FindBy(xpath = "//ahref[@class='page-link']")
    public WebElement nextButton;




}
