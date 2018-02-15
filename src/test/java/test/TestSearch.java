package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.GooglePage;
import pageobjects.GoogleSearchResult;
import utilities.WebDriverManager;

public class TestSearch extends WebDriverManager {

    @Test
    public void testGoogle() {
        Assert.assertEquals(driver.getTitle(), "Google");
    }

    @Test
    public void testSearch() {
        new GooglePage(driver).clickSearchButton();
        Assert.assertEquals(driver.getTitle(), "SeleniumHQ - Buscar con Google");
    }

    @Test
    public void testSeleniumLink(){
        new GoogleSearchResult(driver).seleniumSearchResult();
        Assert.assertEquals(driver.getTitle(), "SeleniumHQ");
    }

}
