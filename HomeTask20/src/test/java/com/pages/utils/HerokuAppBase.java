package com.pages.utils;

import com.pages.DownloadPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class HerokuAppBase {
    public WebDriver driver;
    public WebDriverWait wait;
    public TestProperties testProperties;
    public DownloadPage downloadPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", new File("src/test/resources/downloadedfiles").getAbsolutePath());

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        testProperties = new TestProperties("testdata");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get(testProperties.getProperty("baseUrl"));

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        downloadPage = new DownloadPage(driver);

    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
