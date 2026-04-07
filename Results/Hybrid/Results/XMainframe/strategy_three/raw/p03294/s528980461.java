```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        int sum = 0;
        int cur = 0;
        for (int i = 0; i < n; i++) {
            int j = cur;
            while (j < line.length() && !line.substring(j, j + 1).trim().isEmpty()) {
                j++;
            }
            int len = j - cur;
            if (len > 0) {
                int num = Integer.parseInt(line.substring(cur, cur + len)) - 1;
                sum += num;
            }
            cur = j + 1;
        }
        System.out.println(sum);
    }
}
```