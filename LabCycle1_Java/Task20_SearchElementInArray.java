import java.util.Scanner;

public class Task20_SearchElementInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {

            if (arr[i] == search) {
                System.out.println("Element found at position " + (i + 1));
                found = true;
                break;
            }

        }

        if (!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}