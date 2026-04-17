```java
import java.util.Scanner;

public class ABC_096_B {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private int k = 0;
    private int maxlen = 51;
    private int cur = 1;
    private long i = 1;
    private long j = 0;
    private int len = 0;
    private int mx = 0;
    private int tmp = 0;
    private String ans = "     ";
    private int zs = 0;
    private String abc1 = "000000";
    private char dummy = ' ';

    public static void main(String[] args) {
        ABC_096_B program = new ABC_096_B();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // ACCEPT INP
        System.out.print("Enter INP: ");
        inp = scanner.nextLine().trim();

        // ACCEPT K
        System.out.print("Enter K: ");
        k = Integer.parseInt(scanner.nextLine().trim());

        // MAIN SECTION
        for (int n0 = maxlen; n0 > 0; n0--) {
            j = cur;
            while (j <= inp.length() && inp.charAt((int) j - 1) != ' ') {
                j++;
            }
            len = (int) (j - cur);
            abc1 = abc1.substring(0, 2 * (int) i - 2) + inp.substring((int) cur - 1, (int) j - 1) + abc1.substring(2 * (int) i);
            cur++;
            i++;
        }

        // Compute sum of ABC1 values
        int sum = 0;
        for (int m = 0; m < 3; m++) {
            sum += Integer.parseInt(abc1.substring(m * 2, m * 2 + 2));
        }
        tmp = sum + Integer.parseInt(abc1.substring(6, 8));

        // Compute max value
        mx = Math.max(Integer.parseInt(abc1.substring(0, 2)), Math.max(Integer.parseInt(abc1.substring(2, 4)), Integer.parseInt(abc1.substring(4, 6))));

        // Compute final result
        zs = tmp - mx + (int) Math.pow(k, 2) * mx;

        // UNANS SECTION
        String[] parts = String.valueOf(zs).split(" ");
        ans = parts[parts.length - 1];

        // DISPLAY ans
        System.out.println("Result: " + ans.trim());

        scanner.close();
    }
}
```