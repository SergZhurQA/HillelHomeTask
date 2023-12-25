package com.tests;

import com.pages.CheckoutCompletePage;
import com.pages.LoginPage;
import com.utils.SauceDemoBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;


public class SauceDemoTest extends SauceDemoBase {

    @Test
    public void buyingTheMostExpensiveProductTest() {
        open("");

        CheckoutCompletePage checkoutCompletePage = new LoginPage()
                .login(USER_NAME, PASSWORD)
                .addBiggerPriceItemInCart()
                .openCart()
                .clickCheckoutButton()
                .fillUpInformationForm(NAME, LAST_NAME, POST_CODE)
                .clickContinue()
                .clickFinishButton();
        Assert.assertEquals(CHECKOUT_COMPLETE_MESSAGE, checkoutCompletePage.getCheckoutCompleteMessage(), "");
    }

}
