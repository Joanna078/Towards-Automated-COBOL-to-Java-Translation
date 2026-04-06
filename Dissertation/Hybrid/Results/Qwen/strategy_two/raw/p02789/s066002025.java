```java
import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input from user
        System.out.print("Enter three characters: ");
        String ln = scanner.nextLine();
        
        // Check if the length of the input is exactly 3
        if (ln.length() == 3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```