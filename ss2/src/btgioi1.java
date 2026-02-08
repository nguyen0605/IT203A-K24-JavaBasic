import javax.swing.text.Style;
import java.util.Scanner;

public class btgioi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sách trả muộn: ");
        int n = sc.nextInt();

        int days = 0;
        for(int i = 1; i <= n; i++){
            System.out.print("Nhập số ngày trễ của cuốn thứ i: ");
            days = days + sc.nextInt();
        }

        System.out.println("==> Tổng tiền phạt: " + (days * 5000) + " VND");
    }
}
