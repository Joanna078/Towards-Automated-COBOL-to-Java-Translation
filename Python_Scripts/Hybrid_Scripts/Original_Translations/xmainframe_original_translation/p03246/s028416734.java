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
        int[] tbl1 = new int[100000];
        int[] tbl2 = new int[100000];
        Arrays.fill(tbl1, 0);
        Arrays.fill(tbl2, 0);
        int cnt = 0;
        int p1 = 1;
        int p2 = 0;
        while (p1 < line.length()) {
            p2 = line.indexOf(' ', p1);
            if (p2 == -1) {
                p2 = line.length();
            }
            int v = Integer.parseInt(line.substring(p1, p2));
            if (tbl1[v] == 0) {
                tbl1[v] = 1;
            } else if (tbl2[v] == 0) {
                tbl2[v] = 1;
            } else {
                break;
            }
            if (p1 < h) {
                p1 = p2 + 1;
            } else {
                p1 = p2 + 2;
            }
        }
        if (p2 - p1 == 0) {
            cnt = n - tbl1[0] - tbl2[0];
        } else if (tbl1[0] + tbl2[1] >= tbl1[1] + tbl2[0]) {
            cnt = n - tbl1[0] - tbl2[1];
        } else {
            cnt = n - tbl1[1] - tbl2[0];
        }
        System.out.println(cnt);
    }
}
