```java
import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values
        int n = Integer.parseInt(scanner.nextLine());
        String arare = scanner.nextLine();
        
        // Initialize answer
        String ans = "Three";
        
        // Multiply n by 2 and subtract 1
        n = 2 * n - 1;
        
        // Loop through arare string
        while (n >= 0 && n < arare.length() && arare.charAt(n) != 'Y') {
            n--;
        }
        
        // Check if 'Y' is found
        if (n >= 0) {
            ans = "Four";
        }
        
        // Output the result
        System.out.println(ans.trim());
        
        scanner.close();
    }
}
```