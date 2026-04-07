import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        Arrays.fill(A, 1);
        for (int i = 0; i < K; i++) {
            int maxlen = sc.nextInt();
            String ln = sc.next();
            for (int j = 0; j < maxlen; j++) {
                if (ln.charAt(j) == ' ') continue;
                int idx = Integer.parseInt(ln.substring(j, j + 1));
                A[idx - 1] = 0;
            }
        }
        int ans = 0;
        for (int num : A) ans += num;
        System.out.println(ans);
    }
}
