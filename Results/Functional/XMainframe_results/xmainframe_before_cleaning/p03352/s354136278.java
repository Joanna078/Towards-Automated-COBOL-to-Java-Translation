import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long ans = 1;
        for (long b = 2; b <= A; b++) {
            for (long p = 2; p <= A; p++) {
                long tmp = (long) Math.pow(b, p);
                if (A < tmp) break;
                ans = Math.max(ans, tmp);
            }
        }
        System.out.println(ans);
    }
}