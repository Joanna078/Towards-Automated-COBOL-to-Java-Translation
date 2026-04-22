```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int maxCount = findMaxConsecutiveATCG(input);
        System.out.println(maxCount);
    }

    private static int findMaxConsecutiveATCG(String s) {
        int maxCount = 0;
        int currentCount = 0;

        for (char c : s.toCharArray()) {
            if (isATCG(c)) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }

    private static boolean isATCG(char c) {
        return c == 'A' || c == 'C' || c == 'G' || c == 'T';
    }
}
```