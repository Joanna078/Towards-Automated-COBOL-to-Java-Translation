import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long tmp = 1;
        final long INF = 1000000007L;

        for (int i = 1; i <= N; i++) {
            tmp = (tmp * i) % INF;
        }

        String ZS = String.format("%d", tmp);
        String ans = "";

        for (char c : ZS.toCharArray()) {
            if (c != ' ') {
                ans += c;
            }
        }

        System.out.println(ans);
    }
}