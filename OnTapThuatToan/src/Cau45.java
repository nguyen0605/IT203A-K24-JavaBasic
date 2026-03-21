import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cau45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int N = sc.nextInt();
        sc.nextLine();

        List<Integer> arr1 = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            System.out.print("Nhập giá trị arr["+i+"]: ");
            arr1.add(sc.nextInt());
        }

        System.out.print("Nhập M: ");
        int M = sc.nextInt();
        sc.nextLine();

        List<Integer> arr2 = new ArrayList<>(M);

        for (int i = 0; i < M; i++) {
            System.out.print("Nhập giá trị arr["+i+"]: ");
            arr2.add(Integer.valueOf(sc.nextLine()));
        }

        int i = 0, j = 0;

        while (i < N && j < M){
            if (arr1.get(i) == arr2.get(j)){
                j++;
            }
            i++;
        }

        if (j == arr2.size()){
            System.out.println("Mảng B là con của mảng A");
        } else {
            System.out.println("Mảng B không phải là con của mảng A");
        }
    }
}
