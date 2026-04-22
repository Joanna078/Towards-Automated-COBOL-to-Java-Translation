```java
import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input
        String ln = scanner.nextLine();
        
        // Split the input into individual characters
        String[] parts = ln.split("\\s+");
        if (parts.length != 3) {
            System.out.println("Invalid input");
            return;
        }
        
        char a = parts[0].charAt(0);
        char b = parts[1].charAt(0);
        char c = parts[2].charAt(0);
        
        int flg = 0;
        
        // Check conditions
        if ((a == b && b != c) || (b == c && c != a) || (c == a && a != b)) {
            flg = 1;
        }
        
        // Display result
        if (flg == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```