```java
import java.util.Scanner;

public class AtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String indata = scanner.nextLine();
        scanner.close();

        String[] parts = indata.split(" ");
        int a1 = Integer.parseInt(parts[0]);
        int a2 = Integer.parseInt(parts[1]);
        int a3 = Integer.parseInt(parts[2]);

        int r = a2 / a1;
        if (r >= a3) {
            System.out.printf("%d%n", a3);
        } else {
            System.out.printf("%d%n", r);
        }
    }
}
```