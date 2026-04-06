import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = N;

        for (int i = 1; i <= N; i++) {
            int t = i;
            int sumr = 0;

            while (t > 0) {
                int r = t % 6;
                sumr += r;
                t /= 6;
            }

            t = N - i;

            while (t > 0) {
                int r = t % 9;
                sumr += r;
                t /= 9;
            }

            res = Math.min(res, sumr);
        }

        System.out.println(Integer.toString(res));
    }
}
