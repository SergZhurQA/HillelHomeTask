package com.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class CartPage extends BasePage {

    private SelenideElement checkoutButton = $(By.cssSelector("#checkout"));

    public CheckoutStepOnePage clickCheckoutButton() {
        clickOnElement(checkoutButton);
        return page(CheckoutStepOnePage.class);
    }
}
