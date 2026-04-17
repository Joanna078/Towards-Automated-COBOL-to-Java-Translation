```java
import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first line
        String ln = scanner.nextLine();
        String[] parts = ln.split("\\s+");
        String s = parts[0];
        String t = parts[1];

        // Read second line
        ln = scanner.nextLine();
        parts = ln.split("\\s+");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        // Read third line
        String u = scanner.nextLine();

        // Adjust values based on comparison
        if (s.equals(u)) {
            a--;
        } else {
            b--;
        }

        // Convert numbers to strings
        String ansA = String.valueOf(a);
        String ansB = String.valueOf(b);

        // Combine results
        String result = ansA + " " + ansB;

        // Output the result
        System.out.println(result);

        scanner.close();
    }
}
```