package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LinkedInPage extends BasePage {
    public LinkedInPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
