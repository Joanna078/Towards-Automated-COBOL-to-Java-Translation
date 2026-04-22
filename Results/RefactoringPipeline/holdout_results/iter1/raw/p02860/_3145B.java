```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input for N
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Accept input for S
        String S = scanner.nextLine();

        // Calculate H and A
        int H = N / 2;
        int A = N % 2;

        // Check conditions
        if (A == 0) {
            if (S.substring(0, H).equals(S.substring(H, H * 2))) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
```