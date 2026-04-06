import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        long[] x = new long[n];
        arr = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            x[i] = Long.parseLong(arr[i]);
        }
        long mn = Long.MAX_VALUE;
        long cnt = 0;
        for (int i = 0; i < n - k + 1; i++) {
            if (x[i] < 0) {
                cnt -= x[i];
            } else {
                cnt += x[i];
            }
            if (x[i + k - 1] < 0) {
                cnt -= x[i + k - 1];
            } else {
                cnt += x[i + k - 1];
            }
            if (cnt < mn) {
                mn = cnt;
            }
        }
        System.out.println(mn);
    }
}
