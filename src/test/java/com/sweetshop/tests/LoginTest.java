package com.sweetshop.tests;

import com.sweetshop.base.BaseTest;
import com.sweetshop.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.sweetshop.base.BaseTest.driver;

public class LoginTest extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {

        return new Object[][]{

                {"test@test.com", "test"},
                {"wrong@test.com", "wrong"}
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String user, String pass) {

        LoginPage lp = new LoginPage(driver);

        lp.goToLoginPage();

        lp.login(user, pass);
    }
}