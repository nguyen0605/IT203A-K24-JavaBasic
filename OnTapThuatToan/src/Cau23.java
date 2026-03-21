import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cau23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào chuỗi: ");
        String input = sc.nextLine();
        String[] words = input.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
    }
}
