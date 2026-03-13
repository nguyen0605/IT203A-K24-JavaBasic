import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class btkha2 {
    public static void main(String[] args) {
        Map<String, String> drugMap = new HashMap<>();

        drugMap.put("T01", "Paracetamol");
        drugMap.put("T02", "Ibuprofen");
        drugMap.put("T03", "Aspirin");
        drugMap.put("T04", "Amoxicillin");
        drugMap.put("T05", "Vitamin C");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thuốc: ");
        String code = sc.nextLine();

        if (drugMap.containsKey(code)){
            System.out.println("Tên thuốc: " + drugMap.get(code));
        } else {
            System.out.println("Thuốc không có trong danh mục BHYT");
        }
    }
}
