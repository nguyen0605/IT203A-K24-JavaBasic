import java.util.Scanner;
import java.util.Stack;

public class Cau40 {
    static int precedence(char c){
        if(c == '+' || c == '-') return 1;
        if (c == '/' || c == '*') return 2;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String n = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        String result = "";

        for (char c : n.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                result += c;
            }else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)){
                    result += stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()){
            result += stack.pop();
        }

        System.out.println(result);
    }
}
