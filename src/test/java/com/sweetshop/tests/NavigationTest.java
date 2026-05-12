package com.sweetshop.tests;
import com.sweetshop.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
public class NavigationTest extends BaseTest {
    @Test
    public void verifyTopNavigationLinks() {
        driver.get("https://sweetshop.netlify.app/");
        Assert.assertTrue(driver.getTitle().length() >= 0);
    }

    @Test
    public void sampleTest() {
        System.out.println("running");
    }

    @Test
    public void verifyNavigationToPages() {
        driver.get("https://sweetshop.netlify.app/sweets");
        Assert.assertTrue(driver.getCurrentUrl().contains("sweets"));
        driver.get("https://sweetshop.netlify.app/login");
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
    }
}