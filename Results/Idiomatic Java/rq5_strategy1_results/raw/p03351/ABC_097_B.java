```java
import java.util.Scanner;

public class ABC_097_B {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private int maxlen = 52;
    private int cur = 1;
    private long i = 1;
    private long j = 0;
    private int len = 0;
    private int[] abcd1 = new int[4];

    public static void main(String[] args) {
        ABC_097_B program = new ABC_097_B();
        program.execute();
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
        for (int n = maxlen; n > 0; n--) {
            j = cur;
            while (j < inp.length() && inp.charAt((int) j - 1) != ' ') {
                j++;
            }
            len = (int) (j - cur);
            if (len > 0) {
                abcd1[(int) (i - 1)] = Integer.parseInt(inp.substring((int) cur - 1, (int) j - 1));
            }
            cur = (int) j + 1;
            i++;
        }
    }

    private void displayResult() {
        if (abcd1[0] <= abcd1[2] && abcd1[0] <= abcd1[3]) {
            System.out.println("Yes");
        } else if (abcd1[1] <= abcd1[2] && abcd1[1] <= abcd1[3]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```