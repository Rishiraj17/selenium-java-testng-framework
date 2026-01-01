package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class InvalidLoginTest extends BaseTest {

    @Test
    public void invalidPasswordShowsErrorMessage(){
        LoginPage loginPage=new LoginPage(driver);

        loginPage.waitForPageToLoad();

        loginPage.login("Admin","wrongPassword");

        String error= loginPage.getErrorMessage();

        Assert.assertEquals(
                error,
                "Invalid credentials",
                "Expected invalid credentials error message"
        );

    }

}
