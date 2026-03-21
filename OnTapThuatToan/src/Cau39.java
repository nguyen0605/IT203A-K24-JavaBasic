import java.util.Scanner;
import java.util.Stack;

public class Cau39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số: ");
        String n = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char c : n.toCharArray()){
            stack.push(c);
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
