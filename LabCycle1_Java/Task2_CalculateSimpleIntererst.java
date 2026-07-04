import java.util.Scanner;

public class Task2_CalculateSimpleIntererst {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        // Calculation
        double simpleInterest = (principal * rate * time) / 100;

        double amount = principal + simpleInterest;

        // Output
        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Amount = " + amount);

        sc.close();
    }
}