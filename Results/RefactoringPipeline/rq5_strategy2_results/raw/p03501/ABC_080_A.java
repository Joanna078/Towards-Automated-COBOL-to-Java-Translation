```java
import java.util.Scanner;

public class ABC_080_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        int n = Integer.parseInt(parts[0]);
        int a = Integer.parseInt(parts[1]);
        int b = Integer.parseInt(parts[2]);

        int t;
        if (a * n <= b) {
            t = a * n;
        } else {
            t = b;
        }

        String zs = String.format("%04d", t);
        String ans = zs.substring(1);

        System.out.println(ans);
    }
}
```