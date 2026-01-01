package tests;

import base.BaseTest;
import pages.DashboardPage;
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

        DashboardPage dashboardPage=new DashboardPage(driver);
        dashboardPage.waitForDashboardToLoad();

        Assert.assertTrue(
                dashboardPage.isDashboardDisplayed(),
                "Dashboard should be visible after successful login"
        );
    }

}
