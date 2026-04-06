```java
import java.util.Scanner;

public class Bishop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter values: ");
        String input = scanner.nextLine();
        
        // Split input into components
        String[] parts = input.split(" ");
        int h = Integer.parseInt(parts[0]);
        int w = Integer.parseInt(parts[1]);
        
        // Output initialization
        int out;
        
        // Logic
        if (h == 1 || w == 1) {
            out = 0;
        } else {
            int s1 = h / 2;
            int s2 = w / 2;
            if (h == s1 * 2 || w == s2 * 2) {
                out = h * w / 2;
            } else {
                out = h * w / 2 + 1;
            }
        }
        
        // Output
        System.out.println(out);
        
        scanner.close();
    }
}
```