import java.io.*;

public class StudentReportGenerator {

    public static void main(String[] args) {

        String inputFile = "students.txt";
        String outputFile = "student_report.txt";

        try {

            // Create input file
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter(inputFile));

            writer.write("Asni,85,90,88");
            writer.newLine();
            writer.write("Alan,75,80,70");
            writer.newLine();
            writer.write("Johny,90,95,92");
            writer.close();

            BufferedReader reader =
                    new BufferedReader(new FileReader(inputFile));

            BufferedWriter output =
                    new BufferedWriter(
                            new FileWriter(outputFile)
                    );

            String line;
            double totalAverage = 0;
            int count = 0;

            output.write("STUDENT REPORT");
            output.newLine();
            output.write("----------------------");
            output.newLine();

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];

                double m1 = Double.parseDouble(data[1]);
                double m2 = Double.parseDouble(data[2]);
                double m3 = Double.parseDouble(data[3]);

                double average = (m1 + m2 + m3) / 3;

                output.write(
                        name + " - Average: " + average
                );
                output.newLine();

                totalAverage += average;
                count++;
            }

            double classAverage = totalAverage / count;

            output.newLine();
            output.write(
                    "Overall Class Average: " + classAverage
            );

            reader.close();
            output.close();

            System.out.println(
                    "Student report generated successfully."
            );

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}