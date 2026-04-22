```java
import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.println("Enter three numbers separated by spaces:");
        String ln = scanner.nextLine();
        
        // Splitting the input string into individual numbers
        String[] parts = ln.split("\\s+");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        int C = Integer.parseInt(parts[2]);
        
        // Logic
        int ans;
        if (A < B + C) {
            ans = B + C - A;
        } else {
            ans = 0;
        }
        
        // Output
        System.out.println(ans);
        
        scanner.close();
    }
}
```