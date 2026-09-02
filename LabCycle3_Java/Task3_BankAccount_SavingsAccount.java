// Parent class
class BankAccount {

    // Private members cannot be accessed directly by subclass
    private int accountNumber;
    private double balance;

    // BankAccount constructor
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}

// SavingsAccount inherits BankAccount
class SavingsAccount extends BankAccount {

    double interestRate;

    // SavingsAccount constructor
    SavingsAccount(int accountNumber, double balance,
                   double interestRate) {

        // Calling parent constructor
        super(accountNumber, balance);

        this.interestRate = interestRate;
    }

    // Display account details
    void displayAccount() {

        System.out.println("Account Details");
        System.out.println("----------------");

        // Accessing private members using getters
        System.out.println(
            "Account Number : " + getAccountNumber()
        );

        System.out.println(
            "Balance        : " + getBalance()
        );

        System.out.println(
            "\nInterest Rate  : " + interestRate + "%"
        );

        // Calculate one year's interest
        double interest =
            getBalance() * interestRate / 100;

        System.out.println(
            "Interest Earned : " + interest
        );
    }
}

// Main class
public class Task3_BankAccount_SavingsAccount {

    public static void main(String[] args) {

        // Creating SavingsAccount object
        SavingsAccount s = new SavingsAccount(
            100245,
            50000.0,
            5
        );

        // Display account details
        s.displayAccount();
    }
}