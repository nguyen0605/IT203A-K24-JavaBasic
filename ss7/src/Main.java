

public class Main {
    public static void main(String[] args) {

        // ===== 1) PRIMITIVE (int) =====
        int a = 10;
        int b = a;          // copy GIÁ TRỊ
        b = 99;             // đổi b không ảnh hưởng a

        System.out.println("=== PRIMITIVE ===");
        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 99

        // ===== 2) REFERENCE (Student object) =====
        Student s1 = new Student("SV03", "An");
        Student s2 = s1;     // copy ĐỊA CHỈ (cùng trỏ 1 object)

        s2.studentName = "Binh";    // đổi qua s2 -> s1 cũng thấy đổi

        System.out.println("\n=== REFERENCE ===");
        System.out.println("s1.name = " + s1.studentName); // Binh
        System.out.println("s2.name = " + s2.studentName); // Binh

        // (tuỳ chọn) in "địa chỉ tham chiếu" dạng hash để dễ hình dung
        System.out.println("s1 ref = " + System.identityHashCode(s1));
        System.out.println("s2 ref = " + System.identityHashCode(s2));
    }
}