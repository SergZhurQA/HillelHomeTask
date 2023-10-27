package ua.hillel.qaauto.task1;

import java.util.Objects;

public class Manager extends Employee {
    int salesPerformance;

    public Manager(String name, String address, int salary, String position, int yearInCompany, int salesPerformance) {
        super(name, address, salary, position, yearInCompany);
        this.salesPerformance = salesPerformance;
    }

    @Override
    public double calculatingBonuses() {
        if (salesPerformance > 50) {
            return super.calculatingBonuses() + (this.getSalary() / 100 * 10);
        }
        return 150 + (this.getYearsInCompany() * 50);
    }

    @Override
    public String jobInformation() {
        return String.format("%s %s working in our company. The sales manager is responsible for attracting money to the company.", this.getPosition(), this.getName());
    }

    @Override
    public String toString() {
        return "Manager" + "\n" +
                "name: " + name + "\n" +
                "address: " + address + "\n" +
                "position: " + position + "\n" +
                "yearsInCompany: " + yearsInCompany + "\n" +
                "salary: " + salary + "\n" +
                "salesPerformance: " + salesPerformance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return salesPerformance == manager.salesPerformance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salesPerformance);
    }
}
