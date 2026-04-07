```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inp = reader.readLine().trim(); // Trim the input to remove leading/trailing spaces
        int maxlen = 2;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        int[] dn = new int[maxlen];
        int tmp;
        while (i <= maxlen) {
            j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            if (len > 0) { // Ensure there is a valid number to parse
                dn[i - 1] = Integer.parseInt(inp.substring(cur - 1, j).trim()); // Trim substring to remove spaces
            }
            cur = j + 1;
            i++;
        }
        tmp = (int) Math.pow(100, dn[0]) * dn[1];
        System.out.println(tmp);
    }
}
```