import java.util.Scanner;

public class btkha1 {
    public static int[] addBookToLibraries(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];

        System.out.println("Nhập mã số cho " + n + " cuốn sách");
        for(int i = 0; i < n; i++){
            System.out.print("Sách thứ "+ (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        return  arr;
    }

    public static void displayLibraries(int[] arr) {
        System.out.print("Danh sách mã sách: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Nhập số lượng sách cần quản lý: ");
        int n = sc.nextInt();

        int[] books = addBookToLibraries(n);
        System.out.println("\n--- KẾT QUẢ ---");
        displayLibraries(books);
    }
}