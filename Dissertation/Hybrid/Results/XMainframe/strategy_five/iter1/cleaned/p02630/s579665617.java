import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        int p1 = 0;
        int cnt1 = 0;
        int[] table1 = new int[100000];
        for (int i = 0; i < n; i++) {
            int p2 = line.indexOf(' ', p1);
            if (p2 == -1) {
                p2 = line.length();
            }
            int idx = Integer.parseInt(line.substring(p1, p2));
            table1[idx]++;
            cnt1 += idx;
            p1 = p2 + 1;
        }
        int q = Integer.parseInt(reader.readLine());
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < q; i++) {
            line = reader.readLine();
            String[] nums = line.split(" ");
            int b = Integer.parseInt(nums[0]);
            int c = Integer.parseInt(nums[1]);
            if (table1[b] > 0) {
                cnt1 -= table1[b] * b;
                cnt1 += table1[b] * c;
                table1[c] += table1[b];
                table1[b] = 0;
            }
            out.append(cnt1).append("\n");
        }
        System.out.print(out);
    }
}