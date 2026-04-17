```java
import java.util.Scanner;

public class ABC_068_A {

    private static final int MAX_LENGTH_N = 3;
    private static final int MAX_LENGTH_ANS = 18;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for N: ");
        String n = scanner.nextLine().substring(0, Math.min(n.length(), MAX_LENGTH_N));
        scanner.close();

        System.out.println("ABC" + n);
    }
}
```