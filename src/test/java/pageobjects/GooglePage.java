package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {

        WebDriver driver;
        By searchButton = By.xpath("//*[@id='lst-ib']");

        public GooglePage(WebDriver driver)  {
            this.driver = driver;
        }

        public GooglePage clickSearchButton()  {
            driver.findElement(searchButton).sendKeys("SeleniumHQ");
            driver.findElement(searchButton).click();
            return  this;
        }

}
