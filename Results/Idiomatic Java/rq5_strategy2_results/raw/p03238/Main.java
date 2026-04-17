```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = scanner.nextInt();

        if (N == 1) {
            System.out.println("Hello World");
        } else if (N == 2) {
            System.out.print("Enter first digit: ");
            int A = scanner.nextInt();
            System.out.print("Enter second digit: ");
            int B = scanner.nextInt();

            int C = A + B;

            if (C > 9) {
                System.out.println(C);
            } else {
                System.out.println(C);
            }
        } else {
            System.out.println("ERR!");
        }

        scanner.close();
    }
}
```