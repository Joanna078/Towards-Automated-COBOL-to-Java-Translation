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

        int r;
        if (a2 <= a1 && a3 <= a1) {
            r = 10 * a1 + a2 + a3;
        } else if (a1 <= a2 && a3 <= a2) {
            r = 10 * a2 + a1 + a3;
        } else {
            r = 10 * a3 + a2 + a1;
        }

        System.out.println(r);
    }
}
```