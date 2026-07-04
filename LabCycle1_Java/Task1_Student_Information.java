import java.util.Scanner;

public class Task1_Student_Information {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Reading input
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        sc.nextLine(); // Clears the leftover newline

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble();

        // Display Output
        System.out.println("\nStudent Details");
        System.out.println("----------------------");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Course     : " + course);
        System.out.println("Percentage : " + percentage);

        sc.close();
    }
}