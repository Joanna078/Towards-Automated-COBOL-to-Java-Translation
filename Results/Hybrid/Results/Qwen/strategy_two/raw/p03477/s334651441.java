```java
import java.util.Scanner;

public class ABC_083_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from user
        String input = scanner.nextLine();
        
        // Split the input into individual strings
        String[] parts = input.split("\\s+");
        
        // Convert the string parts to integers
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);
        int d = Integer.parseInt(parts[3]);
        
        // Determine the result based on the conditions
        if (a + b < c + d) {
            System.out.println("Right");
        } else if (a + b == c + d) {
            System.out.println("Balanced");
        } else {
            System.out.println("Left");
        }
        
        scanner.close();
    }
}
```