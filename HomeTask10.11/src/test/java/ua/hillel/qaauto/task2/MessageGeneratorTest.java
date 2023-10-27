package ua.hillel.qaauto.task2;

import org.testng.annotations.Test;

import java.time.LocalDate;

public class MessageGeneratorTest {

    @Test
    public void personalDataMessageTest() {
        System.out.println(MessageGenerator.personalDataMessage("Sergii", 26, "QA"));
        System.out.println(MessageGenerator.personalDataMessage("Aleksandrov Aleksandr", 30, "Developer"));
        System.out.println(MessageGenerator.personalDataMessage("Vatalii Shulba", 34, "Project Manager"));
    }

    @Test
    public void rentalInformationMessageTest() {
        System.out.println(MessageGenerator.rentalInformationMessage("Sergii", 6, LocalDate.of(2023, 10, 2)));
    }

    @Test
    public void mobileOperatorNameMessageTest() {
        System.out.println(MessageGenerator.mobileOperatorNameMessage("(095) 555 3453"));
        System.out.println(MessageGenerator.mobileOperatorNameMessage("(063) 555 3453"));
    }
}
