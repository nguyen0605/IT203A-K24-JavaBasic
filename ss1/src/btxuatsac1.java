import java.util.Scanner;

public class btxuatsac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách (4 chữ số): ");
        int code = sc.nextInt();

        int thousands = code / 1000;
        int hundreds = (code / 100) % 10;
        int dozens = (code / 10) % 10;
        int units = code % 10;

        int sumOfFirstThreeNumber = thousands + hundreds + dozens;
        System.out.printf("Chữ số kiểm tra kỳ vọng: %d\n", sumOfFirstThreeNumber);

        String isValid = (sumOfFirstThreeNumber % 10 == units) ? "HỢP LỆ" : "SAI MÃ";
        if(sumOfFirstThreeNumber % 10 == units){
            System.out.println("Kết quả kiểm tra mã sách: " + isValid);
        }else {
            System.out.println("Kết quả kiểm tra mã sách: " + isValid);
        }
    }
}
