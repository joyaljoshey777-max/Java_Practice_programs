public class MarksProcessor {

    public static void main(String[] args) {

        int[] marks = {80, 75, 90, 85, 95};

        try {
            int total = 0;

            for (int i = 0; i <= 5; i++) {
                total += marks[i];
            }

            int average = total / marks.length;

            System.out.println("Average: " + average);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");

        } finally {
            System.out.println("Processing complete");
        }
    }
}