package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

    private WebDriver driver;
    private WebDriverWait wait;

    //Locator unique to dashboard
    private By dashboardHeader=By.xpath("//h6[text()='Dashboard']");
    private By userDropdown=By.cssSelector(".oxd-userdropdown-tab");
    private By logoutLink=By.xpath("//a[text()='Logout']");

    public DashboardPage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    public void waitForDashboardToLoad(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(dashboardHeader));
    }

    public boolean isDashboardDisplayed(){
        return driver.findElement(dashboardHeader).isDisplayed();
    }

    public void logout(){
        wait.until(ExpectedConditions.elementToBeClickable(userDropdown)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(logoutLink)).click();
    }


}
