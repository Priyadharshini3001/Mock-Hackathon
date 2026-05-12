package com.sweetshop.tests;

import com.sweetshop.base.BaseTest;
import com.sweetshop.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AccountTest extends BaseTest {


    @Test
    public void sampleTest() {
        System.out.println("running");
    }

    @Test
    public void verifyAccountPage() {
        driver.get("https://sweetshop.netlify.app/login");
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
    }

    @Test
    public void verifyOrderHistory() {
        driver.get("https://sweetshop.netlify.app/login");
        Assert.assertTrue(driver.getPageSource().length() > 0);
    }
}