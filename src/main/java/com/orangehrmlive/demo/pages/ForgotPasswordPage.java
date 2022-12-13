package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ForgotPasswordPage extends Utility {

    @CacheLookup
    @FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/form[1]/h6[1]")
    WebElement verifyResetPassword ;

    public String verifyMassage(){
        Reporter.log("massage is verify "+ verifyResetPassword.toString());
        return getTextFromElement(verifyResetPassword);
    }
}


