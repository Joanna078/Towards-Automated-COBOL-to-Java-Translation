```java
import java.util.Scanner;

public class ABC_066_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers separated by spaces: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("\\s+");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);

        int tmp = a + b + c;
        c = Math.max(a, Math.max(b, c));
        c -= tmp;

        String zs = String.format("%06d", c);
        String ans = zs.substring(1);

        System.out.println(ans.trim());
    }
}
```