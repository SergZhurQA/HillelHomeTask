package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MainPage extends BasePage {

    @FindBy(css = ".social_linkedin > a")
    WebElement linkedInButton;

    @FindBy(css = "#react-burger-menu-btn")
    WebElement openSideBarButton;

    @FindBy(css = "#logout_sidebar_link")
    WebElement logoutButton;

    @FindBy(className = "inventory_item_price")
    List<WebElement> allPrices;

    @FindBy(xpath = "//button[text()='Add to cart']")
    List<WebElement> addToCartButtonsList;

    @FindBy(css = ".shopping_cart_link")
    WebElement openCartButton;


    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getLinkedInButton() {
        return linkedInButton;
    }

    public LinkedInPage openLinkedIn() {
        clickOnElement(linkedInButton);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        return new LinkedInPage(driver);
    }

    public LoginPage logout() {
        clickOnElement(openSideBarButton);
        clickOnElement(logoutButton);

        return new LoginPage(driver);
    }

    public List<WebElement> getAllPricesElements() {
        return wait.until(ExpectedConditions.visibilityOfAllElements(allPrices));
    }

    public MainPage addBiggerPriceItemInCart() {
        List<WebElement> allPricesList = getAllPricesElements();
        double price = Double.parseDouble(allPricesList.get(0).getText().split("\\$")[1]);
        int indexElement = 0;
        for (int i = 0; i < allPricesList.size(); i++) {
            if (Double.parseDouble(allPricesList.get(i).getText().split("\\$")[1]) > price) {
                price = Double.parseDouble(allPricesList.get(i).getText().split("\\$")[1]);
                indexElement = i;
            }
        }
        return clickAddToCartByOrder(indexElement);
    }

    public MainPage clickAddToCartByOrder(int positionOnPage) {
        clickOnElement(addToCartButtonsList.get(positionOnPage));
        return this;
    }

    public CartPage openCart() {
        clickOnElement(openCartButton);
        return new CartPage(driver);
    }
}
