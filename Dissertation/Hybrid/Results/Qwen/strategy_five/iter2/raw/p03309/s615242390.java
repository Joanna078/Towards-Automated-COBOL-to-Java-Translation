```java
import java.util.Arrays;
import java.util.Scanner;

public class ABC_102_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int n = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();
        
        // Initialize variables
        int maxlen = n;
        int cur = 1;
        long i = 1;
        long j;
        long len;
        long[] b = new long[2200000];
        long x;
        long t;
        long s = 0;
        long tmp;
        char[] ans = new char[15];
        char[] zs = new char[15];

        // Process input
        while (cur <= maxlen) {
            j = cur;
            while (j <= maxlen && inp.charAt((int) (j - 1)) != ' ') {
                j++;
            }
            len = j - cur;
            x = Long.parseLong(inp.substring((int) (cur - 1), (int) (cur + len - 1)));
            x -= i;
            b[(int) i] = x;
            cur = (int) j + 1; // Cast j to int before adding 1
            i++;
        }

        // Sort array
        Arrays.sort(b);

        // Calculate central index
        tmp = n - 1;
        tmp /= 2;
        tmp++;

        // Find median
        x = b[(int) tmp];
        i = 1;
        while (i <= maxlen) {
            t = x - b[(int) i];
            s += t;
            i++;
        }

        // Convert result to string
        zs[0] = (char) ('0' + (s % 10));
        s /= 10;
        for (int k = 1; k < 15; k++) {
            zs[k] = (char) ('0' + (s % 10));
            s /= 10;
        }

        // Reverse string
        for (int k = 0; k < 15 / 2; k++) {
            char temp = zs[k];
            zs[k] = zs[14 - k];
            zs[14 - k] = temp;
        }

        // Output result
        System.out.println(new String(zs).trim());

        scanner.close();
    }
}
```