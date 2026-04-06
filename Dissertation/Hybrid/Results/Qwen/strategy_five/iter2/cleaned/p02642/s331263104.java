import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        scanner.close();

        // Initialize arrays
        int[] tbl1 = new int[n];
        int[][] tbl2 = new int[200001][2];
        int cnt = 0;
        int out = 0;

        // Process input
        int p1 = 0;
        for (int i = 0; i < n; i++) {
            int p2 = p1;
            while (p2 < input.length() && input.charAt(p2) != ' ') {
                p2++;
            }
            int idx = Integer.parseInt(input.substring(p1, p2));
            tbl1[i] = idx;
            tbl2[idx][0]++;
            p1 = p2 + 1;
        }

        // Sort tbl1
        Arrays.sort(tbl1);

        // Mark multiples
        for (int i = 0; i < n; i++) {
            if (tbl2[tbl1[i]][1] == 0) {
                if (tbl2[tbl1[i]][0] > 1) {
                    tbl2[tbl1[i]][1] = 1;
                }
                for (int j = 2; j <= 200000 / tbl1[i]; j++) {
                    if (tbl1[i] * j <= 200000) {
                        tbl2[tbl1[i] * j][1] = 1;
                    }
                }
            }
        }

        // Count unique numbers
        for (int i = 0; i < n; i++) {
            if (tbl2[tbl1[i]][1] == 0) {
                cnt++;
            }
        }

        // Output result
        out = cnt;
        System.out.println(out);
    }
}