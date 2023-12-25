package com.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutCompletePage extends BasePage {

    private SelenideElement checkoutCompleteMessage = $(By.cssSelector(".title"));

    public String getCheckoutCompleteMessage() {
        return checkoutCompleteMessage.getText();
    }
}
