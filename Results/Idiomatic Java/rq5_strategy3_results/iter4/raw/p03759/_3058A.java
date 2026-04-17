```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers separated by spaces: ");
        String input = scanner.nextLine();
        
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            System.out.println("Invalid input. Please enter exactly three numbers.");
            return;
        }
        
        try {
            int a = Integer.parseInt(parts[0].trim());
            int b = Integer.parseInt(parts[1].trim());
            int c = Integer.parseInt(parts[2].trim());
            
            int ans1 = b - a;
            int ans2 = c - b;
            
            if (ans1 == ans2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}
```