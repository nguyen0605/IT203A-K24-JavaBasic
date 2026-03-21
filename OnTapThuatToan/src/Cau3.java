import java.util.ArrayList;
import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào arr["+i+"]: ");
            numbers.add(sc.nextInt());
        }

        int even = 0, odd = 0;
        for (Integer num : numbers){
            if (num % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even: "+ even);
        System.out.println("Odd: " + odd);
    }
}
