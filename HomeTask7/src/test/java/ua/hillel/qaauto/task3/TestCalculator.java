package ua.hillel.qaauto.task3;

import org.testng.annotations.Test;

public class TestCalculator {

    @Test
    void testPlus() {
        Calculator calculator = new Calculator();
        System.out.println("PLUS");
        System.out.println("int int: " + calculator.plus(5, 7));
        System.out.println("double double: " + calculator.plus(3.0, 5.8));
        System.out.println("double int: " + calculator.plus(6, 12.2));
    }

    @Test
    void testMinus() {
        Calculator calculator = new Calculator();
        System.out.println("MINUS");
        System.out.println("int int: " + calculator.minus(10, 20));
        System.out.println("double double: " + calculator.minus(37.6, 14.5));
        System.out.println("double int: " + calculator.minus(43.5, 16));
    }

    @Test
    void testMultiplication() {
        Calculator calculator = new Calculator();
        System.out.println("MULTIPLICATION");
        System.out.println("int int: " + calculator.multiplication(4, 8));
        System.out.println("double double: " + calculator.multiplication(12.3, 5.6));
        System.out.println("double int: " + calculator.multiplication(9.2, 22));
    }

    @Test
    void testDivision() {
        Calculator calculator = new Calculator();
        System.out.println("DIVISION");
        System.out.println("int int: " + calculator.division(15, 3));
        System.out.println("double double: " + calculator.division(46.7, 0.6));
        System.out.println("double int: " + calculator.division(3, 39.4));
    }
}
