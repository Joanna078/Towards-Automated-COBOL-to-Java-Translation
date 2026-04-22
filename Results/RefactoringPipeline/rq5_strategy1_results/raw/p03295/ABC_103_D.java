```java
import java.util.Scanner;

public class ABC_103_D {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private int n = 0;
    private int m = 0;
    private int[] ab1 = new int[100000];
    private int done = 0;
    private String ans = "";
    private int zs = 0;
    private char dummy = ' ';
    private int i = 0;
    private int cnt = 0;

    public static void main(String[] args) {
        new ABC_103_D().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter input: ");
        inp = scanner.nextLine();

        // Unstring input
        String[] parts = inp.split("\\s+");
        n = Integer.parseInt(parts[0]);
        m = Integer.parseInt(parts[1]);

        // Perform loop
        for (i = 1; i <= m; i++) {
            System.out.print("Enter input: ");
            inp = scanner.nextLine();
            parts = inp.split("\\s+");
            ab1[(i - 1) * 2] = Integer.parseInt(parts[0]);
            ab1[(i - 1) * 2 + 1] = Integer.parseInt(parts[1]);
        }

        // Sort array
        for (int j = 0; j < m * 2; j++) {
            for (int k = 0; k < m * 2 - 1; k++) {
                if (ab1[k] > ab1[k + 1]) {
                    int temp = ab1[k];
                    ab1[k] = ab1[k + 1];
                    ab1[k + 1] = temp;
                }
            }
        }

        // Process sorted array
        for (i = 1; i <= m; i++) {
            if (ab1[(i - 1) * 2] != done) {
                cnt++;
                done = ab1[(i - 1) * 2 + 1];
            }
        }

        zs = cnt;

        // Unstring zs
        ans = String.valueOf(zs);

        // Display result
        System.out.println("Result: " + ans);
    }
}
```