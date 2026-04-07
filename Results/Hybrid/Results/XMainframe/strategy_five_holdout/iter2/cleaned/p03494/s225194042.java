import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine()) + 1;
        String input = reader.readLine();
        int now = 1;
        int[] a = new int[200];
        int s = 0;
        while (s < n - 1) {
            int temp1 = input.indexOf(' ', now);
            if (temp1 == -1) {
                temp1 = input.length();
            }
            // Trim leading spaces before parsing
            String trimmedInput = input.substring(now - 1, temp1).trim();
            if (!trimmedInput.isEmpty()) {
                a[s] = Integer.parseInt(trimmedInput);
                s++;
            }
            now = temp1 + 1;
        }
        int re = 10000;
        for (int i = 0; i < s; i++) {
            int r = a[i] / 2;
            int mod = a[i] % 2;
            while (mod == 0 && a[i] > 0) {
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