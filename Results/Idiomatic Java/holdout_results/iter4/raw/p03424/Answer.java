```java
import java.util.Scanner;

public class Answer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String arare = scanner.nextLine();

        // Initialize answer
        String ans = "Three";

        // Perform calculations
        n = 2 * n - 1;

        // Loop through arare string
        while (n >= 0 && n < arare.length()) {
            if (arare.charAt(n) == 'Y') {
                ans = "Four";
                break;
            }
            n--;
        }

        // Output the result
        System.out.println(ans.trim());

        scanner.close();
    }
}
```