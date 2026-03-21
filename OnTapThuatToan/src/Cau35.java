import java.util.Scanner;

public class Cau35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào chuỗi input: ");
        String input = sc.nextLine();

        String rev = "";
        for (int i = input.length()-1; i >= 0; i--) {
            rev += input.charAt(i);
        }

        if (input.equals(rev)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
