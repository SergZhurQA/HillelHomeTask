package hillel.qaauto;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HerokuappTest extends HerokuappBase {

    @Test(dataProvider = "numbersOfExample")
    public void dynamicallyLoadedPageElementsTest(int numberOfExample) {

        Assert.assertEquals(textAfterLoadingInExamples, checkLoadedTextInExamplesByNumber(numberOfExample), "Wrong text displayed.");
    }

    @DataProvider
    public Object[][] numbersOfExample() {
        return new Object[][]{
                {1},
                {2},
        };
    }
}
