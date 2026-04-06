import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long lucas = lucasNumber(N);
        String ans = String.format("%018d", lucas).replace(' ', '0');
        System.out.println(ans.substring(ans.length() - 18));
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
}