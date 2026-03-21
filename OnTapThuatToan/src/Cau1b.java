import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cau1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("NHập vào arr["+i+"]: ");
            numbers.add(sc.nextInt());
        }

        Collections.sort(numbers);
        for (Integer num: numbers){
            System.out.print(num + " ");
        }

        Collections.sort(numbers, Collections.reverseOrder());
//        Collections.reverse(numbers);
        for (Integer num: numbers){
            System.out.print(num + " ");
        }

    }
}
