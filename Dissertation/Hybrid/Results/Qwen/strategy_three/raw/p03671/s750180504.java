```java
import java.util.Arrays;

public class ABC_066_A {
    public static void main(String[] args) {
        String inp = "12345 67890 54321"; // Simulating input
        String[] parts = inp.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);

        int tmp = a + b;
        c = Math.max(Math.max(a, b), c);
        c -= tmp;

        StringBuilder zs = new StringBuilder();
        zs.append(String.format("%06d", c));

        StringBuilder ans = new StringBuilder();
        for (char ch : zs.toString().toCharArray()) {
            if (ch != ' ') {
                ans.append(ch);
            }
        }

        System.out.println(ans.substring(0, ans.length()));
    }
}
```