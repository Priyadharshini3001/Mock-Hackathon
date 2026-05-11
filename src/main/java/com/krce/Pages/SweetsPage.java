package com.sweetshop.pages;

import com.sweetshop.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class BasketPage extends BasePage {

    WebDriver driver;

    public BasketPage(WebDriver driver) {

        super(driver);

        this.driver = driver;
    }

    public void addFirstProduct() {

        driver.findElements(
                By.xpath("//button[contains(text(),'Add to Basket')]")
        ).get(0).click();
    }

    public String getBasketCount() {

        return driver.findElement(
                By.id("basketcount")
        ).getText();
    }
}