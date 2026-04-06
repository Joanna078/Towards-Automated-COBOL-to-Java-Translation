import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(line);
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        int[][] towns = new int[n][n];
        for (int i = 0; i < m; i++) {
            line = reader.readLine();
            tokenizer = new StringTokenizer(line);
            int a = Integer.parseInt(tokenizer.nextToken()) - 1;
            int b = Integer.parseInt(tokenizer.nextToken()) - 1;
            towns[a][b] = 1;
            towns[b][a] = 1;
        }
        int[] counts = new int[n];
        Arrays.fill(counts, 0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (towns[i][j] == 1) {
                    counts[i]++;
                }
            }
        }
        for (int count : counts) {
            System.out.println(count);
        }
    }
}