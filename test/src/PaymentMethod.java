public abstract class PaymentMethod {
    protected String methodNamne;

    public static int totalPayments = 0;

    public PaymentMethod(String methodNamne) {
        this.methodNamne = methodNamne;
        totalPayments++;
    }

    public abstract void pay(double amount);

    public void displayMethod(){
        System.out.println("Phương thức: " + methodNamne);
    }
}
