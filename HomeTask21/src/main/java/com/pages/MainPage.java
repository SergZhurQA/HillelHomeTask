package com.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MainPage extends BasePage {

    private SelenideElement logoutButton = $(By.cssSelector("#logout_sidebar_link"));
    private ElementsCollection allPrices = $$(By.className("inventory_item_price"));
    private ElementsCollection addToCartButtonsList = $$(By.xpath("//button[text()='Add to cart']"));

    private SelenideElement openCartButton = $(By.cssSelector(".shopping_cart_link"));

    public ElementsCollection getAllPricesElements() {
        return allPrices;
    }

    public MainPage addBiggerPriceItemInCart() {
        ElementsCollection allPricesList = getAllPricesElements();
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
        return page(CartPage.class);
    }
}
