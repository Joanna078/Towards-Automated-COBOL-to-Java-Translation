import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] tbl = new int[100002];
        int i;
        int l = 0; // Corrected to start from index 0
        int s;
        int a;
        int out;

        // Initialize array with values from 1 to 9
        for (i = 1; i <= 9; i++) {
            tbl[i] = i;
        }

        // Process the array as per the original logic
        for (i = 1; i <= n && l < n; i++) {
            s = tbl[i] / 10;
            a = tbl[i] % 10;
            if (a > 0) {
                l++;
                tbl[l] = tbl[i] * 10 + a - 1;
            }
            l++;
            tbl[l] = tbl[i] * 10 + a;
            if (a < 9) {
                l++;
                tbl[l] = tbl[i] * 10 + a + 1;
            }
        }

        // Output the result
        out = tbl[n];
        System.out.println(out);
    }
}