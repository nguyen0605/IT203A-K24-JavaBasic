import java.util.Scanner;

public class Cau32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào 1 số nguyên dương: ");
        int input = sc.nextInt();

        String octal = " ";

        while (input > 0){
            int n = input % 8;
            octal = n + octal;
            input /= 8;
        }

        System.out.println(octal);
    }
}
