```java
import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long N = scanner.nextLong();
        scanner.close();

        long qt = N / 1000;
        long rm = N % 1000;
        long num = 1000 - rm;
        qt = num / 1000;
        long ans = num % 1000;

        String zs = String.format("%09d", ans).trim();
        System.out.println(zs);
    }
}
```