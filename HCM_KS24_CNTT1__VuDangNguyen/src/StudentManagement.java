import java.util.Scanner;

public class StudentManagement {

    public static int findIndexById(Student[] students, int currentCount, String id) {
        for (int i = 0; i < currentCount; i++) {
            if (students[i] != null && students[i].getStudentId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }

    public static void printMenu() {
        System.out.println("\n========== STUDENT MANAGEMENT ==========");
        System.out.println("1. Hiển thị danh sách tất cả sinh viên");
        System.out.println("2. Thêm mới sinh viên");
        System.out.println("3. Sửa thông tin sinh viên theo ID");
        System.out.println("4. Tìm kiếm sinh viên theo tên");
        System.out.println("5. Xóa sinh viên theo ID");
        System.out.println("6. Thoát");
        System.out.print("Chọn: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[100];
        int currentCount = 0;

        int choice;

        do {
            printMenu();
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    if (currentCount == 0) {
                        System.out.println("Danh sách rỗng!");
                        break;
                    }
                    System.out.println("----- DANH SÁCH SINH VIÊN -----");
                    for (int i = 0; i < currentCount; i++) {
                        students[i].displayData();
                    }
                    break;
                }

                case 2: {
                    if (currentCount >= students.length) {
                        System.out.println("Mảng đã đầy (tối đa 100). Không thể thêm!");
                        break;
                    }

                    System.out.print("Nhập mã SV: ");
                    String id = sc.nextLine();

                    if (findIndexById(students, currentCount, id) != -1) {
                        System.out.println("ID đã tồn tại. Không thể thêm!");
                        break;
                    }

                    System.out.print("Nhập tên SV: ");
                    String name = sc.nextLine();

                    System.out.print("Nhập tuổi: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nhập giới tính: ");
                    String sex = sc.nextLine();

                    System.out.print("Nhập điểm: ");
                    double mark = sc.nextDouble();
                    sc.nextLine();

                    Student st = new Student(id, name, age, sex, mark);
                    students[currentCount] = st;
                    currentCount++;

                    System.out.println("Thêm mới thành công!");
                    break;
                }

                case 3: {
                    if (currentCount == 0) {
                        System.out.println("Danh sách rỗng!");
                        break;
                    }

                    System.out.print("Nhập ID cần sửa: ");
                    String id = sc.nextLine();

                    int idx = findIndexById(students, currentCount, id);
                    if (idx == -1) {
                        System.out.println("Không tìm thấy sinh viên với ID: " + id);
                        break;
                    }

                    System.out.println("Nhập thông tin mới (không sửa ID):");
                    System.out.print("Tên mới: ");
                    String newName = sc.nextLine();

                    System.out.print("Tuổi mới: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Giới tính mới: ");
                    String newSex = sc.nextLine();

                    System.out.print("Điểm mới: ");
                    double newMark = sc.nextDouble();
                    sc.nextLine();

                    students[idx].setStudentName(newName);
                    students[idx].setAge(newAge);
                    students[idx].setSex(newSex);
                    students[idx].setMark(newMark);

                    System.out.println("Cập nhật thành công!");
                    break;
                }

                case 4: {
                    if (currentCount == 0) {
                        System.out.println("Danh sách rỗng!");
                        break;
                    }

                    System.out.print("Nhập chuỗi tên cần tìm: ");
                    String keyword = sc.nextLine().toLowerCase();

                    boolean found = false;
                    System.out.println("----- KẾT QUẢ TÌM KIẾM -----");
                    for (int i = 0; i < currentCount; i++) {
                        String name = students[i].getStudentName();
                        if (name != null && name.toLowerCase().contains(keyword)) {
                            students[i].displayData();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Không có sinh viên nào phù hợp!");
                    }
                    break;
                }

                case 5: {
                    if (currentCount == 0) {
                        System.out.println("Danh sách rỗng!");
                        break;
                    }

                    System.out.print("Nhập ID cần xóa: ");
                    String id = sc.nextLine();

                    int idx = findIndexById(students, currentCount, id);
                    if (idx == -1) {
                        System.out.println("Không tìm thấy sinh viên với ID: " + id);
                        break;
                    }

                    for (int i = idx; i < currentCount - 1; i++) {
                        students[i] = students[i + 1];
                    }
                    students[currentCount - 1] = null;
                    currentCount--;

                    System.out.println("Xóa thành công!");
                    break;
                }

                case 6: {
                    System.out.println("Thoát chương trình!");
                    break;
                }

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn 1-6!");
            }

        } while (choice != 6);

        sc.close();
    }
}