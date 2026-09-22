class InsufficientFundsException extends Exception {

    InsufficientFundsException(String message) {
        super(message);
    }
}

class ATM {

    double balance = 5000;

    void withdraw(double amount)
            throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Insufficient balance!"
            );
        }

        balance -= amount;
        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance: " + balance);
    }
}

public class ATMWithdrawal {
    public static void main(String[] args) {

        try {
            ATM atm = new ATM();

            atm.withdraw(6000);

        } catch (InsufficientFundsException e) {
            System.out.println("Transaction failed: " + e.getMessage());

        } catch (RuntimeException e) {
            System.out.println("Invalid input!");
        }
    }
}