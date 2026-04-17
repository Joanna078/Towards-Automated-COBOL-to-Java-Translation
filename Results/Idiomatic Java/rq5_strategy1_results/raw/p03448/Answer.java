```java
import java.util.Scanner;

public class Answer {

    private boolean initialized = false;
    private int returnCode = 0;
    private int a, b, c, x;
    private int ans = 0;

    public static void main(String[] args) {
        new Answer().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // Accept input values
        System.out.print("Enter value for a: ");
        a = scanner.nextInt();
        System.out.print("Enter value for b: ");
        b = scanner.nextInt();
        System.out.print("Enter value for c: ");
        c = scanner.nextInt();
        System.out.print("Enter value for x: ");
        x = scanner.nextInt();

        // Perform calculations
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                for (int k = 0; k <= c; k++) {
                    int tmp1 = i * 500 + j * 100 + k * 50;
                    if (tmp1 == x) {
                        ans++;
                    }
                }
            }
        }

        // Display result
        System.out.println("Result: " + ans);
    }
}
```