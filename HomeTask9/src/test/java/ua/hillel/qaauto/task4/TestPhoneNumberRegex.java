package ua.hillel.qaauto.task4;

import org.testng.annotations.Test;

public class TestPhoneNumberRegex {
    @Test
    public void testPhoneNumber() {
        PhoneNumberRegex.checkPhoneNumber("+38(098)345689");
    }
}
