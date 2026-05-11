package com.sweetshop.tests;

import com.sweetshop.base.BaseTest;
import com.sweetshop.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest {

    @Test
    public void verifyAccountPage() {

        LoginPage lp = new LoginPage(driver);
        lp.goToLoginPage();
        lp.login("test@test.com", "test");

        driver.findElement(By.xpath("//a[contains(text(),'Account')]")).click();

        Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());
    }
    @Test
    public void sampleTest() {
        System.out.println("running");
    }



    @Test
    public void verifyOrderHistory() {

        LoginPage lp = new LoginPage(driver);
        lp.goToLoginPage();
        lp.login("test@test.com", "test");

        driver.findElement(By.xpath("//a[contains(text(),'Account')]")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Order')]")).isDisplayed());
    }
}