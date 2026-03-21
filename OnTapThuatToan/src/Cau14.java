import java.util.ArrayList;
import java.util.Scanner;

public class Cau14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0, greater = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào arr["+i+"]: ");
            numbers.add(sc.nextInt());
            sum+=numbers.get(i);
        }

        int avarage = sum/n;

        for (Integer num :numbers){
            if (num > avarage){
                greater++;
            }
        }

        System.out.println("Average: " + avarage);
        System.out.print("Greater: " + greater);

    }
}
