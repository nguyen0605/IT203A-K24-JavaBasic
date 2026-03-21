import java.util.*;

public class Cau48 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập câu: ");
        String input = sc.nextLine();

        if (input == null || input.trim().isEmpty()) {
            System.out.println("Lỗi: không nhập nội dung");
            return;
        }

        // Chuẩn hóa chuỗi
        input = input.trim().toLowerCase();

        String[] words = input.split("\\s+");

        Map<String, Integer> map = new HashMap<>();

        // a. Đếm tần suất
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println("Tần suất từng từ:");
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        // b. Tìm từ xuất hiện nhiều nhất
        int max = 0;
        for (int value : map.values()) {
            if (value > max) {
                max = value;
            }
        }

        System.out.println("Từ xuất hiện nhiều nhất (" + max + " lần):");
        for (String key : map.keySet()) {
            if (map.get(key) == max) {
                System.out.println(key);
            }
        }

        // c. Sắp xếp alphabet
        List<String> list = new ArrayList<>(map.keySet());

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    String temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        System.out.println("Danh sách theo alphabet:");
        for (String word : list) {
            System.out.println(word + " : " + map.get(word));
        }
    }
}