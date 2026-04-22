```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from user
        System.out.print("Enter a string of length 6: ");
        String s = scanner.nextLine();
        
        // Check if the input is exactly 6 characters long
        if (s.length() != 6) {
            System.out.println("Input must be 6 characters long.");
            return;
        }
        
        // Extract substrings and compare
        char thirdChar = s.charAt(2); // Indexing starts at 0 in Java
        char fourthChar = s.charAt(3);
        char fifthChar = s.charAt(4);
        char sixthChar = s.charAt(5);
        
        if (thirdChar == fourthChar && fifthChar == sixthChar) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```