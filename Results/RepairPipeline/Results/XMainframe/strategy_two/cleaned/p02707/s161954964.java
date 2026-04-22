import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        int[] a = new int[n];
        Arrays.fill(a, 0);
        int p1 = 0;
        for (int i = 0; i < n; i++) {
            int start = p1;
            while (p1 < line.length() && line.charAt(p1) != ' ') {
                p1++;
            }
            int w = Integer.parseInt(line.substring(start, p1));
            if (w >= 0 && w < n) {
                a[w]++;
            }
            p1++;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}