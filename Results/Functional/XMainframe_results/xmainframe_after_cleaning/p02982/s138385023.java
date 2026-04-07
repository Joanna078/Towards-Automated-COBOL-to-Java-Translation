import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer;
        int N, D;
        tokenizer = new StringTokenizer(reader.readLine());
        N = Integer.parseInt(tokenizer.nextToken());
        D = Integer.parseInt(tokenizer.nextToken());
        int[][] X = new int[N][D];
        for (int i = 0; i < N; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < D; j++) {
                X[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                double pre = 0;
                for (int k = 0; k < D; k++) {
                    pre += Math.pow(X[j][k] - X[i][k], 2);
                }
                double nxt = Math.sqrt(pre);
                if (Math.abs(nxt - Math.floor(nxt)) < 1e-10) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
