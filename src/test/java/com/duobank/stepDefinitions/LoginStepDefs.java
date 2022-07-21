package com.duobank.stepDefinitions;

import com.duobank.pages.*;
import io.cucumber.java.en.When;
public class LoginStepDefs {

  @When( "I enter  as a username and  as password")
    public void i_enter_as_a_username_and_as_password(String user, String pass) {
   LoginPage loginPage=new com.duobank.pages.LoginPage();
loginPage.login(user,pass);
    }
}
