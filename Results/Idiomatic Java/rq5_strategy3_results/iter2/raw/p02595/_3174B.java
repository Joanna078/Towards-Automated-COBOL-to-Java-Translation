```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input for N and D
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int D = Integer.parseInt(input[1]);

        int count = 0;

        // Read and process each pair of X and Y
        for (int i = 0; i < N; i++) {
            input = scanner.nextLine().split(" ");
            int X = Integer.parseInt(input[0]);
            int Y = Integer.parseInt(input[1]);

            double distance = Math.sqrt(X * X + Y * Y);
            if (distance <= D) {
                count++;
            }
        }

        // Output the result
        System.out.println(count);
    }
}
```