```java
import java.util.Scanner;

public class ABC_049_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        
        // Working storage
        int h;
        int w;
        StringBuilder c = new StringBuilder();
        int i;
        
        // Unstringing input
        String[] parts = inp.split("\\s+");
        h = Integer.parseInt(parts[0]);
        w = Integer.parseInt(parts[1]);
        
        // Loop
        for (i = 1; i <= h; i++) {
            System.out.print("Enter string: ");
            c.setLength(0); // Clear the StringBuilder
            c.append(scanner.nextLine());
            System.out.println(c.toString());
            System.out.println(c.toString());
        }
        
        scanner.close();
    }
}
```