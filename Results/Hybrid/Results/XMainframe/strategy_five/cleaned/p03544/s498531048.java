import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long lucas = lucasNumber(N);
        String ans = formatLucas(lucas);
        System.out.println(ans);
    }

    static long lucasNumber(int n) {
        if (n == 1) {
            return 1;
        }
        long ppr = 2;
        long pr = 1;
        long lucas = 0;
        for (int i = 2; i <= n; i++) {
            lucas = ppr + pr;
            ppr = pr;
            pr = lucas;
        }
        return lucas;
    }

    static String formatLucas(long lucas) {
        return String.format("%018d", lucas).replaceFirst("^0+(?!$)", "");
    }
}