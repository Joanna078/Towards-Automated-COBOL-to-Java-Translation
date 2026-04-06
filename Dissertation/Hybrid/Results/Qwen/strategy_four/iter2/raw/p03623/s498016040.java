```java
import java.util.Scanner;

public class ABC_071_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from user
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        
        // Split the input into components
        String[] parts = inp.split("\\s+");
        int x = Integer.parseInt(parts[0]);
        int a = Integer.parseInt(parts[1]);
        int b = Integer.parseInt(parts[2]);
        
        // Perform calculations
        a -= x;
        b -= x;
        
        // Determine the output based on the comparison
        if (a < b) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
        
        scanner.close();
    }
}
```