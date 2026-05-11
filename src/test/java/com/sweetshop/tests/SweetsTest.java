package com.sweetshop.tests;

import com.sweetshop.base.BaseTest;
import com.sweetshop.pages.SweetsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SweetsTest extends BaseTest {

    @Test
    public void verifyProductsDisplayed() {

        SweetsPage sp = new SweetsPage(driver);

        sp.openSweets();

        Assert.assertTrue(
                sp.getProductCount() > 0
        );
    }
}