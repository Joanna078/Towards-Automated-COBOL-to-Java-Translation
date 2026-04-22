```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept K
        System.out.print("Enter K: ");
        int K = scanner.nextInt();

        // Accept INP
        System.out.print("Enter INP: ");
        scanner.nextLine(); // Consume newline left-over
        String INP = scanner.nextLine().trim();

        // Unstring INP into A and B
        String[] parts = INP.split("\\s+");
        if (parts.length < 2) {
            System.out.println("NG");
            return;
        }
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);

        // Divide A by K
        int S1 = A / K;
        int A1 = A % K;

        // Divide B by K
        int S2 = B / K;
        int A2 = B % K;

        // Check conditions
        if ((S1 >= 1 && S2 > 1) || (A1 == 0 && A > K)) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }

        scanner.close();
    }
}
```