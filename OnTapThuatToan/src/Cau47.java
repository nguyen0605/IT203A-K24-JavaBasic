import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cau47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("NHập số lượng điểm: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Integer> points = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập điểm thứ " + (i+1) + ": ");
            points.add(sc.nextInt());
        }

        int min = points.get(0);
        for (int i = 1; i < points.size(); i++) {
            if (points.get(i) < min){
                min = points.get(i);
            }
        }
        System.out.println("Điểm nhỏ nhất: " + min);

        for (int i = 0; i < points.size() - 1; i++) {
            for (int j = 0; j < points.size() - 1 -i; j++) {
                if (points.get(j) < points.get(j+1)){
                    int temp = points.get(j);
                    points.set(j, points.get(j+1));
                    points.set(j+1, temp);
                }
            }
        }

        System.out.println("Danh sách giảm dần: " + points);
    }
}
