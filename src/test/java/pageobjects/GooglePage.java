package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePage {

        WebDriver driver;
        By searchButton = By.xpath("//*[@id='lst-ib']");

        public GooglePage(WebDriver driver)  {
            this.driver = driver;
        }

        public GooglePage clickSearchButton() {
            WebElement inputBox = (new WebDriverWait(driver, 5))
                    .until(ExpectedConditions.presenceOfElementLocated(searchButton));
            driver.findElement(searchButton);
            inputBox.sendKeys("SeleniumHQ");
            inputBox.click();
            return  this;
        }

}
