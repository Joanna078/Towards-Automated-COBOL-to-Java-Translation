import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[100]; // Adjusted size to match COBOL's A11 OCCURS 100
        Arrays.fill(A, 1);
        for (int i = 0; i < K; i++) {
            int maxlen = sc.nextInt();
            String ln = sc.nextLine(); // Use nextLine to read the entire line
            int cur = 0;
            for (int j = 0; j < maxlen; j++) {
                if (cur >= ln.length()) break; // Check for end of string
                if (ln.charAt(cur) == ' ') {
                    cur++;
                    continue;
                }
                int len = 0;
                while (cur + len < ln.length() && ln.charAt(cur + len) != ' ') {
                    len++;
                }
                int idx = Integer.parseInt(ln.substring(cur, cur + len));
                if (idx > 0 && idx <= N) { // Ensure idx is within valid range
                    A[idx - 1] = 0;
                }
                cur += len + 1; // Move past the space
            }
        }
        int ans = 0;
        for (int num : A) ans += num;
        System.out.println(ans);
    }
}