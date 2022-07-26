package com.duobank.pages;

import com.duobank.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class MortgagePage {
    public MortgagePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
