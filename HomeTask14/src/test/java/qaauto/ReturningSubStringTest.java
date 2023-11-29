package qaauto;

import org.testng.Assert;
import org.testng.annotations.Test;
import qaauto.task2.ReturningSubString;

public class ReturningSubStringTest extends BaseTest{

    @Test(groups = "ReturningSubString method")
    public void returningSubStringPositiveTest() {
        Assert.assertEquals("Somete", ReturningSubString.returnSubString("Sometext", "xt"));
    }

    @Test(groups = "ReturningSubString method")
    public void returningSubStringNullArgTest() {
        Assert.assertNull(ReturningSubString.returnSubString(null, "xt"));
    }
}
