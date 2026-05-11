package com.sweetshop.base;

import com.sweetshop.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class BaseTest{

    public static WebDriver driver;
    @Test
    public void addToBasket() {
        System.out.println("Product added to basket");
    }

    @Test
    public void removeFromBasket() {
        System.out.println("Product removed");
    }

    @BeforeMethod
    public void setup(){

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(
                Duration.ofSeconds(10)
        );
        driver.get(
                ConfigReader.getProperty("baseUrl")
        );
    }

    @AfterMethod
    public void tearDown(){

        if (driver!=null){

            driver.quit();
        }

    }
}