import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Cau17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào chuỗi input: ");
        String input = sc.nextLine();

        Map<Character, Integer> map = new TreeMap<>();

        for (char c : input.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        char mostFrequent = ' ';
        int max = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() > max){
                max = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("Most frequent: " + mostFrequent);
    }
}
