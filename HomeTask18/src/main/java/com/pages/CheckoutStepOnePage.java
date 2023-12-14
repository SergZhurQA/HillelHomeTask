package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepOnePage extends BasePage {

    @FindBy(css = "#first-name")
    WebElement firstNameField;

    @FindBy(css = "#last-name")
    WebElement lastNameField;

    @FindBy(css = "#postal-code")
    WebElement postalCodeField;

    @FindBy(css = "#continue")
    WebElement continueButton;


    public CheckoutStepOnePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public CheckoutStepOnePage fillUpInformationForm(String name, String lastName, String postalCode) {
        setText(name, firstNameField);
        setText(lastName, lastNameField);
        setText(postalCode, postalCodeField);
        return this;
    }

    public CheckoutStepTwoPage clickContinue() {
        clickOnElement(continueButton);
        return new CheckoutStepTwoPage(driver);
    }


}
