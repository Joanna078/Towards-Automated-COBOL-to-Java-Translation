```java
import java.util.Scanner;

public class Abc169c {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        
        // Unstring input
        String[] parts = input.split("\\s+");
        long a = Long.parseLong(parts[0]);
        double b = Double.parseDouble(parts[1]);
        
        // Compute and display result
        double ans = a * b;
        System.out.printf("Result: %.0f%n", ans);
        
        scanner.close();
    }
}
```