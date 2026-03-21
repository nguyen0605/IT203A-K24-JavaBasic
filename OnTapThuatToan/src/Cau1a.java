import java.util.Scanner;

public class Cau1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào n: ");
        int n  = sc.nextInt();

        int[] numbers = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào arr["+i+"]: ");
            numbers[i] = sc.nextInt();
            sum+=numbers[i];
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        int max = numbers[n-1];

        System.out.println("Max: " + max);
        System.out.println("Sum: " + sum);
        System.out.println("Sorted: ");
        for (Integer num : numbers){
            System.out.print(num + " ");
        }
    }
}
