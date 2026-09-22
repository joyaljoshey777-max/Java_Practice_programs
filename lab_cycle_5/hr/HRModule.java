import hr.*;

public class HRModule {
    public static void main(String[] args) {

        FullTimeEmployee emp =
                new FullTimeEmployee(50000);

        System.out.println("Salary: " + emp.calculateSalary());
        System.out.println("Tax: " + emp.calculateTax());
    }
}