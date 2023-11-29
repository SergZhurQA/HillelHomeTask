package qaauto;

import org.testng.Assert;
import org.testng.annotations.*;
import qaauto.task4.PhoneNumberRegex;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PhoneNumberRegexTest extends BaseTest {

    protected ByteArrayOutputStream output;
    private PrintStream old;

    @BeforeGroups(groups = "PhoneNumberRegex method")
    public void beforeGroupsPhoneNumberRegexMethod() {
        old = System.out;
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @AfterGroups(groups = "PhoneNumberRegex method")
    public void afterGroupsPhoneNumberRegexMethod() {
        System.setOut(old);
    }

    @Test(groups = "PhoneNumberRegex method", dataProvider = "correctPhoneNumbers")
    public void phoneNumberRegexPositiveTest(String phoneNumber) {
        String expected = "The entered phone number is in the correct format.";
        PhoneNumberRegex.checkPhoneNumber(phoneNumber);
        String[] arrayOut = output.toString().split("\n");
        String actual = arrayOut[arrayOut.length - 1];


        Assert.assertEquals(expected, actual.trim());
    }

    @DataProvider
    public Object[][] correctPhoneNumbers() {
        return new Object[][]{
                {"+38(098)3456899"},
                {"+38(050)4589121"},
                {"+38(063)9123450"}
        };
    }

    @Test(groups = "PhoneNumberRegex method")
    @Parameters("number")
    public void phoneNumberRegexNegativeTest(@Optional("+3806748322333") String number) {
        String expected = "The entered phone number is not in the correct format.";
        PhoneNumberRegex.checkPhoneNumber(number);
        String[] arrayOut = output.toString().split("\n");
        String actual = arrayOut[arrayOut.length - 1];

        Assert.assertEquals(expected, actual.trim());
    }

    @Test(groups = "PhoneNumberRegex method")
    public void phoneNumberRegexNullTest() {
        String expected = "Entered null.";
        PhoneNumberRegex.checkPhoneNumber(null);
        String[] arrayOut = output.toString().split("\n");
        String actual = arrayOut[arrayOut.length - 1];

        Assert.assertEquals(expected, actual.trim());
    }
}
