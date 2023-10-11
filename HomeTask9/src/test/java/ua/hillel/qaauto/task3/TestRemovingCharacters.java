package ua.hillel.qaauto.task3;

import org.testng.annotations.Test;

public class TestRemovingCharacters {

    @Test
    public void testRemovingCharacters() {
        System.out.println(RemovingCharacters.removingCharacters("abcd4efabc123deabcdaaa", "a", "d", "3"));
    }
}
