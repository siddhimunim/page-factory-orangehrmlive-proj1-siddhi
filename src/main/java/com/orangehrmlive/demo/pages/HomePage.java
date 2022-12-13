package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//header/div[1]/div[1]/span[1]/h6[1]")
    WebElement verifyDashBoard ;
    public String getMassage(){
        Reporter.log("Massage is verify " + verifyDashBoard.toString());
        return getTextFromElement(verifyDashBoard);
    }

}
