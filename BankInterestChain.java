class Account {
    double balance;
    final double MIN_BALANCE = 1000;

    Account(double balance) {
        this.balance = balance;
    }

    double calculateInterest() {
        return balance * 0.04;
    }
}

class SavingsAccount extends Account {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.06;
    }
}

class FixedDepositAccount extends SavingsAccount {

    FixedDepositAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        double baseInterest = super.calculateInterest();
        double bonus = balance * 0.02;

        return baseInterest + bonus;
    }
}

public class BankInterestChain {
    public static void main(String[] args) {
        FixedDepositAccount account =
                new FixedDepositAccount(100000);

        System.out.println("Minimum Balance: " + account.MIN_BALANCE);
        System.out.println("Interest: " + account.calculateInterest());
    }
}