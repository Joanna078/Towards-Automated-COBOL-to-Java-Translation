import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int c1 = 0;
        int c2 = 0;
        int f = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (f == 1) {
                    c1++;
                } else {
                    c2++;
                }
            }
            f = 3 - f;
        }
        int h = (s.length() - 1) / 2;
        int a = Math.abs(h - c1);
        int k1 = h + a - c1 + c2;
        int k2 = h - c2 + c1;
        System.out.println(Math.min(k1, k2));
    }
}