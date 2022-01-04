import java.util.Scanner;
import java.util.Stack;

public class StackNumbers {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Scanner num = new Scanner(System.in);
        int number, m, l, p;
        number = num.nextInt();
        while (number > 0) {
            stack.push(number % 10);
            number = number / 10;
        }
        m = 0;
        p = 1;
        while (!stack.empty()) {
            l = stack.pop();
            m = m + l * p;
            p = p * 10;
        }
        System.out.println(m);
    }
}
