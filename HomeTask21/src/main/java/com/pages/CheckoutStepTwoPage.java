package com.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class CheckoutStepTwoPage extends BasePage {

    private SelenideElement finishButton = $(By.cssSelector("#finish"));

    public CheckoutCompletePage clickFinishButton() {
        clickOnElement(finishButton);
        return page(CheckoutCompletePage.class);
    }
}
