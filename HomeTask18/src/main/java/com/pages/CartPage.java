package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {

    @FindBy(css = "#checkout")
    WebElement checkoutButton;


    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public CheckoutStepOnePage clickCheckoutButton() {
        clickOnElement(checkoutButton);
        return new CheckoutStepOnePage(driver);
    }
}
