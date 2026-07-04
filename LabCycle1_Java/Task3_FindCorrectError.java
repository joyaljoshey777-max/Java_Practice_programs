import java.util.Scanner;

public class Task3_FindCorrectError {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) /*Missing semicolon*/;

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;

        /*double average = total / 0;   /*Wrong Verable Name and division by 0*/
        double average = sum / 3.0;

        System.out.println("Average = " + average);

        sc.close();
    }
}