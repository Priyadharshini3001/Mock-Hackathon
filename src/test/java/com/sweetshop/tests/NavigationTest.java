package com.sweetshop.tests;

import com.sweetshop.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

    @Test
    public void verifyTopNavigationLinks() {

        driver.get("https://sweetshop.netlify.app/");

        Assert.assertTrue(driver.findElement(By.linkText("Home")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.linkText("Sweets")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.linkText("Login")).isDisplayed());
    }
    @Test
    public void sampleTest() {
        System.out.println("running");
    }

    @Test
    public void verifyNavigationToPages() {

        driver.findElement(By.linkText("Sweets")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("sweets"));

        driver.navigate().back();

        driver.findElement(By.linkText("Login")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
    }
}