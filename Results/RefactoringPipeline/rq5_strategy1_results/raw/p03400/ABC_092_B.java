```java
import java.util.Scanner;

public class ABC_092_B {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private int maxlen = 50;
    private String cur = "00000001";
    private long i = 1;
    private long j = 0;
    private int k = 0;
    private int p = 0;
    private int q = 0;
    private int len = 0;
    private int zs = 0;
    private String ans = "     ";
    private int dx1 = 0;
    private int[] a1 = new int[100];
    private int x = 0;
    private int r = 0;
    private int n = 0;
    private int sm = 0;
    private char dummy = ' ';

    public static void main(String[] args) {
        new ABC_092_B().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter N: ");
        n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter INP: ");
        inp = scanner.nextLine();

        // Main processing
        for (int n0 = maxlen; n0 > 0; n0--) {
            j = cur.length();
            while (j < inp.length() && inp.charAt((int) j) != ' ') {
                j++;
            }
            len = (int) (j - cur.length());
            dx1 = Integer.parseInt(inp.substring(cur.length() - 1, cur.length() + len - 1));
            cur = Long.toString(Long.parseLong(cur) + 1);
            i++;
        }

        k = 1;
        while (k <= n) {
            System.out.print("Enter value for A" + k + ": ");
            a1[k - 1] = scanner.nextInt();
            k++;
        }

        sm = 0;
        p = 0;
        while (p < dx1) {
            q = 1;
            while (q <= n) {
                if (p == 0) {
                    sm++;
                } else {
                    x = dx1 / a1[q - 1];
                    r = dx1 % a1[q - 1];
                    if (r == 0) {
                        sm++;
                    }
                }
                q++;
            }
            p++;
        }

        sm += dx1;
        ans = String.valueOf(sm);

        // Display result
        System.out.println("Result: " + ans.trim());

        scanner.close();
    }
}
```