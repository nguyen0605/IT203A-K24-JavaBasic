import java.util.*;

public class Cau27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào chuỗi: ");
        String input = sc.nextLine();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : input.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a,b) -> b.getValue() - a.getValue());

        for (int i = 0; i < 3; i++) {
            System.out.print(list.get(i).getKey() + " ");
        }
    }
}
