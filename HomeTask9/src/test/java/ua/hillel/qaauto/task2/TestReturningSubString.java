package ua.hillel.qaauto.task2;

import org.testng.annotations.Test;

public class TestReturningSubString {

    @Test
    public void testReturningSubString() {
        System.out.println(ReturningSubString.returnSubString("This is the test string", "st"));
    }
}
