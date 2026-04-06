```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] parts = line.split(" ");
        String s1 = parts[0];
        String s2 = parts[1];
        String s3 = parts[2];
        System.out.println("" + Character.toUpperCase(s1.charAt(0)) + Character.toUpperCase(s2.charAt(0)) + Character.toUpperCase(s3.charAt(0)));
    }
}
```