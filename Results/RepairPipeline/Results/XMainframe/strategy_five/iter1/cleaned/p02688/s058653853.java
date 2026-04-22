import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[100]; // Adjusted size to match COBOL array size
        Arrays.fill(A, 1);
        sc.nextLine(); // Consume newline after nextInt()
        for (int i = 0; i < K; i++) {
            int maxlen = sc.nextInt();
            sc.nextLine(); // Consume newline after nextInt()
            String ln = sc.nextLine();
            int cur = 0;
            for (int j = 0; j < maxlen; j++) {
                if (ln.charAt(j) == ' ') {
                    cur = j + 1;
                    continue;
                }
                int len = 1;
                while (j + len < ln.length() && ln.charAt(j + len) != ' ') {
                    len++;
                }
                int idx = Integer.parseInt(ln.substring(cur, cur + len));
                if (idx >= 1 && idx <= N) { // Check index bounds
                    A[idx - 1] = 0;
                }
                cur = j + len;
            }
        }
        int ans = 0;
        for (int num : A) ans += num;
        System.out.println(ans);
    }
}