import java.io.*;

public class WordCounter {

    public static void main(String[] args) {

        String inputFile = "input.txt";
        String outputFile = "wordcount.txt";

        try {

            // Create sample input file
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter(inputFile));

            writer.write("Java programming is interesting.");
            writer.newLine();
            writer.write("File handling is easy.");
            writer.close();

            // Read and count words
            BufferedReader reader =
                    new BufferedReader(new FileReader(inputFile));

            int count = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.trim().split("\\s+");

                if (!line.trim().isEmpty()) {
                    count += words.length;
                }
            }

            reader.close();

            // Write result
            BufferedWriter output =
                    new BufferedWriter(new FileWriter(outputFile));

            output.write("Total number of words: " + count);
            output.close();

            System.out.println("Word count: " + count);
            System.out.println("Result written to " + outputFile);

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
