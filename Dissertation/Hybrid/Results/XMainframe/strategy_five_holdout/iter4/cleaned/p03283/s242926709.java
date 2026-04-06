import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = reader.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int q = Integer.parseInt(arr[2]);

        int[][] train = new int[501][501];

        for (int i = 0; i < m; i++) {
            arr = reader.readLine().split(" ");
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);

            if (1 == x) {
                train[y][y] += 1;
            } else {
                train[y][y] += 1;
                train[y][x - 1] -= 1;
                train[y - 1][x] -= 1;
                train[y - 1][x - 1] += 1;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                train[i][j] += train[i][j - 1] + train[i - 1][j] - train[i - 1][j - 1];
            }
        }

        for (int i = 0; i < q; i++) {
            arr = reader.readLine().split(" ");
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);

            int result = train[y][x];
            System.out.printf("%03d%n", result);
        }
    }
}