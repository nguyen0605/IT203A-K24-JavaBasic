import java.util.Scanner;

public class btkha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tuổi của bạn: ");
        int age = sc.nextInt();

        System.out.print("Nhập số sách đang muốn: ");
        int books = sc.nextInt();

        if(age > 17 && books < 4){
            System.out.println("Kết quả: Bạn ĐỦ ĐIỀU KIỆN mượn sách quý hiếm");
        }else if(age < 18 && books > 3){
            System.out.println("Kết quả: Không đủ điều kiện\n- Lý do: Bạn chưa đủ 18 tuổi. Bạn đã mượn tối đa 3 cuốn");
        }else{
            System.out.println("Kết quả: Không đủ điều kiện\n- Lý do: " + (age < 18 ? "Bạn chưa đủ 18 tuổi" : "Bạn đã mượn tối đa 3 cuốn"));
        }
    }
}