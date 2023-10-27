package ua.hillel.qaauto.task1;

public class QA extends Employee {
    int grossProfitMargin;

    public QA(String name, String address, int salary, String position, int yearInCompany, int grossProfitMargin) {
        super(name, address, salary, position, yearInCompany);
        this.grossProfitMargin = grossProfitMargin;
    }

    @Override
    public double calculatingBonuses() {
        if (grossProfitMargin > 10 && grossProfitMargin < 50) {
            return (150 + (this.getYearsInCompany() * 100)) + (this.getSalary() / 100 * 10);
        } else if (grossProfitMargin > 50) {
            return (150 + (this.getYearsInCompany() * 100)) + (this.getSalary() / 100 * 30);
        }
        return 150 + (this.getYearsInCompany() * 100);
    }

    @Override
    public String jobInformation() {
        return String.format("%s %s working in our company. Responsible for product quality and testing.", this.getPosition(), this.getName());
    }

    @Override
    public String toString() {
        return "QA" + "\n" +
                "name: " + name + "\n" +
                "address: " + address + "\n" +
                "position: " + position + "\n" +
                "yearsInCompany: " + yearsInCompany + "\n" +
                "salary: " + salary + "\n" +
                "grossProfitMargin: " + grossProfitMargin;
    }
}
