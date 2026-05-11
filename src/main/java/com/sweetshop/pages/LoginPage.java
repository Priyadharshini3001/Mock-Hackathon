package com.sweetshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By email = By.xpath("//input[@type='email']");
    By password = By.xpath("//input[@type='password']");
    By loginBtn = By.xpath("//button[contains(text(),'Login')]");

    // Login method
    public void login(String userEmail, String userPassword) {

        driver.findElement(email).sendKeys(userEmail);

        driver.findElement(password).sendKeys(userPassword);

        driver.findElement(loginBtn).click();
    }
}