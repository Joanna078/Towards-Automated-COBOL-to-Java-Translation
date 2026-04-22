```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String inp = scanner.nextLine().trim();
        
        // Ensure the input is exactly 3 characters long
        if (inp.length() != 3) {
            System.out.println("Input must be exactly 3 characters long.");
            return;
        }

        int r = Integer.parseInt(inp);
        int ans = r * r;
        
        System.out.printf("%06d%n", ans);
    }
}
```