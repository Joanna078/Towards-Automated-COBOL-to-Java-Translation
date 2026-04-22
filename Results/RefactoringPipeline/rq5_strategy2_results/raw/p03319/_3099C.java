```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values for N and K separated by space: ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        
        if (parts.length != 2) {
            System.out.println("Invalid input. Please enter two numbers separated by space.");
            return;
        }
        
        try {
            int N = Integer.parseInt(parts[0].trim());
            int K = Integer.parseInt(parts[1].trim());
            
            if (K == 1) {
                System.out.println("Division by zero error.");
                return;
            }
            
            int result = (N - 2) / (K - 1) + 1;
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter valid integers.");
        }
    }
}
```