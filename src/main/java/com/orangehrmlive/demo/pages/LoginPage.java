package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy (name = "username")
    WebElement userName ;
    @CacheLookup
    @FindBy (name = "password")
    WebElement password ;
    @CacheLookup
    @FindBy (xpath="//button[@type='submit']")
    WebElement loginButton ;
    @CacheLookup
    @FindBy (xpath="//div[@class='orangehrm-login-forgot']")
    WebElement forgotPasswordLink ;





    public void enterUserName (String name){
        Reporter.log ("Enter username  " + name + "to username " + userName.toString());
        sendTextToElement(userName,name);
        CustomListeners.test.log(Status.PASS,"Enter Username");
    }
    public void enterPassword(String password1){
        Reporter.log ("Enter password  " + password1 + "to password " + password.toString());
        sendTextToElement(password,password1);
        CustomListeners.test.log(Status.PASS,"Enter password");
    }
    public void clickOnLoginButton(){
        Reporter.log("click on login " + loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS,"Click on loginButton");
    }
    public void clickOnForgotButton(){
        Reporter.log("click on Forgot password " + forgotPasswordLink.toString());
        clickOnElement(forgotPasswordLink);
        CustomListeners.test.log(Status.PASS,"click on forgotbutton");
    }



}
