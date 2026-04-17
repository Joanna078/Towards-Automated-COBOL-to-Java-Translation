```java
import java.util.Scanner;

public class AtCoder {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int A = scanner.nextInt();
        int B = 1;
        int C = 1;
        int t = 0;

        while (B <= 10) {
            while (C <= 10) {
                if (A == B * C) {
                    t = 1;
                    break;
                }
                C++;
            }
            if (t == 1) {
                break;
            }
            B++;
            C = 1;
        }

        if (t == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```