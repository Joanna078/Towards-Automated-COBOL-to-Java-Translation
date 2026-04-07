import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }
        Arrays.sort(h);
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (K <= h[i]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
