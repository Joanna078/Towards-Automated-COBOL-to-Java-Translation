```java
import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input from user
        String ln = scanner.nextLine();
        
        // Split the input into two parts based on space delimiter
        String[] parts = ln.split("\\s+");
        
        // Extract the first and second part as integers
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        
        // Compare the two parts and display the result
        if (n == m) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```