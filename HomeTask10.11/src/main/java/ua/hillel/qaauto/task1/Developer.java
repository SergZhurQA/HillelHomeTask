package ua.hillel.qaauto.task1;

import java.util.Objects;

public class Developer extends Employee {
    int grossProfitMargin;

    public Developer(String name, String address, int salary, String position, int yearInCompany, int grossProfitMargin) {
        super(name, address, salary, position, yearInCompany);
        this.grossProfitMargin = grossProfitMargin;
    }

    @Override
    public double calculatingBonuses() {
        if (grossProfitMargin > 10 && grossProfitMargin < 50) {
            return (200 + (this.getYearsInCompany() * 100)) + (this.getSalary() / 100 * 15);
        } else if (grossProfitMargin > 50) {
            return (200 + (this.getYearsInCompany() * 100)) + (this.getSalary() / 100 * 35);
        }
        return 200 + (this.getYearsInCompany() * 100);
    }

    @Override
    public String jobInformation() {
        return String.format("%s %s working in our company. And develop new programs on JAVA.", this.getPosition(), this.getName());
    }

    @Override
    public String toString() {
        return "Developer: " + "\n" +
                "name: " + name + "\n" +
                "address: " + address + "\n" +
                "position: " + position + "\n" +
                "yearsInCompany: " + yearsInCompany + "\n" +
                "salary: " + salary + "\n" +
                "grossProfitMargin: " + grossProfitMargin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Developer developer = (Developer) o;
        return grossProfitMargin == developer.grossProfitMargin;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grossProfitMargin);
    }
}
