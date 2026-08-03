import java.util.Scanner;

public class Task15_SumOfDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        SumOfDigits obj = new SumOfDigits();

        int result = obj.findSum(number);

        System.out.println("Sum of digits = " + result);

        sc.close();
    }
}