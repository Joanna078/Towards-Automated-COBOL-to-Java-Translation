import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int a = 0, b = 0;
        boolean flag = true;
        int temp1 = 0, temp2 = 0;
        for (int i = 0; i < inp.length() && flag; i++) {
            if (inp.charAt(i) == ' ') {
                temp1 = i;
                flag = false;
            }
        }
        a = Integer.parseInt(inp.substring(0, temp1));
        b = Integer.parseInt(inp.substring(temp1 + 1));
        if (a <= 9 && b <= 9) {
            System.out.println(a * b);
        } else {
            System.out.println(-1);
        }
    }
}