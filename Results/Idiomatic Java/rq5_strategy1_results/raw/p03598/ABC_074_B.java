```java
import java.util.Scanner;

public class ABC_074_B {

    private boolean initialized = false;
    private int returnCode = 0;
    private int N, K;
    private String INP;
    private int maxlen, cur, i, j, len, x, sm;
    private String ans = "     ";
    private char DUMMY;

    public static void main(String[] args) {
        ABC_074_B program = new ABC_074_B();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // ACCEPT N
        System.out.print("Enter N: ");
        N = scanner.nextInt();

        // ACCEPT K
        System.out.print("Enter K: ");
        K = scanner.nextInt();

        // ACCEPT INP
        scanner.nextLine(); // Consume newline
        System.out.print("Enter INP: ");
        INP = scanner.nextLine();

        maxlen = N;
        cur = 1;

        for (int n = maxlen; n > 0; n--) {
            j = cur;
            while (INP.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            x = Math.min(2, Math.max(0, K - x));
            x *= 2;
            sm += x;
            cur = j + 1;
            i++;
        }

        ans = Integer.toString(sm).substring(0, Math.min(5, Integer.toString(sm).length()));

        // Display ans
        System.out.println("Result: " + ans);

        // STOP RUN
        System.exit(returnCode);
    }
}
```