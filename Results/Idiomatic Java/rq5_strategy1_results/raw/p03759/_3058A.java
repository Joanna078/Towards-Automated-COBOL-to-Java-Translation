```java
import java.util.Scanner;

public class Main {

    private static int returnCode;
    private static String inp;
    private static int a;
    private static int b;
    private static int c;
    private static int ans1;
    private static int ans2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        // Unstring the input
        String[] parts = inp.split("\\s+");
        if (parts.length >= 3) {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[1]);
            c = Integer.parseInt(parts[2]);
        } else {
            System.out.println("Invalid input format.");
            return;
        }

        // Compute differences
        ans1 = b - a;
        ans2 = c - b;

        // Display result
        if (ans1 == ans2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```