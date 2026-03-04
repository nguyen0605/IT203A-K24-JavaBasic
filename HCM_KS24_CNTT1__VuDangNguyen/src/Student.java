public class Student {
    private String studentId;
    private String studentName;
    private int age;
    private String sex;
    private double mark;

    public Student() {
    }

    public Student(String studentId, String studentName, int age, String sex, double mark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.mark = mark;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void displayData() {
        System.out.printf("ID: %s | Name: %s | Age: %d | Sex: %s | Mark: %.2f%n",
                studentId, studentName, age, sex, mark);
    }
}