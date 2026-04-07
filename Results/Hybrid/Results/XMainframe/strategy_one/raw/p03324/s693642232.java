```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inp = reader.readLine();
        int maxlen = 2;
        int cur = 0;
        int i = 0;
        int j;
        int len;
        int[] dn = new int[maxlen];
        int tmp;
        while (i < maxlen) {
            j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            dn[i] = Integer.parseInt(inp.substring(cur, j));
            cur = j + 1;
            i++;
        }
        tmp = (int) Math.pow(100, dn[0]) * dn[1];
        System.out.println(tmp);
    }
}
```