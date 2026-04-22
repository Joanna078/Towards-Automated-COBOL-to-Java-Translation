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

        int P = Integer.parseInt(parts[0]);
        int Q = Integer.parseInt(parts[1]);
        int R = Integer.parseInt(parts[2]);

        int A1 = P + Q;
        int A2 = Q + R;
        int A3 = P + R;

        int ans = Math.min(A1, Math.min(A2, A3));

        System.out.printf("%05d%n", ans);
    }
}
```