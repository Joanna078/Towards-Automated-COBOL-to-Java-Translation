import java.util.Arrays;
import java.util.Scanner;

public class ABC_052_B {
    public static void main(String[] args) {
        // Input variables
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char[] s1 = scanner.nextLine().toCharArray();

        // Working storage
        int mx = 0;
        int tmp = 0;
        char[] ans = new char[18];
        int zs = 0; // Changed to int to store the numeric value
        char dummy = ' ';

        // Logic
        for (int i = 0; i < n; i++) {
            if (s1[i] == 'I') {
                tmp++;
            } else {
                tmp--;
            }
            mx = Math.max(mx, tmp);
        }

        zs = mx; // Assign the maximum value to zs

        unans(zs, dummy, ans);

        System.out.println(new String(ans).trim());
        scanner.close();
    }

    private static void unans(int zs, char dummy, char[] ans) {
        StringBuilder sb = new StringBuilder();
        sb.append(zs);
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == dummy) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.reverse();
        System.arraycopy(sb.toString().toCharArray(), 0, ans, 0, sb.length());
    }
}