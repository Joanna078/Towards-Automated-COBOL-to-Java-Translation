```java
import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter S: ");
        String s = scanner.nextLine().trim();

        System.out.print("Enter T: ");
        String t = scanner.nextLine().trim();

        if (s.equals(t.substring(0, t.length() - 1))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
```