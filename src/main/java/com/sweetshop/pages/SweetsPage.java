package com.sweetshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SweetsPage {

    WebDriver driver;

    public SweetsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openSweets() {
        driver.get("https://sweetshop.netlify.app/sweets");
    }

    public int getProductCount() {
        return driver.findElements(By.xpath("//div[contains(@class,'card')]")).size();
    }
}