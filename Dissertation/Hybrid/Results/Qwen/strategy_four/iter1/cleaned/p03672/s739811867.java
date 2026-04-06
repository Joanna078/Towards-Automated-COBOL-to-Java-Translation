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

                if (len2 <= s.length() && ini + len2 <= s.length()) {
                    if (!s.substring(0, len2).equals(s.substring(ini, ini + len2))) {
                        flg = '0';
                    }
                } else {
                    flg = '0';
                }
            }

            if (flg == '1') {
                break;
            }
        }

        zs[0] = (char) ('0' + i);

        unans(zs, ans);

        System.out.println(new String(ans, 0, new String(ans).length()));
    }

    private static void unans(char[] zs, char[] ans) {
        StringBuilder sb = new StringBuilder();
        for (char c : zs) {
            if (c != ' ') {
                sb.append(c);
            }
        }
        System.arraycopy(sb.toString().toCharArray(), 0, ans, 0, Math.min(sb.length(), ans.length));
    }
}