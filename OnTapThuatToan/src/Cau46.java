import java.util.*;

public class Cau46 {
    public static void main(String[] args) {
        String input = "a41b2c1d3e20";

        Map<Character, Integer> map = new HashMap<>();

        for (char c : input.toCharArray()){
            if (Character.isDigit(c)){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        int min = Integer.MAX_VALUE;

        for (int count : map.values()){
            if (count < min){
                min = count;
            }
        }

        List<Character> list = new ArrayList<>();
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if (entry.getValue() == min){
                list.add(entry.getKey());
            }
        }

        System.out.print("Chữ số xuất hiện ít nhất là: ");
        for (char c : list){
            System.out.print(c + " ");
        }

        Collections.sort(list);
        for (char c : list){
            System.out.print(c + " ");
        }
    }
}
