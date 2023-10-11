package ua.hillel.qaauto.task1;

public class ReverseString {
    static String reverseStr(String string) {
        if (string == null || string.equals("")) {
            return string;
        }
        return reverseStr(string.substring(1)) + string.charAt(0);
    }
}
