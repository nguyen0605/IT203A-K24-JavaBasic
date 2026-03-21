import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cau42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào 1 chuỗi bất kỳ: ");
        String s = sc.nextLine();

        if (s == null || s.trim().isEmpty()){
            System.out.println("Lỗi: Không nhập nội dung");
            return;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            char key = entry.getKey();

            if (key == ' '){
                System.out.println(key + " : " + entry.getValue() + " (khoảng trắng)");
            }else {
                System.out.println(key + " : " + entry.getValue());
            }
        }
    }
}
