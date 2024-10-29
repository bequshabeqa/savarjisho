package Task7_3;

public class PayPalProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("payment is being processed by PayPal: " + amount);
    }
}