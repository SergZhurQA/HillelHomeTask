package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(css = "#user-name")
    WebElement userNameField;

    @FindBy(css = "#password")
    WebElement passwordField;

    @FindBy(css = "#login-button")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public MainPage login(String userName, String password) {
        setText(userName, userNameField);
        setText(password, passwordField);
        clickOnElement(loginButton);
        return new MainPage(driver);
    }
}
