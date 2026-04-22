```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        
        if (parts.length != 2) {
            System.out.println("Invalid input");
            return;
        }
        
        try {
            long a = Long.parseLong(parts[0].trim());
            long b = Long.parseLong(parts[1].trim());
            
            long ans = a + b;
            long sho = ans / 2;
            long ama = ans % 2;
            
            if (ama == 1) {
                System.out.println("IMPOSSIBLE");
            } else {
                System.out.printf("%09d%n", sho);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}
```