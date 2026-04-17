```java
import java.util.Scanner;

public class ABC_091_A {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private int maxlen = 51;
    private String cur = "0000000000001";
    private long i = 1;
    private long j = 1;
    private int len = 0;
    private int tmp = 0;
    private String abc1 = "000000000000";

    public static void main(String[] args) {
        new ABC_091_A().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine();
        scanner.close();

        processInput();
        displayResult();
    }

    private void processInput() {
        for (int n0 = maxlen; n0 > 0; n0--) {
            j = cur.length();
            while (j < inp.length() && inp.charAt((int) j - 1) != ' ') {
                j++;
            }
            len = (int) (j - Long.parseLong(cur));
            abc1 = abc1.substring(0, 4 * ((int) i - 1)) + inp.substring((int) cur - 1, (int) j - 1) + abc1.substring(4 * (int) i);
            cur = String.valueOf(j + 1);
            i++;
        }
        tmp = Integer.parseInt(abc1.substring(0, 4)) + Integer.parseInt(abc1.substring(4, 8));
    }

    private void displayResult() {
        if (tmp < Integer.parseInt(abc1.substring(8, 12))) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```