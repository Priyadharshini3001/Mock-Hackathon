package com.krce;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Launch Browser
        WebDriver driver = new ChromeDriver();

        // Maximize Window
        driver.manage().window().maximize();

        // Open Website
        driver.get("https://sweetshop.netlify.app");

        // Print Page Title
        System.out.println("Page Title : " + driver.getTitle());

        // Close Browser
        driver.quit();
    }
}