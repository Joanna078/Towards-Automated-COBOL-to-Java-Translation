```java
import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values: ");
        String ln = scanner.nextLine();
        scanner.close();

        String[] parts = ln.split("\\s+");
        int K = Integer.parseInt(parts[0]);
        int X = Integer.parseInt(parts[1]);

        int st = X - K + 1;
        int ed = X + K - 1;
        int i = st;
        int nl = 0;
        int sp = 0;

        if (K == 1) {
            nl = 1;
            disp(i, nl, sp);
            return;
        } else {
            disp(i, nl, sp);
        }

        sp = 1;
        st++;

        for (i = st; i <= ed; i++) {
            disp(i, nl, sp);
        }

        nl = 1;
        disp(i, nl, sp);
    }

    private static void disp(int i, int nl, int sp) {
        if (sp != 0) {
            System.out.print(" ");
        }
        if (i != 0) {
            if (nl != 0) {
                System.out.println(i);
            } else {
                System.out.print(i);
            }
        } else {
            if (nl != 0) {
                System.out.println(0);
            } else {
                System.out.print(0);
            }
        }
    }
}
```