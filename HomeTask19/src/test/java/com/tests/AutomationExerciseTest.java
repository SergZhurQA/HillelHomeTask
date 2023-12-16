package com.tests;

import com.pages.ContactUsPage;
import com.pages.MainPage;
import com.utils.AutomationExerciseBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationExerciseTest extends AutomationExerciseBase {

    @Test
    public void fillUpFormFromPropertyTest() {
        ContactUsPage contactUsPage = new MainPage(driver)
                .openContactUsPage()
                .fillUpGetInTouchForm(testProperties.getProperty("name"), testProperties.getProperty("email"),
                        testProperties.getProperty("subject"), testProperties.getProperty("message"))
                .uploadFile(testProperties.getProperty("fileName"))
                .clickSubmitButton();
        contactUsPage.acceptAlert();
        Assert.assertTrue(contactUsPage.successMessageIsDisplayed(), "Success message is not displayed.");
    }
}
