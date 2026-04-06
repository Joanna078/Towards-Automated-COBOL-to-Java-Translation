import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        int[] a = new int[200000];
        int[] sa = new int[200000];
        int p1 = 0;
        int p2 = 0;

        for (int i = 0; i < n; i++) {
            while (p2 < line.length() && line.charAt(p2) != ' ') {
                p2++;
            }
            a[i] = Integer.parseInt(line.substring(p1, p2));
            if (i > a[i]) {
                sa[i - a[i]]++;
            }
            p1 = p2 + 1;
        }

        long cnt = 0;
        for (int i = 0; i < n - 2; i++) {
            if (i + a[i] <= n - 1) {
                cnt += sa[i + a[i]];
            }
        }

        System.out.println(cnt);
    }
}