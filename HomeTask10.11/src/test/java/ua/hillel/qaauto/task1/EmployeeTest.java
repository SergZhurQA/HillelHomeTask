package ua.hillel.qaauto.task1;

import org.testng.annotations.Test;

public class EmployeeTest {

    @Test
    public void testEmployeeMethods() {
        Employee employee = new Employee("Teodor", "New York", 4000, "developer", 0);
        Employee employee1 = new Employee("Sergii", "New York", 4000, "developer", 0);
        System.out.println(employee.calculatingBonuses());
        System.out.println(employee.jobInformation());
        System.out.println(employee.reportsOnEfficiency("Perfect"));
        System.out.println(employee.equals(employee1));
        System.out.println(employee);
    }

    @Test
    public void testDeveloperMethods() {
        Developer developer = new Developer("John", "Odesa", 3000, "Developer", 3, 20);
        Developer developer2 = new Developer("John", "Odesa", 3000, "Developer", 3, 20);
        System.out.println(developer.reportsOnEfficiency("Good"));
        System.out.println(developer.calculatingBonuses());
        System.out.println(developer.jobInformation());
        System.out.println(developer.equals(developer2));
        System.out.println(developer);
    }

    @Test
    public void testQAMethods() {
        Developer qa = new Developer("John", "Odesa", 3000, "qa", 3, 20);
        Developer qa2 = new Developer("John", "Odesa", 3000, "qa", 3, 20);
        System.out.println(qa.reportsOnEfficiency("Satisfactorily"));
        System.out.println(qa.calculatingBonuses());
        System.out.println(qa.jobInformation());
        System.out.println(qa.equals(qa2));
        System.out.println(qa);
    }

    @Test
    public void testManagerMethods() {
        Manager manager = new Manager("John", "Odesa", 3000, "Manager", 0, 20);
        Manager manager2 = new Manager("John", "Odesa", 3000, "Manager", 0, 20);
        System.out.println(manager.reportsOnEfficiency("Satisfactorily"));
        System.out.println(manager.calculatingBonuses());
        System.out.println(manager.jobInformation());
        System.out.println(manager.equals(manager2));
        System.out.println(manager);
    }
}
