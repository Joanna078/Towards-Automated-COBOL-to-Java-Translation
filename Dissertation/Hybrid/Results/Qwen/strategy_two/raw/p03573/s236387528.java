```java
import java.util.Scanner;

public class ABC_075_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter three numbers separated by spaces: ");
        String input = scanner.nextLine();
        
        // Parse input
        String[] parts = input.split("\\s+");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);
        
        // Determine the result
        int zs;
        if (a == b) {
            zs = c;
        } else if (b == c) {
            zs = a;
        } else {
            zs = b;
        }
        
        // Output
        System.out.println(zs);
    }
}
```