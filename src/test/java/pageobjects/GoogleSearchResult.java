package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchResult {

    WebDriver driver;
    By seleniumLink = By.linkText("Selenium Documentation — Selenium Documentation");

    public GoogleSearchResult(WebDriver driver)  {
        this.driver = driver;
    }

    public GoogleSearchResult seleniumSearchResult(){
        WebElement seleniumHQ = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(seleniumLink));
        driver.findElement(seleniumLink);
        seleniumHQ.click();
        return  this;
    }
}
