import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int[] h = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] hm = new int[n + 1];
        Arrays.fill(hm, Integer.MAX_VALUE);
        for (int i = 0; i < m; i++) {
            arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            hm[a] = Math.min(hm[a], h[b - 1]);
            hm[b] = Math.min(hm[b], h[a - 1]);
        }
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (h[i - 1] > hm[i]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
