```java
import java.util.Scanner;

public class ABC_084_A {
    public static void main(String[] args) {
        // Declare and initialize variable M with user input
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());

        // Subtract M from 48 and store the result back in M
        m = 48 - m;

        // Display the value of M
        System.out.println(m);
        scanner.close();
    }
}
```