package com.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
    }

    public void scrollPageToElement(WebElement webElement) {
        js.executeScript("arguments[0].scrollIntoView();", webElement);
    }

    public void switchToWindow(int windowNumber) {
        List<String> allTabsList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(allTabsList.get(windowNumber));

    }

    public void closeThePage() {
        driver.close();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void clickOnElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void setText(String text, WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);
    }

}
