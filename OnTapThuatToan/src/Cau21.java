import java.util.*;

public class Cau21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào chuỗi input: ");
        String input = sc.nextLine();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : input.toCharArray()){
            if (c > '0' && c < '9'){
                map.put(c, map.getOrDefault(c,0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
    }
}
