```java
import java.util.Arrays;

public class ABC_103_A {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "           ";
    private int maxlen = 51;
    private String cur = "000000000001";
    private long i = 1;
    private long j = 1;
    private int len = 0;
    private String ans = "   ";
    private String A1 = "000000000";
    private String tmp = "000";
    private int sm = 0;
    private String ZS = "00000";
    private char DUMMY = ' ';

    public static void main(String[] args) {
        new ABC_103_A().execute();
    }

    public void execute() {
        if (!initialized) {
            initialize();
        }
        process();
    }

    private void initialize() {
        initialized = true;
    }

    private void process() {
        acceptInput();
        performMainSection();
        performUnansSection();
        displayResult();
        stopRun();
    }

    private void acceptInput() {
        System.out.print("Enter input: ");
        inp = new java.util.Scanner(System.in).nextLine().substring(0, Math.min(inp.length(), maxlen));
    }

    private void performMainSection() {
        for (int n0 = maxlen; n0 > 0; n0--) {
            j = cur.length();
            while (j <= inp.length() && inp.charAt((int) j - 1) != ' ') {
                j++;
            }
            len = (int) (j - cur.length());
            A1 = A1.substring(0, 3 * (int) i - 3) + inp.substring((int) cur.length() - 1, (int) j - 1) + A1.substring(3 * (int) i);
            cur = Long.toString(Long.parseLong(cur) + 1);
        }
        i = 1;
        while (i <= 3) {
            j = i + 1;
            while (j <= 3) {
                if (A1.substring(3 * (int) j - 3, 3 * (int) j).compareTo(A1.substring(3 * (int) i - 3, 3 * (int) i)) < 0) {
                    tmp = A1.substring(3 * (int) i - 3, 3 * (int) i);
                    A1 = A1.substring(0, 3 * (int) i - 3) + A1.substring(3 * (int) j - 3, 3 * (int) j) + A1.substring(3 * (int) i, 3 * (int) j - 3) + tmp + A1.substring(3 * (int) j);
                }
                j++;
            }
            i++;
        }
        sm = 0;
        sm += Integer.parseInt(A1.substring(3 * 1 - 3, 3 * 1)) - Integer.parseInt(A1.substring(3 * 0 - 3, 3 * 0));
        sm += Integer.parseInt(A1.substring(3 * 1 - 3, 3 * 1)) - Integer.parseInt(A1.substring(3 * 2 - 3, 3 * 2));
        ZS = Integer.toString(sm);
    }

    private void performUnansSection() {
        String[] parts = ZS.split(" ");
        ans = parts[parts.length - 1];
    }

    private void displayResult() {
        System.out.println("Result: " + ans);
    }

    private void stopRun() {
        System.exit(returnCode);
    }
}
```