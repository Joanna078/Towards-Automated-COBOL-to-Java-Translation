```java
import java.util.Scanner;

public class Kyopuro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        String inStr = scanner.nextLine();
        
        // Splitting the input string into two parts
        String[] parts = inStr.split("\\s+");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        
        // Result variable
        long viewRes;
        
        // Logic based on the conditions
        if (n == 1 && m == 1) {
            viewRes = 1;
        } else if (n == 1 || m == 1) {
            viewRes = Math.max(n, m) - 2;
        } else {
            viewRes = (long) (n - 2) * (m - 2);
        }
        
        // Output the result
        System.out.println(viewRes);
        
        scanner.close();
    }
}
```