package com.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AutomationExerciseBase {
    public WebDriver driver;
    public WebDriverWait wait;
    public TestProperties testProperties;

    @BeforeMethod
    public void setUp() {
        testProperties = new TestProperties("testdata");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(testProperties.getProperty("baseUrl"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));


    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
