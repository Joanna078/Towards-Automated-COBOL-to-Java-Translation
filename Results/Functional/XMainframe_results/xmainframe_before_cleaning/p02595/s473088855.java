import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inp = reader.readLine().split(" ");
        int n = Integer.parseInt(inp[0]);
        int d = Integer.parseInt(inp[1]);
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            inp = reader.readLine().split(" ");
            int x = Integer.parseInt(inp[0]);
            int y = Integer.parseInt(inp[1]);
            double k = Math.sqrt(x * x + y * y);
            if (k <= d) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}