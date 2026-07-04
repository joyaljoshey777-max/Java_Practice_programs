import java.util.Scanner;

public class Task5_EmployeeSalaryCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        // Calculations
        double da = (basicSalary * 10) / 100;
        double hra = (basicSalary * 15) / 100;
        double grossSalary = basicSalary + da + hra;

        // Output
        System.out.println("DA = " + da);
        System.out.println("HRA = " + hra);
        System.out.println("Gross Salary = " + grossSalary);

        sc.close();
    }
}