```java
import java.util.Scanner;

public class ABC_080_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input handling
        String inp = scanner.nextLine();
        scanner.close();

        // Parsing input
        String[] parts = inp.split(" ");
        int n = Integer.parseInt(parts[0]);
        int a = Integer.parseInt(parts[1]);
        int b = Integer.parseInt(parts[2]);

        // Logic processing
        int t;
        if (a * n <= b) {
            t = a * n;
        } else {
            t = b;
        }

        // Formatting output
        String zs = String.format("%04d", t);
        String ans = "";
        for (char c : zs.toCharArray()) {
            if (c != ' ') {
                ans += c;
            }
        }

        // Output result
        System.out.println(ans.substring(1)); // Remove leading zero
    }
}
```