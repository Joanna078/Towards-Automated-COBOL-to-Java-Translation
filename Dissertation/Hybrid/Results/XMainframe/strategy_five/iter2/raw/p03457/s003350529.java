```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(reader.readLine());
        String line;
        int a, b, c;
        long now1 = 0, now2 = 0, now3 = 0;
        boolean possible = true;
        for (int i = 0; i < s; i++) {
            line = reader.readLine();
            StringTokenizer tokenizer = new StringTokenizer(line);
            a = Integer.parseInt(tokenizer.nextToken());
            b = Integer.parseInt(tokenizer.nextToken());
            c = Integer.parseInt(tokenizer.nextToken());
            if ((a - now1) < (b - now2) || (a - now1) % 2 != 0) {
                possible = false;
                break;
            }
            long diff1 = (a - now1) / 2;
            long diff2 = b - now2;
            long diff3 = (c - now3) / 2;
            long diff4 = c - now3;
            if (diff4 % 2 != 0 || Math.abs(diff2 - diff4) > 2) {
                possible = false;
                break;
            }
            now1 = a;
            now2 = b;
            now3 = c;
        }
        System.out.println(possible ? "Yes" : "No");
    }
}
```