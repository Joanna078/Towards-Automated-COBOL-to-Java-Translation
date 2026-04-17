```java
import java.util.Scanner;

public class TEST129 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers separated by spaces: ");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        
        if (parts.length != 3) {
            System.out.println("Please enter exactly three numbers.");
            return;
        }

        try {
            int p = Integer.parseInt(parts[0]);
            int q = Integer.parseInt(parts[1]);
            int r = Integer.parseInt(parts[2]);

            int a1 = p + q;
            int a2 = q + r;
            int a3 = p + r;

            int ans = Math.min(a1, Math.min(a2, a3));

            System.out.println(ans);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }
}
```