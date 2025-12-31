package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest{

//    @Test
//    public void openGoogle(){
//        driver.get("https://www.google.com");
//    }
    @Test
    public void openBaseUrl(){
        waitForTitleContains("Google");

        String title=driver.getTitle();
        Assert.assertTrue(
                title.contains("Google"),
                "Expected title to contain 'Google' but was: "+title
        );
    }
}
