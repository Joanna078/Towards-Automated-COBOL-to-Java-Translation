import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String inp = reader.readLine();

        int[] tbl1 = new int[101];
        int[] tbl2 = new int[100];
        int[] k2 = new int[100];
        int p1 = 0;
        int lC = 0;
        long cnt = 0;

        int p2 = 0;
        for (int i = 0; i < n; i++) {
            p2 = p1;
            while (p2 < inp.length() && inp.charAt(p2) != ' ') {
                p2++;
            }
            tbl1[i] = Integer.parseInt(inp.substring(p1, p2));
            p1 = p2 + 1;
        }

        Arrays.sort(tbl1);

        tbl2[lC] = tbl1[0];
        k2[lC] = 1;
        lC++;
        for (int i = 1; i < n; i++) {
            if (tbl1[i] != tbl1[i - 1]) {
                tbl2[lC] = tbl1[i];
                k2[lC] = 1;
                lC++;
            } else {
                k2[lC - 1]++;
            }
        }

        for (int i = 0; i < lC; i++) {
            for (int j = i + 1; j < lC; j++) {
                for (int k = j + 1; k < lC; k++) {
                    if (tbl2[i] + tbl2[j] > tbl2[k] &&
                        tbl2[j] + tbl2[k] > tbl2[i] &&
                        tbl2[k] + tbl2[i] > tbl2[j]) {
                        cnt += (long) k2[i] * k2[j] * k2[k];
                    }
                }
            }
        }

        System.out.println(String.format("%05d", cnt));
    }
}