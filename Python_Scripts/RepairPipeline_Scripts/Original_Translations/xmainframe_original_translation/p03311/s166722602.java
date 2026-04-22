import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String line = br.readLine();
        br.close();

        int p1 = 0;
        int p2 = 0;
        int[] a = new int[n];
        long sum = 0;
        int cnt = 0;

        while (p1 < line.length()) {
            p2 = line.indexOf(' ', p1);
            if (p2 == -1) {
                p2 = line.length();
            }
            a[cnt] = Integer.parseInt(line.substring(p1, p2));
            sum += a[cnt] - (cnt + 1);
            p1 = p2 + 1;
            cnt++;
        }

        Arrays.sort(a);
        int mid = n / 2;
        long median = a[mid] - (sum + mid) / n;

        System.out.println(median);
    }
}
