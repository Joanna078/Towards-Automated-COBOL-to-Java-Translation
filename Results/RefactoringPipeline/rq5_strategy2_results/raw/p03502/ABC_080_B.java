```java
import java.util.Scanner;

public class ABC_080_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int d = n;
        int harshad = 0;

        while (d != 0) {
            int remainder = d % 10;
            harshad += remainder;
            d /= 10;
        }

        if (n % harshad == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```