package ua.hillel.qaauto.task2;

import java.time.LocalDate;

public class MessageGenerator {

    public static String personalDataMessage(String name, int age, String position) {
        return String.format("name: %-25s age: %-10d position: %-10s", name, age, position);
    }

    public static String rentalInformationMessage(String name, int termDays, LocalDate date) {
        return String.format("%s rent a car for %d days on %tD.", name, termDays, date);
    }

    public static String mobileOperatorNameMessage(String number) {
        String prefix = String.format("%.5s", number);
        switch (prefix) {
            case "(063)":
                return "Operator of this number is LifeCell";
            case "(095)":
                return "Operator of this number is Vodafone";
            case "(098)":
                return "Operator of this number is Kyivstar";
        }
        return "No matched ukrainian operators.";
    }

}
