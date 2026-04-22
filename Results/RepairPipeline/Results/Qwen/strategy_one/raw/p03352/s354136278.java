```java
import java.util.Scanner;

public class ABC_097_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input for variable A
        System.out.print("Enter value for A: ");
        long A = scanner.nextLong();
        
        long ans = 1;
        
        // Perform nested loops as per the original COBOL logic
        for (long b = 2; b <= A; b++) {
            for (long p = 2; ; p++) {
                long tmp = (long) Math.pow(b, p);

                if (A < tmp) {
                    break;
                }

                ans = Math.max(ans, tmp);
            }
        }

        // Display the result
        System.out.println("Result: " + ans);
    }
}
```