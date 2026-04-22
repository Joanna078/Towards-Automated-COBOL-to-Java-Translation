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
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(line.substring(i * 2, i * 2 + 2)) - 1;
            sum += num;
        }
        System.out.println(sum);
    }
}
```