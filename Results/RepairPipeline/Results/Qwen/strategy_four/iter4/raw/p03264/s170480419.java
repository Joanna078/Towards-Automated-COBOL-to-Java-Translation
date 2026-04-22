```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input section
        System.out.print("Enter value for K: ");
        int k = scanner.nextInt();
        
        // Processing section
        int l = k / 2;
        int ans = l * (k - l);
        
        // Output section
        System.out.println(String.format("%03d", ans));
        
        scanner.close();
    }
}
```