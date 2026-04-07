import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] parts = line.split(" ");
        int n = Integer.parseInt(parts[0]);
        int x = Integer.parseInt(parts[1]);
        int y = Integer.parseInt(parts[2]);
        int sa = y - x;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            if (i == 1) {
                cnt = n;
            } else if (i == n - 1) {
                cnt = 0;
            } else {
                cnt = n - i;
            }
            int j = x - i + 1;
            int k = x + i - 1;
            if (j < 1) {
                j = 1;
            }
            if (k >= y) {
                k = y - 1;
            }
            for (int l = j; l <= k; l++) {
                int j1 = y;
                int j2 = y;
                for (int m = 0; m < i; m++) {
                    if (l + m == x || l - m == x) {
                        j1 = y;
                        j2 = y;
                    } else if (l + m < x) {
                        j1++;
                    } else {
                        j2--;
                    }
                }
                if (j1 == j2) {
                    if (l + i < j1) {
                        cnt++;
                    }
                } else {
                    if (l + i < j1 && l + i <= y && j1 <= n) {
                        cnt++;
                    } else if (l + i < j1 && l + i > y && l + i <= n && j1 > n) {
                        cnt--;
                    }
                    if (l + i < j2) {
                        cnt++;
                    } else if (l + i > j2 && l + i <= y) {
                        cnt--;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}