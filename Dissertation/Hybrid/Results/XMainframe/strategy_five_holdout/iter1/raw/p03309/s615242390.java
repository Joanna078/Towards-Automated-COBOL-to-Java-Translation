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
        long[] b = new long[n];
        int cur = 0;
        int len = 0;
        int i = 0;
        int j = 0;
        long x = 0;
        long sum = 0;
        int maxlen = n;
        int tmp = 0;

        // Parse input into array b
        for (j = 0; j < line.length(); j++) {
            if (line.charAt(j) == ' ') {
                len = j - cur;
                x = Long.parseLong(line.substring(cur, cur + len));
                b[i] = x - i;
                cur = j + 1;
                i++;
            }
        }

        // Handle last number in the input
        if (cur < line.length()) {
            len = line.length() - cur;
            x = Long.parseLong(line.substring(cur, cur + len));
            b[i] = x - i;
        }

        Arrays.sort(b);

        // Find central index
        tmp = (n - 1) / 2;
        x = b[tmp];

        // Calculate sum of absolute differences
        for (long num : b) {
            sum += Math.abs(x - num);
        }

        // Convert sum to string format
        String ans = String.format("%015d", sum);

        // Remove leading zeros
        ans = ans.replaceFirst("^0+(?!$)", "");

        System.out.println(ans);
    }
}
```