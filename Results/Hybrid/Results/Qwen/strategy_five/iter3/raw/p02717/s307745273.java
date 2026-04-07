```java
import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input
        String ln = scanner.nextLine();
        
        // Split input into components
        String[] parts = ln.split("\\s+");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Input must contain exactly three numbers.");
        }
        
        // Convert strings to integers
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);
        int z = Integer.parseInt(parts[2]);
        
        // Format output string
        String ans = String.format("%d %d %d", z, x, y);
        
        // Display result
        System.out.println(ans.trim());
        
        scanner.close();
    }
}
```