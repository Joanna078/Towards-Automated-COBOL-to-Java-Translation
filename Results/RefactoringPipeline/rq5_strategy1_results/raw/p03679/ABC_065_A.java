```java
import java.util.Scanner;

public class ABC_065_A {

    private static final String DELICIOUS = "delicious";
    private static final String SAFE = "safe";
    private static final String DANGEROUS = "dangerous";

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input = scanner.nextLine();
        processInput(input);
    }

    private static void processInput(String input) {
        String[] parts = input.split("\\s+");
        if (parts.length != 3) {
            System.out.println("Invalid input");
            return;
        }

        String x = parts[0];
        String a = parts[1];
        String b = parts[2];

        int numX = Integer.parseInt(x);
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);

        int result = numB - numA;

        if (result <= 10) {
            System.out.println(DELICIOUS);
        } else if (result <= numX) {
            System.out.println(SAFE);
        } else {
            System.out.println(DANGEROUS);
        }
    }
}
```