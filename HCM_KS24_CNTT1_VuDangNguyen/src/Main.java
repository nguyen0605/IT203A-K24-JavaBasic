import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] studentList = new String[100];
        int count = 0;

        int choice;

        do {
            System.out.println("\n===== MENU QUẢN LÝ MSSV =====");
            System.out.println("1. Hiển thị danh sách MSSV");
            System.out.println("2. Thêm mới MSSV");
            System.out.println("3. Cập nhật MSSV");
            System.out.println("4. Xóa MSSV");
            System.out.println("5. Tìm kiếm MSSV");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    // ===== HIỂN THỊ =====
                    if (count == 0) {
                        System.out.println("Danh sách trống!");
                    } else {
                        System.out.println("===== DANH SÁCH MSSV =====");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + studentList[i]);
                        }
                    }
                    break;

                case 2:
                    // ===== THÊM =====
                    if (count >= 100) {
                        System.out.println("Danh sách đã đầy!");
                        break;
                    }

                    String newMssv;
                    while (true) {
                        System.out.print("Nhập MSSV mới: ");
                        newMssv = scanner.nextLine();

                        if (Pattern.matches("^B\\d{7}$", newMssv)) {
                            break;
                        } else {
                            System.out.println("Sai định dạng! MSSV phải bắt đầu bằng B và có đúng 7 chữ số.");
                        }
                    }

                    studentList[count] = newMssv;
                    count++;
                    System.out.println("Thêm thành công!");
                    break;

                case 3:
                    // ===== CẬP NHẬT =====
                    if (count == 0) {
                        System.out.println("Danh sách trống!");
                        break;
                    }

                    System.out.print("Nhập vị trí cần sửa (1 - " + count + "): ");
                    int index = Integer.parseInt(scanner.nextLine());

                    if (index < 1 || index > count) {
                        System.out.println("Vị trí không hợp lệ!");
                        break;
                    }

                    String updateMssv;
                    while (true) {
                        System.out.print("Nhập MSSV mới: ");
                        updateMssv = scanner.nextLine();

                        if (Pattern.matches("^B\\d{7}$", updateMssv)) {
                            break;
                        } else {
                            System.out.println("Sai định dạng!");
                        }
                    }

                    studentList[index - 1] = updateMssv;
                    System.out.println("Cập nhật thành công!");
                    break;

                case 4:
                    // ===== XÓA =====
                    if (count == 0) {
                        System.out.println("Danh sách trống!");
                        break;
                    }

                    System.out.print("Nhập MSSV cần xóa: ");
                    String deleteMssv = scanner.nextLine();

                    int foundIndex = -1;

                    for (int i = 0; i < count; i++) {
                        if (studentList[i].equals(deleteMssv)) {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex == -1) {
                        System.out.println("Không tìm thấy MSSV!");
                    } else {
                        for (int i = foundIndex; i < count - 1; i++) {
                            studentList[i] = studentList[i + 1];
                        }

                        studentList[count - 1] = null;
                        count--;

                        System.out.println("Xóa thành công!");
                    }
                    break;

                case 5:
                    // ===== TÌM KIẾM =====
                    if (count == 0) {
                        System.out.println("Danh sách trống!");
                        break;
                    }

                    System.out.print("Nhập chuỗi cần tìm: ");
                    String keyword = scanner.nextLine().toLowerCase();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (studentList[i].toLowerCase().contains(keyword)) {
                            System.out.println((i + 1) + ". " + studentList[i]);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Không tìm thấy MSSV phù hợp!");
                    }

                    break;

                case 0:
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);

        scanner.close();
    }
}