package ua.hillel.qaauto.task2;

import org.testng.annotations.Test;

public class TestRectangle {

    @Test
    public void testSquare() {
        Rectangle rectangle = new Rectangle(5.0, 4.0);
        System.out.println("Square of rectangle: " + rectangle.calculateSquare());
    }

    @Test
    public void testPerimeter() {
        Rectangle rectangle = new Rectangle(11.0, 17.0);
        System.out.println("Perimeter of rectangle: " + rectangle.calculatePerimeter());
    }

    @Test
    public void testConstructorWithNoArgs() {
        Rectangle rectangle = new Rectangle();
        System.out.println("width: " + rectangle.width + " height: " + rectangle.height);
    }
}
