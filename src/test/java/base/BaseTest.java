package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;

// Hard coded Browser setup
//    @BeforeClass
//    public void setUp(){
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//    }

    @BeforeMethod
    public void setUp(){
        String browser=ConfigReader.get("browser");
        String baseUrl=ConfigReader.get("baseUrl");

        if(browser==null){
            throw new RuntimeException("Browser is not specified in config.properties");
        }

        switch (browser.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;

            default:
                throw new RuntimeException("Unsupported browser: "+browser);
        }
        wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    protected void waitForTitleContains(String text){
        wait.until(ExpectedConditions.titleContains(text));
    }

    @AfterMethod
    public void tearDown(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }

}
