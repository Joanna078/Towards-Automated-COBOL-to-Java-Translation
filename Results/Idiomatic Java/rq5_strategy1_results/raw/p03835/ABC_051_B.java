```java
import java.util.Scanner;

public class ABC_051_B {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private int k = 0;
    private int s = 0;
    private String ans = "";
    private int cnt = 0;

    public static void main(String[] args) {
        ABC_051_B program = new ABC_051_B();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        String[] parts = inp.split("\\s+");
        if (parts.length >= 2) {
            k = Integer.parseInt(parts[0]);
            s = Integer.parseInt(parts[1]);
        }

        initialize();
        process();
        displayResult();
    }

    private void initialize() {
        if (!initialized) {
            returnCode = 0;
            inp = "";
            k = 0;
            s = 0;
            ans = "";
            cnt = 0;
            initialized = true;
        }
    }

    private void process() {
        for (int i = 1; i <= 3 * k; i++) {
            if (i > k) break;
            for (int j = 1; j <= 3 * k; j++) {
                if (j > k) break;
                int sum = i + j;
                if (sum <= s && sum <= k) {
                    cnt++;
                }
            }
        }
    }

    private void displayResult() {
        System.out.println("Result: " + cnt);
    }
}
```