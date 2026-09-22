package payment;

public class UPI extends PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI");
    }
}