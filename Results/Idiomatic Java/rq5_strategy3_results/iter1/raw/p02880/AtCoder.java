```java
import java.util.Scanner;

public class AtCoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        scanner.close();

        boolean found = false;
        for (int B = 1; B <= 10; B++) {
            for (int C = 1; C <= 10; C++) {
                if (B * C == A) {
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```