import java.util.Scanner;
import java.util.Stack;

public class Cau36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào chuỗi input: ");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()){
            if (c == '[' || c == '{' || c == '('){
                stack.push(c);
            } else {
                if (stack.isEmpty()){
                    System.out.println("false");
                    return;
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')){
                    System.out.println("false");
                    return;
                }
            }
        }

        System.out.println(stack.isEmpty());
    }
}
