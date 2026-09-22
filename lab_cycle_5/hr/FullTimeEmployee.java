package hr;

public class FullTimeEmployee extends Employee implements Taxable {

    double basicSalary;

    public FullTimeEmployee(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public double calculateSalary() {
        return basicSalary;
    }

    @Override
    public double calculateTax() {
        return basicSalary * 0.10;
    }
}