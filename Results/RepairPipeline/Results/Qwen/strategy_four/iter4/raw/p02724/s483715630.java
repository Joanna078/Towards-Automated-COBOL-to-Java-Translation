```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter a value for X: ");
        int x = scanner.nextInt();
        
        // Processing
        int s1 = x / 500;
        int a = x % 500;
        int s2 = a / 5;
        int out = s1 * 1000 + s2 * 5;
        
        // Output
        System.out.println(String.format("%09d", out));
        
        scanner.close();
    }
}
```