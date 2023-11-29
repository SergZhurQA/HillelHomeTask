package qaauto.task4;

import java.util.regex.Pattern;

public class PhoneNumberRegex {
    public static void checkPhoneNumber(String phoneNumber) {
        if (phoneNumber == null) {
            System.out.println("Entered null.");
        } else if (Pattern.matches("^\\+38\\(0\\d{2}\\)\\d{7}", phoneNumber)) {
            System.out.println("The entered phone number is in the correct format.");
        } else {
            System.out.println("The entered phone number is not in the correct format.");
        }
    }

    public static void main(String[] args) {
        PhoneNumberRegex.checkPhoneNumber("+38(098)3456899");
    }
}
