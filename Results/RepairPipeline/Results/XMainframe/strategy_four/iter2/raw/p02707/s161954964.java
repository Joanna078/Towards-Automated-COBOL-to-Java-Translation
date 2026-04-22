```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        int[] a = new int[200000]; // Adjusted size to match COBOL array size
        Arrays.fill(a, 0);
        int p1 = 0;
        for (int i = 0; i < n; i++) {
            int p2 = p1;
            while (p2 < line.length() && line.charAt(p2) != ' ') {
                p2++;
            }
            if (p2 > p1) { // Ensure there is a substring to parse
                int w = Integer.parseInt(line.substring(p1, p2));
                a[w]++;
            }
            p1 = p2 + 1;
        }
        for (int i = 1; i <= n; i++) { // Start from 1 to match COBOL index
            System.out.println(a[i]);
        }
    }
}
```