```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inp = reader.readLine();
        int maxlen = 2;
        int cur = 0; // Adjusted to start from index 0
        int i = 0;   // Adjusted to start from index 0
        int j;
        int len;
        int[] dn = new int[maxlen];
        int tmp;
        while (i < maxlen) { // Changed to '<' to avoid out-of-bounds
            j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') { // Adjusted index for charAt
                j++;
            }
            len = j - cur;
            if (len > 0) { // Ensure there is something to parse
                dn[i] = Integer.parseInt(inp.substring(cur, j).trim()); // Adjusted substring indices
            }
            cur = j + 1;
            i++;
        }
        tmp = (int) Math.pow(100, dn[0]) * dn[1];
        System.out.println(tmp);
    }
}
```