```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String[] parts = input.split(" ");
        int count = Integer.parseInt(parts[parts.length - 1]);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append('x');
        }
        System.out.println(sb.toString());
    }
}
```