```java
import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input
        System.out.print("Enter two numbers separated by space: ");
        String ln = scanner.nextLine();
        
        // Unstring the input
        String[] parts = ln.split("\\s+");
        int n = Integer.parseInt(parts[0].trim());
        int m = Integer.parseInt(parts[1].trim());
        
        // Compare the numbers
        if (n == m) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```