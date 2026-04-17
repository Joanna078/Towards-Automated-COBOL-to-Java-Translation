```java
import java.util.Arrays;

public class AisingC {

    private boolean initialized = false;
    private int entry;
    private int returnCode = 0;
    private int n;
    private int i;
    private int x;
    private int y;
    private int z;
    private int v;
    private int[] tbl = new int[10000];
    private String out = "";

    public static void main(String[] args) {
        new AisingC().run();
    }

    public void run() {
        if (!initialized) {
            initialize();
        }
        mainSection();
    }

    private void initialize() {
        Arrays.fill(tbl, 0);
        initialized = true;
    }

    private void mainSection() {
        System.out.print("Enter a number: ");
        n = Integer.parseInt(System.console().readLine());

        for (x = 1; x <= 100; x++) {
            for (y = 1; y <= 100; y++) {
                for (z = 1; z <= 100; z++) {
                    v = x * x + y * y + z * z + x * y + y * z + z * x;
                    if (v <= 10000) {
                        tbl[v - 1]++;
                    }
                }
            }
        }

        for (i = 1; i <= n; i++) {
            out = String.format("%03d", tbl[i - 1]);
            System.out.println(out.trim());
        }

        System.exit(returnCode);
    }
}
```