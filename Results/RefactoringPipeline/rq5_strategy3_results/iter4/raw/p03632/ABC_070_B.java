```java
import java.util.Scanner;

public class ABC_070_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();

        String[] parts = inp.split("\\s+");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        int C = Integer.parseInt(parts[2]);
        int D = Integer.parseInt(parts[3]);

        int mx = Math.max(A, C);
        int mn = Math.min(B, D);

        if (mx < mn) {
            mn -= mx;
        } else {
            mn = 0;
        }

        System.out.println(mn);
    }
}
```