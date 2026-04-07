```java
import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String[] parts = input.split("\\s+");
        BigDecimal a = new BigDecimal(parts[0]);
        BigDecimal b = new BigDecimal(parts[1]);
        BigDecimal ans = a.multiply(b);
        System.out.println(ans.toBigInteger());
    }
}
```