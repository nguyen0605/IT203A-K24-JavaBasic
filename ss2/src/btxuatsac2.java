import java.sql.SQLOutput;
import java.util.Scanner;

public class btxuatsac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0, min = Integer.MAX_VALUE;
        int sum = 0, openDays = 0;

        for (int i = 2; i <= 8 ; i++){
            String dayName = (i == 8) ? "Chủ Nhật:" : "Thứ " + i + ":";
            System.out.print("Nhập lượt mượn ngày " + dayName);
            int borrow = sc.nextInt();

            if(borrow == 0){
                continue;
            }

            sum += borrow;
            openDays++;

            if(borrow > max) max=borrow;
            if (borrow < min) min=borrow;
        }

        System.out.println("--- KẾT QUẢ THỐNG KÊ ---");
        System.out.println("Lượt mượn cao nhất: " + max);
        System.out.println("Lượt mượn thấp nhất: " + min);
        System.out.println("Trung bình lượt mượn/ngày: " + ((double)sum / openDays));
    }
}
