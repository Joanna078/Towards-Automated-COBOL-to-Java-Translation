import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String input = reader.readLine();
        int now = 1;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int temp1 = input.indexOf(' ', now);
            a[i] = Integer.parseInt(input.substring(now, temp1));
            now = temp1 + 1;
        }
        int re = 10000;
        for (int i = 0; i < n; i++) {
            int r = a[i] / 2;
            int mod = a[i] % 2;
            while (mod == 0) {
                r = a[i] / 2;
                mod = a[i] % 2;
                a[i] = r;
            }
            if (a[i] < re) {
                re = a[i];
            }
        }
        System.out.println(re);
    }
}