```java
import java.util.Scanner;

public class ABC046B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input string from standard input
        String str = scanner.nextLine();
        
        // Split the input string into components
        String[] parts = str.split(" ");
        int n = Integer.parseInt(parts[0]);
        int k = Integer.parseInt(parts[1]);
        
        // Calculate the result using the given formula
        long ans = k * (long) Math.pow(k - 1, n - 1);
        
        // Format the result with leading zeros if necessary
        String ansStr = String.format("%09d", ans);
        
        // Display the result
        System.out.println(ansStr);
        
        scanner.close();
    }
}
```