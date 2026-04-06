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
        String formattedOut = String.format("%07.7f", out);
        System.out.println(formattedOut.replaceFirst("^0+", ""));
    }
}
```