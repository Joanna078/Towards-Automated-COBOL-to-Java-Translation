```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input section
        System.out.print("Enter a value: ");
        int a = scanner.nextInt();
        
        // Processing section
        int out = a + (int) Math.pow(a, 2) + (int) Math.pow(a, 3);
        
        // Output section
        System.out.printf("%03d%n", out);
        
        scanner.close();
    }
}
```