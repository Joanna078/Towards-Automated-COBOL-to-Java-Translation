import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        char[] stack = new char[len];
        int top = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'B') {
                if (top > 0) {
                    top--;
                }
            } else {
                stack[top++] = s.charAt(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < top; i++) {
            sb.append(stack[i]);
        }
        System.out.println(sb.toString());
    }
}
