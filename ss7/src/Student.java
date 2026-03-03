public class Student  {
    public String studentId;
    public String studentName;

    private static int totalStudent = 0;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        totalStudent++;
    }

    public void displayInfo(){
        System.out.println("Mã SV: " + studentId);
        System.out.println("Tên SV: " + studentName);
        System.out.println("-----------------------");
    }

    public static void displayTotalStudent() {
        System.out.println("Tổng số sinh viên đã tạo: " + totalStudent);
    }

    public static void main(String[] args) {

        Student s1 = new Student("SV01", "Nguyen Van A");
        Student s2 = new Student("SV02", "Tran Thi B");
        Student s3 = new Student("SV03", "Le Van C");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        Student.displayTotalStudent(); // gọi bằng tên class
    }
}
