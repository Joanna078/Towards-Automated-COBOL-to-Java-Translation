import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int a, b;
        boolean flag = true;
        for (int i = 0; i < inp.length() && flag; i++) {
            if (inp.charAt(i) == ' ') {
                a = Integer.parseInt(inp.substring(0, i));
                b = Integer.parseInt(inp.substring(i + 1));
                flag = false;
            }
        }
        if (a <= 9 && b <= 9) {
            System.out.println(a * b);
        } else {
            System.out.println(-1);
        }
    }
}
