package com.pages;

import com.codeborne.selenide.SelenideElement;


public class BasePage {
    public void clickOnElement(SelenideElement element) {
        element.click();
    }

    public void setText(String text, SelenideElement element) {
        element.clear();
        element.setValue(text);
    }
}
