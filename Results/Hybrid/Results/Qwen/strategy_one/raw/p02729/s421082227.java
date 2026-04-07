```java
import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.println("Enter a string with two numbers separated by space:");
        String ln = scanner.nextLine();
        
        // Splitting the input string into two parts
        String[] parts = ln.split("\\s+");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        
        // Calculation
        int ans = n * (n - 1) / 2 + m * (m - 1) / 2;
        
        // Output
        System.out.println(ans);
        
        scanner.close();
    }
}
```