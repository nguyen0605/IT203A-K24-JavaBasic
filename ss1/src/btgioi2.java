import java.util.Scanner;

public  class btgioi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập giá sách (USD - kiểu double): ");
        double priceUSD = sc.nextDouble();

        System.out.print("Nhập tỷ giá (VND/USD - kiểu float): ");
        float rate = sc.nextFloat();

        double totalVND = priceUSD * rate;

        long roundedVND = (long) totalVND;

        System.out.println("Giá chính xác (số thực): " + totalVND);
        System.out.println("Giá làm tròn để thanh toán (long): " + roundedVND);
    }
}