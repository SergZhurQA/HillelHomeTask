package ua.hillel.qaauto.task1;

import org.testng.annotations.Test;

public class TestReverseString {

    @Test
    public void testReverse() {
        System.out.println(ReverseString.reverseStr("Some string for test."));
    }
}
