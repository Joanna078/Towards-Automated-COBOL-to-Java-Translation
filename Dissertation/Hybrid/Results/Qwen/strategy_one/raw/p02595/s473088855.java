```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input processing
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        
        // Splitting input into components
        String[] parts = inp.split(" ");
        int n = Integer.parseInt(parts[0]);
        double d = Double.parseDouble(parts[1]);
        
        // Initialize counter
        int cnt = 0;
        
        // Loop through each pair of numbers
        for (int i = 2; i < parts.length; i += 2) {
            double x = Double.parseDouble(parts[i]);
            double y = Double.parseDouble(parts[i + 1]);
            
            // Calculate distance
            double k = Math.sqrt(x * x + y * y);
            
            // Check if within range
            if (k <= d) {
                cnt++;
            }
        }
        
        // Output result
        System.out.println(cnt);
    }
}
```