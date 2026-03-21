import java.util.*;

public class Cau29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào chuỗi: ");
        String input = sc.nextLine();
        input = input.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : input.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
    }
}
