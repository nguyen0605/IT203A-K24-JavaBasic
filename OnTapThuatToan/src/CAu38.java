import java.util.Scanner;
import java.util.Stack;

public class CAu38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()){
            if (stack.isEmpty() || stack.peek() != c){
                stack.push(c);
            }
        }

        String result = "";
        for (char c : stack){
            result+=c;
        }
        System.out.println(result);
    }
}
