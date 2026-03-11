public class EWalletPayment extends PaymentMethod implements IPayment{
    private double walletBalance;

    public EWalletPayment(String methodNamne, double walletBalance) {
        super(methodNamne);
        this.walletBalance = walletBalance;
    }

    @Override
    public void pay(double amount) {
        if (walletBalance >= amount){
            walletBalance -= amount;
            System.out.println("Thanh toán " + amount + " bằng ví điện tử.");
            System.out.println("Số dư còn lại: " + walletBalance);
        } else {
            System.out.println("Không đủ tiền trong ví");
        }
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Đang xử lý thanh toán qua ví điện tử...");
    }
}
