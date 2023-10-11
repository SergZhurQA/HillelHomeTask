package ua.hillel.qaauto.task1;

public class Student {
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    Student(){
        name = "StudentName";
        age = -1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    static void displayStudentInfo(Student student){
        if(student != null){
            System.out.println("Student name: " + student.getName() + " age: " + student.getAge());
        }else System.out.println("No data about the student");

    }
}
