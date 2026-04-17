```java
import java.util.Scanner;

public class Kyopuro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inStr = scanner.nextLine();
        String[] parts = inStr.split("\\s+");
        
        long n = Long.parseLong(parts[0]);
        long m = Long.parseLong(parts[1]);
        
        long result = calculateViewRes(n, m);
        System.out.println(result);
    }

    private static long calculateViewRes(long n, long m) {
        if (n == 1 && m == 1) {
            return 1;
        } else if (n == 1 || m == 1) {
            return Math.max(n, m) - 2;
        } else {
            return (n - 2) * (m - 2);
        }
    }
}
```