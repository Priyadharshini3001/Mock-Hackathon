package com.sweetshop.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SweetsPage {

    WebDriver driver;
    WebDriverWait wait;

    public SweetsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openSweets() {
        driver.get("https://sweetshop.netlify.app/sweets");
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@class,'card')]")
        ));
    }

    public int getProductCount() {
        return driver.findElements(
                By.xpath("//div[contains(@class,'card')]")
        ).size();
    }
}