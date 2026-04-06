```java
import java.util.Scanner;

public class ADiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String c1 = scanner.nextLine();
        String c2 = scanner.nextLine();
        String c3 = scanner.nextLine();

        // Output processing
        System.out.println(c1.charAt(0) + "" + c2.charAt(1) + "" + c3.charAt(2));

        scanner.close();
    }
}
```