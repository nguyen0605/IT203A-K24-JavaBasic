import java.util.Scanner;

public class Cau41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();

        if (input == null || input.isEmpty()){
            System.out.println("Bạn chưa nhập nội dung!");
            return;
        }

        int currentNumber = 0, sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isDigit(c)){
                currentNumber = currentNumber * 10 + (c - '0');
            } else {
                sum += currentNumber;
                currentNumber = 0;
            }
        }

        sum+= currentNumber;
        System.out.print(sum);
    }
}
