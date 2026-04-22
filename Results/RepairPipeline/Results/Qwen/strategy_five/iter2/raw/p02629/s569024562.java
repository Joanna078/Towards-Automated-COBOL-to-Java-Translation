```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        int n = scanner.nextInt();
        
        // Constants
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        
        // Output buffer
        StringBuilder out = new StringBuilder("           ");
        
        // Logic
        int m = n;
        for (int i = 11; i >= 0 && m > 0; i--) {
            m--;
            int amr = m % 26 + 1;
            if (amr <= 26) {
                out.setCharAt(i, alpha.charAt(amr - 1));
            }
        }
        
        // Output
        System.out.println(out.toString().trim());
        
        scanner.close();
    }
}
```