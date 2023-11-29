package qaauto;

import org.testng.Assert;
import org.testng.annotations.*;
import qaauto.task1.ReverseString;

public class ReverseStringTest extends BaseTest{

    @Test(groups = "ReverseString method")
    public void reverseStringTest() {
        Assert.assertEquals("ra", ReverseString.reverseStr("ar"));
    }

    @Test(groups = "ReverseString method")
    public void reverseStringNullTest() {
        Assert.assertNull(ReverseString.reverseStr(null));
    }

    @Test(groups = "ReverseString method")
    public void reverseStringEmptyStrTest() {
        Assert.assertEquals("", ReverseString.reverseStr(""));
    }
}
