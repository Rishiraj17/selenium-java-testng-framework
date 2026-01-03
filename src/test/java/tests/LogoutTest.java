package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class LogoutTest extends BaseTest {

    @Test
    public void userCanLogoutSuccessfully(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.waitForPageToLoad();
        loginPage.login("Admin","admin123");

        DashboardPage dashboardPage=new DashboardPage(driver);
        dashboardPage.waitForDashboardToLoad();
        dashboardPage.logout();

        loginPage.waitForPageToLoad();

        Assert.assertTrue(
                driver.getCurrentUrl().contains("login"),
                "User should be redirected to login page after logout"
        );

    }
}
