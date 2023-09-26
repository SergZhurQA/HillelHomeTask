package ua.hillel.qaauto.task1;

import org.testng.annotations.Test;

public class TestPerson {

    @Test
    public void attributeTest() {
        Person person1 = new Person("Diana", 30);
        Person person2 = new Person("Garry", 25);
        System.out.println("Person1 name: " + person1.name + " age: " + person1.age);
        System.out.println("Person2 name: " + person2.name + " age: " + person2.age);
    }
}
