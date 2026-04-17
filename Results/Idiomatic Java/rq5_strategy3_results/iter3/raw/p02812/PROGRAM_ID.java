```java
import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input for N
        System.out.print("Enter N: ");
        scanner.nextLine(); // Consume the newline character

        // Accept input for S
        System.out.print("Enter S: ");
        String s = scanner.nextLine();

        // Count occurrences of "ABC" in S
        int cnt = s.length() - s.replace("ABC", "").length();

        // Display the count
        System.out.println(cnt);

        scanner.close();
    }
}
```