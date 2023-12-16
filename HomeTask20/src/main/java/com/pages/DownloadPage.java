package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DownloadPage extends BasePage {

    String elementForDownloadCss = "a[href='download/%s']";

    public DownloadPage(WebDriver driver) {
        super(driver);
    }

    public DownloadPage downloadFile(String fileName) {
        clickOnElement(driver.findElement(By.cssSelector(String.format(elementForDownloadCss, fileName))));
        return this;
    }

}
