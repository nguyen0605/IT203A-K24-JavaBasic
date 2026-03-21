import java.util.*;

public class Cau44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Integer> array = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập giá trị arr["+i+"]: ");
            array.add(Integer.valueOf(sc.nextLine()));
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer num : array){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > 1){
                System.out.println(entry.getKey());
            }
        }
    }
}
