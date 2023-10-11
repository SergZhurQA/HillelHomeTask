package ua.hillel.qaauto.task2;

public class Rectangle {
    double width, height;

    Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double calculateSquare() {
        return this.width * this.height;
    }

    double calculatePerimeter() {
        return (this.width + this.height) * 2;
    }

}
