import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String input = reader.readLine();
        int p1 = 0;
        int sw_k = 1;
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            int p2 = input.indexOf(' ', p1);
            if (p2 == -1) {
                p2 = input.length();
            }
            String substring = input.substring(p1, p2).trim();
            if (!substring.isEmpty()) {
                int a = Integer.parseInt(substring);
                int s = a / 2;
                int amr = a % 2;
                if (sw_k == 1 && amr == 1) {
                    cnt++;
                }
            }
            p1 = p2 + 1;
            sw_k = 1 - sw_k;
        }
        System.out.println(cnt);
    }
}