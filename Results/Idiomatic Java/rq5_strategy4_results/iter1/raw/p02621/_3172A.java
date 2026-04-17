```java
import java.util.Scanner;

public class Program172A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        scanner.close();

        int out = calculate(a);
        System.out.println(trim(out));
    }

    private static int calculate(int a) {
        return a + a * a + a * a * a;
    }

    private static String trim(int number) {
        return String.format("%04d", number).replaceFirst("^0+(?!$)", "");
    }
}
```