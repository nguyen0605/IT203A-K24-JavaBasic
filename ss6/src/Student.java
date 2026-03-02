public class Student {
    String studentId;
    String fullName;
    int year;
    double avgPoint;

    public Student(String fullName, String studentId, double avgPoint, int year) {
        this.fullName = fullName;
        this.studentId = studentId;
        this.avgPoint = avgPoint;
        this.year = year;
    }

    public void displayInfo(){
        System.out.println("Mã SV: " + studentId);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Năm sinh: " + year);
        System.out.println("Điểm TB: " + avgPoint);
    }

    public static void main(String[] args) {
        Student sv1 = new Student("Nguyen Van A", "SV001", 8.5, 2006);
        Student sv2 = new Student("Trần Thị B", "SV002",7.3, 2006);

        sv1.displayInfo();
        sv2.displayInfo();
    }
}
