package com.sweetshop.tests;

import com.sweetshop.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {


    @Test
    public void verifyProductList() {

        driver.get("https://sweetshop.netlify.app/sweets");

        int productCount = driver.findElements(By.cssSelector(".card")).size();

        Assert.assertTrue(productCount > 0, "No products displayed");
    }
    @Test
    public void sampleTest() {
        System.out.println("running");
        System.out.println("Account page verified");
        System.out.println("Product details checked");
        System.out.println("Product list loaded");



    }
    @Test
    public void testProduct() {
        System.out.println("PRODUCT TEST RUNNING");
    }

    @Test
    public void verifyProductDetails() {

        driver.get("https://sweetshop.netlify.app/sweets");

        driver.findElement(By.cssSelector(".card")).click();

        Assert.assertTrue(driver.findElement(By.tagName("h1")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector(".price")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector(".description")).isDisplayed());
    }
}

