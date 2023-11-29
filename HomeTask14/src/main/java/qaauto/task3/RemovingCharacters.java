package qaauto.task3;

public class RemovingCharacters {
    public static String removingCharacters(String text, String... removedPart) {
        if (text == null || text.equals("") || removedPart == null) {
            return text;
        }
        for (String s : removedPart) {
            text = text.replace(s, "");
        }
        return text;
    }
}
