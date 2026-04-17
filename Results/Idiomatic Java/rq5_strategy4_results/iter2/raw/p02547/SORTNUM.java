```java
import java.util.Scanner;

public class SortNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of iterations
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        int count = 0;

        for (int i = 0; i < n; i++) {
            // Read the input string
            String input = scanner.nextLine();

            // Split the input into two characters
            char d1 = input.charAt(0);
            char d2 = input.charAt(1);

            // Check if both characters are the same
            if (d1 == d2) {
                count++;

                // If count reaches 3, print "Yes" and exit
                if (count == 3) {
                    System.out.println("Yes");
                    return;
                }
            } else {
                count = 0; // Reset count if characters are different
            }
        }

        // If count never reached 3, print "No"
        if (count != 3) {
            System.out.println("No");
        }

        scanner.close();
    }
}
```