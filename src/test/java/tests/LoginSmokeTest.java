package tests;

import base.BaseTest;
import pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginSmokeTest extends BaseTest{

    @Test
    public void validUserCanLogin(){

        LoginPage loginPage=new LoginPage(driver);

        //wait for page elements to load
        loginPage.waitForPageToLoad();

        // Perform login
        loginPage.login("Admin","admin123");

        //wait for dashboard
        waitForTitleContains("OrangeHRM");

        Assert.assertTrue(
                driver.getCurrentUrl().contains("dashboard"),
                "Expected to be on dashboard page after login"
        );
    }

}
