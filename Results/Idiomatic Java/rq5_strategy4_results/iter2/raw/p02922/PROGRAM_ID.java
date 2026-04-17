```java
import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        
        if (parts.length != 2) {
            System.out.println("Invalid input. Please enter two numbers.");
            return;
        }
        
        try {
            int A = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);
            int ans = 0;
            int cur = 1;
            
            while (B > cur) {
                ans++;
                cur += A - 1;
            }
            
            System.out.println(ans);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }
}
```