package ua.hillel.qaauto.task3;

public class Calculator {
    int plus(int numb1, int numb2) {
        return numb1 + numb2;
    }

    double plus(double numb1, double numb2) {
        return numb1 + numb2;
    }

    int minus(int numb1, int numb2) {
        return numb1 - numb2;
    }

    double minus(double numb1, double numb2) {
        return numb1 - numb2;
    }

    int multiplication(int numb1, int numb2) {
        return numb1 * numb2;
    }

    double multiplication(double numb1, double numb2) {
        return numb1 * numb2;
    }

    int division(int numb1, int numb2) {
        if (numb2 == 0) {
            System.out.println("Division by zero is prohibited.");
            return -1;
        }
        return numb1 / numb2;
    }

    double division(double numb1, double numb2) {
        return numb1 / numb2;
    }
}
