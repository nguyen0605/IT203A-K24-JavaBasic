import java.util.Scanner;

public class btkha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách: ");
        String bookID = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        String bookName = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        int publishYear = sc.nextInt();

        System.out.print("Nhập giá bìa: ");
        double price = sc.nextDouble();

        System.out.print("Sách còn hay không (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        int bookAge = 2026 - publishYear;
        String status = isAvailable ? "Còn sách" : "Đã mượn";

        String bookNameUpper = bookName.toUpperCase();

        System.out.println("=== Thông tin sách ===");
        System.out.println("Tên sách: " + bookNameUpper);
        System.out.println("Mã số: " + bookID + " | Tuổi thọ: " + bookAge);
        System.out.printf("Giá bán: %.2f\n", price," VND");
        System.out.println("Tình trạng: " + status);
    }
}