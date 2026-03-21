import java.util.Scanner;
import java.util.Stack;

public class Cau33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào 1 số nguyên dương: ");
        int input = sc.nextInt();

        Stack<Character> stack = new Stack<>();
        char[] map = {0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F'};

        while (input > 0){
            stack.push(map[input%16]);
            input /= 16;
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
