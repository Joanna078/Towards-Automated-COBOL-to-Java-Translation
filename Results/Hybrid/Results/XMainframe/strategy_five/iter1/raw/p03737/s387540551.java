```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] parts = line.split(" ");
        String s1 = parts[0].toUpperCase();
        String s2 = parts[1].toUpperCase();
        String s3 = parts[2].toUpperCase();
        System.out.println(s1.substring(0, 1) + s2.substring(0, 1) + s3.substring(0, 1));
    }
}
```