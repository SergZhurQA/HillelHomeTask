package hillel.qaauto;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeleniumDevTest extends SeleniumDevBase {

    @Test
    public void revealANewInputTest() {
        Assert.assertTrue(checkFieldIsDisplayedAfterClickRevealButton(), "The input field is not displayed.");
    }

    @Test(dataProvider = "qtyOfClicksOnButton")
    public void addABoxTest(int qtyClicks) {
        Assert.assertEquals(qtyClicks, clickOnAddABoxButton(qtyClicks).size(), "The difference is in the number of clicks and the number of boxes.");
    }

    @DataProvider
    public Object[][] qtyOfClicksOnButton() {
        return new Object[][]{
                {1},
                {5},
                {10}
        };
    }

    @Test(dataProvider = "qtyOfClicksAndColor")
    public void checkColorOfBoxesTest(String color, int qtyClicks) {
        Assert.assertTrue(checkEachBoxColor(color, qtyClicks), "The box is the wrong color.");
    }

    @DataProvider
    public Object[][] qtyOfClicksAndColor() {
        return new Object[][]{
                {EACH_BOX_COLOR, 1},
                {EACH_BOX_COLOR, 5}
        };
    }
}
