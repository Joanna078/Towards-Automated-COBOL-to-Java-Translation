```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        
        // Splitting input into two parts
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        
        // Determine the larger number
        int n;
        if (a >= b) {
            n = a;
        } else {
            n = b;
        }
        
        // Create output string
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < n; i++) {
            out.append(n);
        }
        
        // Output
        System.out.println(out.toString());
        
        scanner.close();
    }
}
```