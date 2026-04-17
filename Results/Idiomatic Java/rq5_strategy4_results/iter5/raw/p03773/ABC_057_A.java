```java
import java.util.Scanner;

public class ABC_057_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        int sum = a + b;
        if (sum >= 24) {
            sum -= 24;
        }

        String ans = String.format("%02d", sum).substring(1);

        System.out.println(ans);
    }
}
```