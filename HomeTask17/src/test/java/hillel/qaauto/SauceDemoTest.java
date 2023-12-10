package hillel.qaauto;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SauceDemoTest extends SauceDemoBase {

    @Test
    public void sauceDemoTest() {

        login(USER_NAME, PASSWORD);

        scrollPageToElement(linkedInButtonSccSelector);

        openLinkedIn();

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        List<String> allTabsList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(allTabsList.get(1));

        Assert.assertTrue(driver.getTitle().contains(webSiteTitle), String.format("The page title does not contain %s", webSiteTitle));

        driver.close();
        driver.switchTo().window(allTabsList.get(0));
        logout();

        Assert.assertEquals(driver.getCurrentUrl(), SAUCE_DEMO_URL, "Current page, is not the login page.");
    }
}
