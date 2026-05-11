package com.sweetshop.pages;

import com.sweetshop.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    WebDriver driver;

    By loginLink = By.linkText("Login");
    By email = By.id("exampleInputEmail1");
    By password = By.id("exampleInputPassword1");
    By loginBtn = By.xpath("//button[contains(text(),'Login')]");

    public LoginPage(WebDriver driver) {

        super(driver);

        this.driver = driver;
    }

    public void login(String user, String pass) {

        driver.findElement(loginLink).click();

        driver.findElement(email).sendKeys(user);

        driver.findElement(password).sendKeys(pass);

        driver.findElement(loginBtn).click();
    }
}