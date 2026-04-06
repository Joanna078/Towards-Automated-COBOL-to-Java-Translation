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
        int[][] ab = new int[m][2];
        for (int i = 0; i < m; i++) {
            line = reader.readLine();
            tokenizer = new StringTokenizer(line);
            ab[i][0] = Integer.parseInt(tokenizer.nextToken());
            ab[i][1] = Integer.parseInt(tokenizer.nextToken());
        }
        Arrays.sort(ab, (a, b) -> Integer.compare(b[1], a[1]));
        int done = 0;
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (done < ab[i][0]) {
                count++;
                done = ab[i][1] - 1;
            }
        }
        System.out.println(count);
    }
}