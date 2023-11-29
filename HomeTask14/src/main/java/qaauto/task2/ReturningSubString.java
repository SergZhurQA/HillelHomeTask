package qaauto.task2;

public class ReturningSubString {
    public static String returnSubString(String text, String removedPart) {
        if (text == null || text.equals("") || removedPart == null) {
            return text;
        }
        return text.replace(removedPart, "");
    }
}
