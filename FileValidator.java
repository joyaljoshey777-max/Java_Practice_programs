class InvalidRecordException extends Exception {

    InvalidRecordException(String message) {
        super(message);
    }
}

public class FileValidator {

    public static void main(String[] args) {

        String[] records = {
                "101,Asni,90",
                "102,Ali",
                "103,John,85"
        };

        try {

            for (String record : records) {

                String[] fields = record.split(",");

                if (fields.length != 3) {
                    throw new InvalidRecordException(
                            "Malformed record: " + record
                    );
                }

                System.out.println(
                        "Valid record: " + record
                );
            }

        } catch (InvalidRecordException e) {

            System.out.println(
                    "Invalid Record: " + e.getMessage()
            );

        } catch (RuntimeException e) {

            System.out.println("Runtime error occurred.");

        } finally {

            System.out.println("Validation completed.");
        }
    }
}