import java.util.Scanner;

public class btxuatsac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int points = 100, days = 0;;
        System.out.println("--- HỆ THỐNG ĐÁNH GIÁ ĐỘC GIẢ ---\n(Nhập số ngày trễ. Nhập 999 để kết thúc)");
        do{

            System.out.print("Số ngày trễ của lần này: ");
            days = sc.nextInt();

            if(days == 999){
                break;
            }else if(days <= 0){
                points = points + 5;
                System.out.println("-> Trả đúng hạn: +5 điểm.");
            }else {
                System.out.println("-> Trã trễ " + days +" ngày: -" + days * 2 + " điểm");
                points = points - (days * 2);
            }

        }while (days != 999);
        System.out.println("Tổng điểm uy tín: " + points);
        System.out.println("Xếp loại: " + ((points>120) ? "Độc giả Thân thiết" : (points >= 80 ? "Độc giả Tiêu chuẩn" : "Độc giả cần lưu ý")));
    }
}
