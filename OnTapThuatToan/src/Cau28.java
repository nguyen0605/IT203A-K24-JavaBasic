import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Cau28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào chuỗi input: ");
        String input = sc.nextLine();

        Map<Character, Integer> map = new TreeMap<>();

        for (char c : input.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
