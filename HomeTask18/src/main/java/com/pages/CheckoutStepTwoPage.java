package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepTwoPage extends BasePage {

    @FindBy(css = "#finish")
    WebElement finishButton;


    public CheckoutStepTwoPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public CheckoutCompletePage clickFinishButton() {
        clickOnElement(finishButton);
        return new CheckoutCompletePage(driver);
    }
}
