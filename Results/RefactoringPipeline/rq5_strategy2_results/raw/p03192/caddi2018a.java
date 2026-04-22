```java
import java.util.Scanner;

public class Caddi2018a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        
        // Count occurrences of '2'
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == '2') {
                count++;
            }
        }
        
        // Display the count
        System.out.println("Number of '2's: " + count);
        
        scanner.close();
    }
}
```