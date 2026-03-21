import java.util.ArrayList;
import java.util.Scanner;

public class Cau10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào arr["+i+"]: ");
            numbers.add(sc.nextInt());
        }

        int sumOdd = 0;

        for (Integer num: numbers){
            if (num % 2 != 0){
                sumOdd+=num;
            }
        }

        System.out.println("Odd Sum : " + sumOdd);
    }
}
