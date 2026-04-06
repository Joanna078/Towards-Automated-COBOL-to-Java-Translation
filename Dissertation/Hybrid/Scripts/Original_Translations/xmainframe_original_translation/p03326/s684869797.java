import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[][] arr = new long[n][3];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(reader.readLine());
            arr[i][0] = Long.parseLong(st.nextToken());
            arr[i][1] = Long.parseLong(st.nextToken());
            arr[i][2] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr, (a, b) -> Long.compare(-a[0] - a[1] - a[2], -b[0] - b[1] - b[2]));

        long maxCake = 0;
        long[] cakes = new long[8];
        for (int i = 0; i < m; i++) {
            cakes[0] += -arr[i][0] - arr[i][1] - arr[i][2];
            cakes[1] += -arr[i][0] - arr[i][1] + arr[i][2];
            cakes[2] += -arr[i][0] + arr[i][1] - arr[i][2];
            cakes[3] += arr[i][0] - arr[i][1] - arr[i][2];
            cakes[4] += -arr[i][0] + arr[i][1] + arr[i][2];
            cakes[5] += arr[i][0] - arr[i][1] + arr[i][2];
            cakes[6] += arr[i][0] + arr[i][1] - arr[i][2];
            cakes[7] += arr[i][0] + arr[i][1] + arr[i][2];
        }

        for (long cake : cakes) {
            if (maxCake < cake) {
                maxCake = cake;
            }
        }

        System.out.println(maxCake);
    }
}
