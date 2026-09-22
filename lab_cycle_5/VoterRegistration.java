class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

class Voter {

    void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException(
                    "Age must be 18 or above."
            );
        }
    }

    void registerVoter(int age)
            throws InvalidAgeException {

        checkAge(age);

        System.out.println("Voter registered successfully.");
    }
}

public class VoterRegistration {

    public static void main(String[] args) {

        try {
            Voter voter = new Voter();
            voter.registerVoter(16);

        } catch (InvalidAgeException e) {
            System.out.println(
                    "Registration failed: " + e.getMessage()
            );
        }
    }
}