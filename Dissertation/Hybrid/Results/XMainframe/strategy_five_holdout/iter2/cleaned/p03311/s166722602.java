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
        int[] a = new int[200000]; // Adjusted size to match COBOL array size
        long[] sa = new long[200000]; // Adjusted size to match COBOL array size
        int cnt = 0;

        while (p1 < line.length()) {
            p2 = line.indexOf(' ', p1);
            if (p2 == -1) {
                p2 = line.length();
            }
            a[cnt] = Integer.parseInt(line.substring(p1, p2));
            sa[cnt] = a[cnt] - (cnt + 1);
            p1 = p2 + 1;
            cnt++;
        }

        Arrays.sort(sa);
        int mid = n / 2;
        long w = (n % 2 == 1) ? sa[mid] : (sa[mid - 1] + sa[mid]) / 2;

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i] - (w + i);
        }

        System.out.println(sum);
    }
}