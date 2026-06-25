import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name, course;
        int roll;
        double percentage;

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        course = sc.nextLine();

        System.out.print("Enter Percentage: ");
        percentage = sc.nextDouble();

        System.out.println("\nStudent Details");
        System.out.println("---------------");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + roll);
        System.out.println("Course     : " + course);
        System.out.println("Percentage : " + percentage);

    }
}