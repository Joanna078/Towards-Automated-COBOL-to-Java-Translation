```java
import java.util.Scanner;

public class ABC_078_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input from user
        System.out.print("Enter three characters: ");
        String inp = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Extract characters
        char x = inp.charAt(0);
        char y = inp.charAt(2);
        
        // Compare and display result
        if (x < y) {
            System.out.print("<");
        } else if (x == y) {
            System.out.print("=");
        } else {
            System.out.print(">");
        }
    }
}
```