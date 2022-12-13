package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.pages.ForgotPasswordPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {
   HomePage homePage ;
    LoginPage loginPage  ;
    ForgotPasswordPage forgotPasswordPage;

    @BeforeMethod(alwaysRun = true)

    public void inIt() {
       homePage = new HomePage();
        loginPage = new LoginPage();
        forgotPasswordPage= new ForgotPasswordPage();
    }


        @Test(groups = {"sanity","regression"})
        public void userSholdLoginSuccessfullyWithValidCredentials () {
        loginPage.enterUserName("Admin");
         loginPage.enterPassword("admin123");
            loginPage.clickOnLoginButton();
            Assert.assertEquals(homePage.getMassage(),"Dashboard");

        }
    @Test (groups = {"smoke","regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
       loginPage.clickOnForgotButton();

        Assert.assertEquals(forgotPasswordPage.verifyMassage(),"Reset Password");


    }
    }

