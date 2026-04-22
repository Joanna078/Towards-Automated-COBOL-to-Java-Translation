```java
import java.util.Scanner;

public class Answer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);

        int count = 0;

        // Loop from a to b
        for (int i = a; i <= b; i++) {
            String str = String.valueOf(i);
            if (str.charAt(0) == str.charAt(4) && str.charAt(1) == str.charAt(3)) {
                count++;
            }
        }

        // Output the result
        System.out.printf("%04d%n", count);
    }
}
```