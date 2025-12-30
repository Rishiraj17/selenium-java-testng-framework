package tests;

import base.BaseTest;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest{

//    @Test
//    public void openGoogle(){
//        driver.get("https://www.google.com");
//    }
    @Test
    public void openBaseUrl(){
        waitForTitleContains("Google");
    }
}
