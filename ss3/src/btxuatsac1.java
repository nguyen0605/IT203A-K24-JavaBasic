import java.util.Arrays;
import java.util.Scanner;

public class btxuatsac1 {
    public static int deleteBook(int[] arr, int n, int bookId) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId){
                for (int j = i; j < n-1; j++) {
                    arr[j] = arr[j+1];
                }
                System.out.println("Đã xóa sách mã " + bookId);
                return n - 1;
            }
        }
        System.out.println("Không tìm thấy sách mã " + bookId);
        return n;
    }

    public static void printBooks(int[] arr, int n) {
        System.out.print("Kho sách hiện tại (" + n + " cuốn): [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] books = {101,102,103,104,105};
        int n = books.length, deleleId;

        do {
            printBooks(books,n);

            if (n == 0) {
                System.out.println("Kho sách đã trống!");
                break;
            }

            System.out.print("Nhập mã sách cần xóa (0 để thoát): ");
            deleleId = sc.nextInt();

            if (deleleId != 0){
                n = deleteBook(books,n,deleleId);
            }
        }while (deleleId != 0);
    }
}
