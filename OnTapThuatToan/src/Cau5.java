import java.util.ArrayList;
import java.util.Scanner;

public class Cau5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào arr["+i+"]: ");
            numbers.add(sc.nextInt());
        }

        System.out.print("Divisible by 5: ");
        for (Integer num : numbers){
            if (num % 5 == 0){
                System.out.print(num + " ");
            }
        }
    }
}
