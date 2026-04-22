```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.println("Enter two numbers separated by space:");
        String input = scanner.nextLine();
        
        // Splitting input into two parts
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        
        // Calculation
        int ans = a + b;
        int sho = ans / 2;
        int ama = ans % 2;
        
        // Output
        if (ama == 1) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.printf("%010d%n", sho);
        }
        
        scanner.close();
    }
}
```