public class CreditCardPayment extends PaymentMethod implements IPayment{
    private String cardNumber;

    public CreditCardPayment(String methodNamne, String cardNumber) {
        super(methodNamne);
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán: " + amount +" bằng thẻ tín dụng");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Đang xử lý thẻ tín dụng " + cardNumber);
        System.out.println("Thanh toán thành công");
    }
}
