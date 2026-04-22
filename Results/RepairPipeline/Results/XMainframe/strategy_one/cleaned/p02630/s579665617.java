import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        String[] arr = line.split(" ");
        int p1 = 0;
        int cnt1 = 0;
        int[][] table1 = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(table1[i], 0);
        }
        for (int i = 0; i < n; i++) {
            int idx = Integer.parseInt(arr[i]);
            table1[idx - 1][i]++;
            cnt1 += idx;
        }
        int q = Integer.parseInt(reader.readLine());
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < q; i++) {
            line = reader.readLine();
            String[] nums = line.split(" ");
            int b = Integer.parseInt(nums[0]);
            int c = Integer.parseInt(nums[1]);
            if (table1[b - 1][0] > 0) {
                cnt1 -= table1[b - 1][b - 1];
                cnt1 += table1[b - 1][c - 1];
                table1[b - 1][b - 1] = 0;
                table1[b - 1][c - 1]++;
            }
            out.append(cnt1).append("\n");
        }
        System.out.print(out);
    }
}