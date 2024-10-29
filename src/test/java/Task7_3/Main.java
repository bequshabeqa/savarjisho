package Task7_3;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new CreditCardProcessor();
        PaymentProcessor payPalProcessor = new PayPalProcessor();


        System.out.println("Payment: ");
        PaymentService.executePayment(creditCardProcessor, 15.25);
        PaymentService.executePayment(payPalProcessor, 45.75);

        System.out.println("Payment with polymorphism: ");
        executeCreditPayment(creditCardProcessor);
        executePayPalPayment(payPalProcessor);
        


    }

    private static void executeCreditPayment(PaymentProcessor creditCardProcessor) {
        creditCardProcessor.process(45.22);
    }
    private static void executePayPalPayment(PaymentProcessor paymentProcessor) {
        paymentProcessor.process(37.56);
    }


}
