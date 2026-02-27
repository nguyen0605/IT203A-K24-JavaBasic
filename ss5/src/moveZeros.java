import java.util.Scanner;

public class moveZeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử: ");
        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        for (int i = index; i < n; i++) {
            arr[i] = 0;
        }

        System.out.println("Mảng sau khi dồn số 0:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}