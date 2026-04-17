```java
import java.util.Scanner;

public class ATCODER {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String indata = scanner.nextLine();
        scanner.close();

        String[] parts = indata.split("\\s+");
        int a1 = Integer.parseInt(parts[0]);
        int a2 = Integer.parseInt(parts[1]);
        int a3 = Integer.parseInt(parts[2]);

        a2 = a2 + (a1 * 3);
        int g = a2 / 2;

        System.out.printf("%20d%n", g);
    }
}
```