import payment.*;

public class PaymentGateway {
    public static void main(String[] args) {

        PaymentMethod p1 = new CreditCard();
        PaymentMethod p2 = new UPI();

        p1.pay(1500);
        p2.pay(750);
    }
}