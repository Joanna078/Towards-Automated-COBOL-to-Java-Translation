```java
import java.util.Scanner;

public class ABC_026_A {

    private boolean initialized = false;
    private int returnCode = 0;
    private int N;
    private String INP;
    private int maxlen;
    private int cur;
    private long i;
    private long j;
    private int len;
    private String ans;
    private int sm;
    private int cnt;
    private String bk;
    private String a;
    private int ZS;
    private char DUMMY;

    public static void main(String[] args) {
        ABC_026_A program = new ABC_026_A();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // ACCEPT N
        System.out.print("Enter N: ");
        N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // ACCEPT INP
        System.out.print("Enter INP: ");
        INP = scanner.nextLine();

        maxlen = N;
        bk = "001";
        cnt = 1;
        cur = 1;
        i = 1;
        ans = "";

        for (int n = maxlen; n > 0; n--) {
            j = cur;
            while (INP.charAt((int) j - 1) != ' ') {
                j++;
            }

            len = (int) (j - cur);
            a = INP.substring((int) cur - 1, (int) j - 1);

            if (!bk.equals(a)) {
                cnt /= 2;
                sm += cnt;
                cnt = 1;
                bk = a;
            } else {
                cnt++;
            }

            cur = (int) j + 1;
            i++;
        }

        cnt /= 2;
        sm += cnt;
        ZS = sm;

        // UNSTRING ZS DELIMITED BY SPACE INTO ans
        String[] parts = Integer.toString(ZS).split(" ");
        ans = parts[0];

        // DISPLAY ans
        System.out.println("Result: " + ans);
    }
}
```