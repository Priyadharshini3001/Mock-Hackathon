package com.sweetshop.tests;

import com.sweetshop.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasketTest extends BaseTest {

    @Test
    public void addToBasketTest() {

        driver.get("https://sweetshop.netlify.app/sweets");

        driver.findElement(By.cssSelector(".card")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();

        driver.findElement(By.xpath("//a[contains(text(),'Basket')]")).click();

        int items = driver.findElements(By.cssSelector(".basket-item")).size();

        Assert.assertTrue(items > 0, "Basket is empty");
    }
    @Test
    public void sampleTest() {
        System.out.println("running");
    }

    @Test
    public void removeFromBasketTest() {

        driver.get("https://sweetshop.netlify.app/sweets");

        driver.findElement(By.cssSelector(".card")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();

        driver.findElement(By.xpath("//a[contains(text(),'Basket')]")).click();

        driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();

        int items = driver.findElements(By.cssSelector(".basket-item")).size();

        Assert.assertEquals(items, 0);
    }
}
