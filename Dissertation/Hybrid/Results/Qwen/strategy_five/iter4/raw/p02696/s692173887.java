```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter the values: ");
        String input = scanner.nextLine();
        
        // Splitting the input string into components
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        long b = Long.parseLong(parts[1]);
        long n = Long.parseLong(parts[2]);
        
        // Logic
        long x;
        if (n >= b) {
            x = b - 1;
        } else {
            x = n;
        }
        
        double fa = (double) (a * x) / b;
        double fb = (double) x / b;
        fb = a * fb;
        double out = fa - fb;
        
        // Output
        System.out.printf("%d%n", (int) out);
        
        scanner.close();
    }
}
```