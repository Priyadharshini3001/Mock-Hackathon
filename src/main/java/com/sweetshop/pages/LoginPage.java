package com.sweetshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Locators
    By email = By.xpath("//input[@type='email']");
    By password = By.xpath("//input[@type='password']");
    By loginBtn = By.xpath("//button[contains(text(),'Login')]");

    // 🔥 Open Login Page
    public void goToLoginPage() {
        driver.get("https://sweetshop.netlify.app/login");
    }

    // 🔥 Perform Login (AUTO FLOW)
    public void login(String userEmail, String userPassword) {

        // wait + enter email
        wait.until(ExpectedConditions.visibilityOfElementLocated(email))
                .clear();
        driver.findElement(email).sendKeys(userEmail);

        // wait + enter password
        wait.until(ExpectedConditions.visibilityOfElementLocated(password))
                .clear();
        driver.findElement(password).sendKeys(userPassword);

        // wait + click login
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn))
                .click();
    }
}