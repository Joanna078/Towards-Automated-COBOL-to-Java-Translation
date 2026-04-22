```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for S: ");
        String s = scanner.nextLine().trim();

        if (s.equals("ABC")) {
            System.out.println("ARC");
        } else {
            System.out.println("ABC");
        }
    }
}
```