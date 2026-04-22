```java
import java.util.Scanner;

public class ABC_098_A {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private int maxlen = 50;
    private int cur = 2;
    private long i = 1;
    private long j = 0;
    private int len = 0;
    private int ans = 0;
    private int[] ab1 = new int[2];

    public static void main(String[] args) {
        new ABC_098_A().execute();
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
            j = cur;
            while (j < inp.length() && inp.charAt((int) j - 1) != ' ') {
                j++;
            }
            len = (int) (j - cur);
            if (len > 0) {
                ab1[(int) (i - 1)] = Integer.parseInt(inp.substring((int) cur - 1, (int) j));
            }
            cur = (int) j + 1;
            i++;
        }
    }

    private void displayResult() {
        int max = Math.max(ab1[0], ab1[1]);
        int min = Math.min(ab1[0], ab1[1]);
        int product = ab1[0] * ab1[1];
        ans = max + min - product;
        System.out.println("Result: " + ans);
    }
}
```