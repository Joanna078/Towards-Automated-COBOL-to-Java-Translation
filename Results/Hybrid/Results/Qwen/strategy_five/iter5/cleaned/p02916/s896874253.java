import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        String ln = scanner.nextLine();
        int maxlen = n;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        int ans = 0;
        int zs = 0;
        int[] A = new int[100];
        int[] B = new int[100];
        int[] C = new int[100];

        // First loop
        while (cur <= ln.length() && i <= maxlen) {
            j = cur;
            while (j <= ln.length() && ln.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            if (len > 0) {
                A[i] = Integer.parseInt(ln.substring(cur - 1, j).trim());
            }
            cur = j + 1;
            i++;
        }

        // Second loop
        cur = 1;
        i = 1;
        while (cur <= ln.length() && i <= maxlen) {
            j = cur;
            while (j <= ln.length() && ln.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            if (len > 0) {
                B[i] = Integer.parseInt(ln.substring(cur - 1, j).trim());
                ans += B[i];
            }
            cur = j + 1;
            i++;
        }

        // Third loop
        cur = 1;
        i = 1;
        int num = n - 1;
        while (cur <= ln.length() && i <= num) {
            j = cur;
            while (j <= ln.length() && ln.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            if (len > 0) {
                C[i] = Integer.parseInt(ln.substring(cur - 1, j).trim());
            }
            cur = j + 1;
            i++;
        }

        // Fourth loop
        for (i = 2; i <= n; i++) {
            if (A[i - 1] + 1 == A[i]) {
                ans += C[A[i - 1]];
            }
        }

        zs = ans;
        System.out.println(String.format("%d", zs));
    }
}