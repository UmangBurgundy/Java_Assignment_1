public class InheritancePolymorphism {
    static class PaymentGateway {
        void processPayment(double amount) {
            System.out.println("Processing generic payment of $" + amount);
        }
    }

    static class CreditCardPayment extends PaymentGateway {
        @Override
        void processPayment(double amount) {
            System.out.println("Processing credit card payment of $" + amount);
        }
    }

    static class PayPalPayment extends PaymentGateway {
        @Override
        void processPayment(double amount) {
            System.out.println("Processing PayPal payment of $" + amount);
        }
    }

    public static void main(String[] args) {
        PaymentGateway p1 = new CreditCardPayment();
        PaymentGateway p2 = new PayPalPayment();
        p1.processPayment(150.0);
        p2.processPayment(89.5);
    }
}
