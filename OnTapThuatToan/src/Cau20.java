import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cau20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào arr["+i+"]: ");
            numbers.add(sc.nextInt());
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer num : numbers){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int mostFrequent = 0, count = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > count){
                count = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("Most frequent: " + mostFrequent);
    }
}
