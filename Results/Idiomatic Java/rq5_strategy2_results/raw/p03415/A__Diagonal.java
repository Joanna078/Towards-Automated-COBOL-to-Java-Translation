```java
import java.util.Scanner;

public class ADiagonal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input for C1, C2, and C3
        String C1 = scanner.nextLine();
        String C2 = scanner.nextLine();
        String C3 = scanner.nextLine();

        // Display the first character of each string
        System.out.println(C1.charAt(0) + "" + C2.charAt(1) + "" + C3.charAt(2));

        scanner.close();
    }
}
```