package com.sweetshop.pages;

import com.sweetshop.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SweetsPage extends BasePage {

    WebDriver driver;

    By sweetsLink = By.linkText("Sweets");

    public SweetsPage(WebDriver driver) {

        super(driver);

        this.driver = driver;
    }

    public void openSweets() {

        driver.findElement(sweetsLink).click();
    }

    public int getProductCount() {

        return driver.findElements(
                By.className("card")
        ).size();
    }
}