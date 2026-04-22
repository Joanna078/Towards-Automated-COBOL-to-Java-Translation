```java
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        int l = Integer.parseInt(scanner.nextLine());

        // Processing
        BigDecimal h = new BigDecimal(l).divide(BigDecimal.valueOf(3), RoundingMode.HALF_UP);
        BigDecimal out = h.pow(3);

        // Output
        System.out.printf("%07d.%07d%n", out.toBigInteger(), out.remainder(BigDecimal.ONE).multiply(BigDecimal.TEN.pow(7)).toBigInteger());
    }
}
```