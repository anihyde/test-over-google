package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.WebDriverManager;

public class TestSearch extends WebDriverManager {

    @Test
    public void testGoogle() {
        Assert.assertEquals(driver.getTitle(), "Google");

    }

}
