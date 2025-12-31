package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class BrowserFactory {

    public static WebDriver createDriver(String browser){
        if(browser==null){
            throw new RuntimeException("Browser value is null. Check config.properties");
        }
        switch(browser.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();

            case "edge":
                System.setProperty(
                        "webdriver.edge.driver",
                        "C:\\WebDriver\\msedgedriver.exe"
                );
                return new EdgeDriver();

            default:
                throw new RuntimeException("Unsupported browser: "+browser);
        }
    }

}
