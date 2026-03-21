import java.util.ArrayList;
import java.util.Scanner;

public class Cau7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào tên sinh viên thứ " + i + ": ");
            names.add(sc.nextLine());
        }

        String longest = names.get(0);

        for (String name: names){
            if (name.length() > longest.length()){
                longest = name;
            }
        }

        System.out.println("Longest: "+ longest);
    }
}
