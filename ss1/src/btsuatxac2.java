import java.util.Scanner;

public class btsuatxac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ tự của sách trong hệ thống: ");
        int stt = sc.nextInt();

        if (stt <= 0) {
            System.out.println("STT không hợp lệ (phải >= 1).");
            return;
        }

        int shelf = (stt - 1) / 25 + 1;
        int pos   = (stt - 1) % 25 + 1;

        String zone = (shelf <= 10) ? "Khu Cận (Gần cửa)" : "Khu Viễn (Xa hơn)";

        System.out.println();
        System.out.println("--- THÔNG TIN ĐỊNH VỊ ---");
        System.out.println("Sách số: " + stt);
        System.out.println("Địa chỉ: Kệ " + shelf + " - Vị trí " + pos);
        System.out.println("Phân khu: " + zone);
    }
}
