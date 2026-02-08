import java.util.Scanner;

public class btgioi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ID = 0;
        do{
            System.out.print("Nhập mã ID sách mới (phải > 0): ");
            ID = sc.nextInt();

            System.out.println((ID <= 0) ? "lỗi: ID phải là số dương. Mời nhập lại!" : "Xác nhận: Mã sách " + ID + " đã được ghi nhận");
        }while (ID <= 0);
    }
}
