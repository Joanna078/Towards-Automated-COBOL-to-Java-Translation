```java
import java.util.Scanner;

public class NomuraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.println("Enter the time difference string (HH MM HH MM K): ");
        String inp = scanner.nextLine();
        
        // Parsing
        String[] parts = inp.split(" ");
        int h1 = Integer.parseInt(parts[0]);
        int m1 = Integer.parseInt(parts[1]);
        int h2 = Integer.parseInt(parts[2]);
        int m2 = Integer.parseInt(parts[3]);
        int k = Integer.parseInt(parts[4]);
        
        // Calculation
        int w = h2 * 60 + m2 - (h1 * 60 + m1);
        int out = w - k;
        
        // Output
        System.out.printf("%03d%n", Math.abs(out));
        
        scanner.close();
    }
}
```