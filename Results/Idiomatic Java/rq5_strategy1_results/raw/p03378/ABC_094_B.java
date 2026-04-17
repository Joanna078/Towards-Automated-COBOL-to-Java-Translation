```java
import java.util.Scanner;

public class ABC_094_B {

    private boolean initialized = false;
    private int entry;
    private int returnCode;
    private String inp;
    private String inp2;
    private int maxlen;
    private int cur;
    private int i;
    private int j;
    private int m;
    private int n;
    private int len;
    private String ans;
    private int[] nmX1 = new int[100];
    private char[] a1 = new char[100];
    private int x;
    private int tmp;
    private int sm;
    private int zs;
    private char dummy;

    public static void main(String[] args) {
        ABC_094_B program = new ABC_094_B();
        program.ABC_094_B_(0);
    }

    public int ABC_094_B_(int entry) {
        this.entry = entry;
        return runModule(entry);
    }

    private int runModule(int entry) {
        if (entry < 0) {
            if (!initialized) {
                initialize();
                return 0;
            }
            resetVariables();
            initialized = false;
            return 0;
        }

        if (!initialized) {
            initialize();
        }

        mainSection();
        return returnCode;
    }

    private void initialize() {
        initialized = true;
        returnCode = 0;
        inp = " ".repeat(12);
        inp2 = " ".repeat(401);
        maxlen = 51;
        cur = 1;
        i = 1;
        j = 0;
        m = 0;
        n = 0;
        len = 0;
        ans = " ".repeat(3);
        for (int k = 0; k < 100; k++) {
            nmX1[k] = 0;
        }
        x = 0;
        tmp = 0;
        sm = 101;
        zs = 0;
        dummy = ' ';
    }

    private void resetVariables() {
        returnCode = 0;
        inp = " ".repeat(12);
        inp2 = " ".repeat(401);
        cur = 1;
        i = 1;
        j = 0;
        m = 0;
        n = 0;
        len = 0;
        ans = " ".repeat(3);
        for (int k = 0; k < 100; k++) {
            nmX1[k] = 0;
        }
        x = 0;
        tmp = 0;
        sm = 101;
        zs = 0;
        dummy = ' ';
    }

    private void mainSection() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter INP: ");
        inp = scanner.nextLine().trim();
        System.out.print("Enter INP2: ");
        inp2 = scanner.nextLine().trim();

        for (int n0 = maxlen; n0 > 0; n0--) {
            j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            nmX1[i - 1] = Integer.parseInt(inp.substring(cur - 1, cur + len - 1));
            cur++;
            i++;
        }

        cur = 1;
        maxlen = nmX1[0];

        for (int n1 = maxlen; n1 > 0; n1--) {
            j = cur;
            while (j < inp2.length() && inp2.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            x = Integer.parseInt(inp2.substring(cur - 1, cur + len - 1));
            a1[x - 1] = '1';
            cur++;
        }

        tmp = 0;
        m = nmX1[1];
        while (m <= nmX1[0]) {
            tmp += a1[m - 1] - '0';
            m++;
        }
        sm = Math.min(sm, tmp);

        tmp = 0;
        n = nmX1[1];
        while (n > 0) {
            tmp += a1[n - 1] - '0';
            n--;
        }
        sm = Math.min(sm, tmp);

        zs = sm;
        unansSection();
    }

    private void unansSection() {
        String[] parts = String.valueOf(zs).split(" ");
        ans = parts[parts.length - 1];
        System.out.println("ANS: " + ans);
    }
}
```