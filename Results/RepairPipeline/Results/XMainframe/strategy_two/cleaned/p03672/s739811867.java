import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        int l = len - 1;
        boolean flag = true;
        for (int i = l; i >= 1; i--) {
            if (i % 2 == 0) {
                continue;
            } else {
                int k = i / 2;
                int ini = k + 1;
                String left = s.substring(1, ini);
                String right = s.substring(ini, ini + k);
                if (!left.equals(right)) {
                    flag = false;
                    break;
                }
            }
        }
        System.out.println(flag ? "Yes" : "No");
    }
}