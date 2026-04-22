import java.util.Scanner;

public class ABC_066_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int len = s.length() - 1;
        int i, j, k, l, ini, len2;
        char flg = '1';
        char[] ans = new char[3];
        char[] zs = new char[4];

        for (i = len; i >= 1; i--) {
            flg = '1';

            if (i % 2 == 1) {
                flg = '0';
            } else {
                k = i;
                k /= 2;
                ini = k;
                len2 = ini;
                ini++;

                if (len2 > 0 && ini <= s.length()) { // Check bounds before substring
                    if (!s.substring(0, len2).equals(s.substring(ini - 1, ini + len2 - 1))) {
                        flg = '0';
                    }
                }
            }

            if (flg == '1') {
                break;
            }
        }

        if (i >= 0) { // Ensure i is non-negative before converting to char
            zs[0] = Character.forDigit(i, 10);
        }

        unans(zs, ans);

        String ansStr = new String(ans);
        int ansLength = ansStr.indexOf('\0'); // Find the first null character
        if (ansLength == -1) {
            ansLength = ansStr.length();
        }
        System.out.println(ansStr.substring(0, ansLength));
    }

    private static void unans(char[] zs, char[] ans) {
        StringBuilder sb = new StringBuilder();
        for (char c : zs) {
            if (c != ' ') {
                sb.append(c);
            }
        }
        sb.getChars(0, Math.min(sb.length(), ans.length), ans, 0);
    }
}