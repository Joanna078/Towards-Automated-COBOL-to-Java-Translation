```java
import java.util.Scanner;

public class Caddi2018A {
    public static void main(String[] args) {
        // Input: Accepts an integer from the user
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // Working storage variable to count occurrences of digit '2'
        int c = 0;

        // Logic to count occurrences of digit '2' in the number
        while (n != 0) {
            if ((n % 10) == 2) {
                c++;
            }
            n /= 10;
        }

        // Output: Displays the count of digit '2'
        System.out.println(c);
        scanner.close();
    }
}
```