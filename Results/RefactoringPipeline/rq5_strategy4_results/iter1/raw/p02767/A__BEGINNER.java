```java
import java.util.Scanner;

public class ABeginner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first line and extract number of elements
        String input = scanner.nextLine();
        int n = Integer.parseInt(input.trim());

        // Read second line and extract numbers
        input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        int[] numbers = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
            sum += numbers[i];
        }

        // Calculate average
        double avg = (double) sum / n;

        // Calculate variance
        double varianceSum = 0;
        for (int num : numbers) {
            varianceSum += Math.pow(num - avg, 2);
        }

        // Output the variance
        System.out.printf("%07d\n", (int) varianceSum);
    }
}
```