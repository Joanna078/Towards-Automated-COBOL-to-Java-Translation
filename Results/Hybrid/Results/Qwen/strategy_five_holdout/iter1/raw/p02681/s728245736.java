```java
import java.util.Scanner;

public class ProgramId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input for S
        String s = scanner.nextLine();

        // Accept input for T
        String t = scanner.nextLine();

        // Compare S with the substring of T excluding the last character
        if (s.equals(t.substring(0, t.length() - 1))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
```