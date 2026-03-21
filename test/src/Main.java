import java.util.List;

public class Main {
    static public void main(String[] args) {
        System.out.println("=== PAYMENT SYSTEM ===");

        PaymentMethod[] payments = new PaymentMethod[3];

        payments[0] = new CreditCardPayment("Credit Card", "123-405");
        payments[1] = new EWalletPayment("E-wallet", 500);

        payments[2] = new PaymentMethod("Cash") {
            @Override
            public void pay(double amount) {
                System.out.println("Thanh toán tiền mặt "+ amount);
            }
        };

        double amount = 300;

        for (PaymentMethod p : payments){
            p.displayMethod();
            p.pay(amount);

            if (p instanceof IPayment){
                ((IPayment) p).processPayment(amount);
            }
        }

        System.out.println("Tổng số phương thức thanh toán: " + PaymentMethod.totalPayments);
    }
}