import java.util.Scanner;
import java.util.Stack;

public class Cau31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào 1 số nguyên dương: ");
        int input = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        while (input > 0){
            stack.push(input % 2);
            input /= 2;
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
