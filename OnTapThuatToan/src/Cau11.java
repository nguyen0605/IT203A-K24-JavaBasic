import java.util.ArrayList;
import java.util.Scanner;

public class Cau11 {
    public static boolean isPrime(int n){
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào arr["+i+"]: ");
            numbers.add(sc.nextInt());
        }

        System.out.print("Prime: ");
        for (Integer num : numbers){
            if (isPrime(num)){
                System.out.print(num + " ");
            }
        }
    }
}
