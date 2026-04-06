```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String inp = "10 20 30 40 50"; // Example input
        int[] values = Arrays.stream(inp.split(" "))
                             .mapToInt(Integer::parseInt)
                             .toArray();
        
        int a = values[0];
        int b = values[1];
        int c = values[2];
        int x = values[3];
        int y = values[4];

        int max = a * x + b * y;
        int big = x >= y ? a : b;
        int sa = x >= y ? x - y : y - x;
        long cnt = a + b <= c * 2 ? (long) max : (long) max - (a + b - c * 2) * Math.min(x, y);
        
        if (big > c * 2) {
            cnt -= (big - c * 2) * sa;
        }

        System.out.println(String.format("%08d", cnt));
    }
}
```