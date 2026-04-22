import java.util.Scanner;

public class AGC_025_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxSm = 99;
        int n = scanner.nextInt();
        int half = n / 2;
        int sm = maxSm;
        int a, b, asm, bsm, r;
        String ans = "";
        String zs = "";

        for (int i = 1; i <= half; i++) {
            a = i;
            b = n - i;
            asm = 0;
            bsm = 0;
            while (a > 0) {
                r = a % 10;
                asm += r;
                a /= 10;
            }
            while (b > 0) {
                r = b % 10;
                bsm += r;
                b /= 10;
            }
            bsm += asm;
            if (bsm < sm) {
                sm = bsm;
            }
        }

        zs = String.format("%03d", sm);

        ans = unans(zs);

        System.out.println(ans.substring(0, ans.length()));
    }

    private static String unans(String zs) {
        StringBuilder sb = new StringBuilder();
        for (char c : zs.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}