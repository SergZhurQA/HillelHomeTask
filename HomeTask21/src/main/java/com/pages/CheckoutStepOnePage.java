package com.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class CheckoutStepOnePage extends BasePage {

    private SelenideElement firstNameField = $(By.cssSelector("#first-name"));
    private SelenideElement lastNameField = $(By.cssSelector("#last-name"));
    private SelenideElement postalCodeField = $(By.cssSelector("#postal-code"));
    private SelenideElement continueButton = $(By.cssSelector("#continue"));

    public CheckoutStepOnePage fillUpInformationForm(String name, String lastName, String postalCode) {
        setText(name, firstNameField);
        setText(lastName, lastNameField);
        setText(postalCode, postalCodeField);
        return this;
    }

    public CheckoutStepTwoPage clickContinue() {
        clickOnElement(continueButton);
        return page(CheckoutStepTwoPage.class);
    }


}
