package com.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage extends BasePage {
    private SelenideElement userNameField = $(By.cssSelector("#user-name"));
    private SelenideElement passwordField = $(By.cssSelector("#password"));
    private SelenideElement loginButton = $(By.cssSelector("#login-button"));

    public MainPage login(String userName, String password) {
        setText(userName, userNameField);
        setText(password, passwordField);
        clickOnElement(loginButton);
        return page(MainPage.class);

    }
}
