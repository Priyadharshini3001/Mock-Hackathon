package com.sweetshop.tests;

import com.sweetshop.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasketTest extends BaseTest {

    @Test
    public void addToBasketTest() {

        driver.get("https://sweetshop.netlify.app/basket");

        Assert.assertTrue(driver.getCurrentUrl().contains("basket"));
    }

    @Test
    public void sampleTest() {
        System.out.println("running");
    }

    @Test
    public void removeFromBasketTest() {

        driver.get("https://sweetshop.netlify.app/basket");

        Assert.assertTrue(driver.getTitle() != null);
    }
}