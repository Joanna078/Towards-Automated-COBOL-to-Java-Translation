import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int h = n / 2;
        String line = br.readLine();
        int[][] tbl1 = new int[100000][2];
        int[][] tbl2 = new int[100000][2];
        for (int i = 0; i < 100000; i++) {
            tbl1[i][0] = 0;
            tbl2[i][0] = 0;
        }
        int cnt = 0;
        int p1 = 0;
        int ix = 1;
        for (int i = 1; i <= n; i++) {
            p2 = line.indexOf(' ', p1);
            if (p2 == -1) {
                p2 = line.length();
            }
            if (p2 - p1 > 0) {
                int v = Integer.parseInt(line.substring(p1, p2));
                if (ix == 1) {
                    if (tbl1[v][0] == 0) {
                        tbl1[v][0] = 1;
                        tbl1[v][1] = v;
                    }
                } else {
                    if (tbl2[v][0] == 0) {
                        tbl2[v][0] = 1;
                        tbl2[v][1] = v;
                    }
                }
            }
            ix = 3 - ix;
            p1 = p2 + 1;
        }
        Arrays.sort(tbl1, (a, b) -> b[0] - a[0]);
        Arrays.sort(tbl2, (a, b) -> b[0] - a[0]);
        if (tbl1[0][1] == tbl2[0][1]) {
            if (tbl1[0][0] + tbl2[1][0] >= tbl1[1][0] + tbl2[0][0]) {
                cnt = n - tbl1[0][0] - tbl2[1][0];
            } else {
                cnt = n - tbl1[1][0] - tbl2[0][0];
            }
        } else {
            cnt = n - tbl1[0][0] - tbl2[0][0];
        }
        System.out.println(cnt);
    }
}