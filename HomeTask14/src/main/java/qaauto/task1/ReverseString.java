package qaauto.task1;

public class ReverseString {
    public static String reverseStr(String string) {
        if (string == null || string.equals("")) {
            return string;
        }
        return reverseStr(string.substring(1)) + string.charAt(0);
    }
}
