package ua.hillel.qaauto.task1;

import org.testng.annotations.Test;

public class TestStudent {

    @Test
    public void testDefaultConstructor(){
        Student student = new Student();
        Student.displayStudentInfo(student);
    }

    @Test
    public void testSetNameNull(){
        Student student = new Student();
        student.setName(null);
        Student.displayStudentInfo(student);
    }

    @Test
    public void testSetStudentNull(){
        Student student = new Student();
        student = null;
        Student.displayStudentInfo(student);

    }
}
