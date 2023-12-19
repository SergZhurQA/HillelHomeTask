package com.utils;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;


public class SauceDemoBase {

    public final String SAUCE_DEMO_URL = "https://www.saucedemo.com/";
    public final String USER_NAME = "standard_user";
    public final String PASSWORD = "secret_sauce";
    public final String NAME = "John";
    public final String LAST_NAME = "Ford";
    public final String POST_CODE = "1234";
    public final String CHECKOUT_COMPLETE_MESSAGE = "Checkout: Complete!";

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = SAUCE_DEMO_URL;
        Configuration.screenshots = true;
        Configuration.reportsFolder = "foo/bar_reports";
        Configuration.savePageSource = false;

    }
}
