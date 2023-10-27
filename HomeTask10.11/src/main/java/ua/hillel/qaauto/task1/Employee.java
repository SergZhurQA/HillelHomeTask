package ua.hillel.qaauto.task1;

import java.util.Objects;

public class Employee {
    String name, address, position;
    int yearsInCompany, salary;

    public Employee(String name, String address, int salary, String position, int yearsInCompany) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.position = position;
        this.yearsInCompany = yearsInCompany;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public int getYearsInCompany() {
        return yearsInCompany;
    }

    public void setYearsInCompany(int yearsInCompany) {
        this.yearsInCompany = yearsInCompany;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double calculatingBonuses() {
        return 100 + (this.getYearsInCompany() * 50);
    }

    public String reportsOnEfficiency(String efficiencyLabel) {
        return String.format("Performance report for %s %s -> %s", this.getPosition(), this.getName(), efficiencyLabel);
    }

    public String jobInformation() {
        return String.format("%s %s working in our company.", this.getPosition(), this.getName());
    }

    @Override
    public String toString() {
        return "Employee" + '\n' +
                "name: '" + name + '\'' + '\n' +
                "address: '" + address + '\'' + '\n' +
                "salary: '" + salary + '\'' + '\n' +
                "position: '" + position + '\'' + '\n' +
                "year in company: '" + yearsInCompany + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(address, employee.address) && Objects.equals(salary, employee.salary) && Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, position, yearsInCompany, salary);
    }
}
