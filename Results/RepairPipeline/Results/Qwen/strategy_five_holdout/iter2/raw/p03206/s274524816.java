```java
import java.util.Scanner;

public class Christmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input from console
        int num = scanner.nextInt();
        
        // Determine the output based on the input number
        if (num == 25) {
            System.out.println("Christmas");
        } else if (num == 24) {
            System.out.println("Christmas Eve");
        } else if (num == 23) {
            System.out.println("Christmas Eve Eve");
        } else if (num == 22) {
            System.out.println("Christmas Eve Eve Eve");
        }
        
        scanner.close();
    }
}
```