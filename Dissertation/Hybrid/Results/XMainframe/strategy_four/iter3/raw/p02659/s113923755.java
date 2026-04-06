```java
import java.io.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ab = reader.readLine();
        StringTokenizer st = new StringTokenizer(ab);
        BigDecimal a = new BigDecimal(st.nextToken());
        BigDecimal b = new BigDecimal(st.nextToken());
        BigDecimal ans = a.multiply(b);
        DecimalFormat df = new DecimalFormat("00000000000000000000");
        System.out.println(df.format(ans));
    }
}
```