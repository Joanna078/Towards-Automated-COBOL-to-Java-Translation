```java
import java.util.Scanner;

public class PROGRAM_ID {

    private boolean initialized = false;
    private int returnCode = 0;
    private String ln = "";
    private int K = 0;
    private int X = 0;
    private int i = 0;
    private int nl = 0;
    private int sp = 0;
    private int st = 0;
    private int ed = 0;
    private String ans = "";

    public static void main(String[] args) {
        new PROGRAM_ID().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values separated by space: ");
        ln = scanner.nextLine();
        String[] parts = ln.split("\\s+");
        if (parts.length >= 2) {
            K = Integer.parseInt(parts[0]);
            X = Integer.parseInt(parts[1]);
        }
        scanner.close();

        st = X - K + 1;
        ed = X + K - 1;

        if (K == 10) {
            nl = 1;
        }

        displayResults();
    }

    private void displayResults() {
        for (i = st; i <= ed; i++) {
            if (sp != 0) {
                System.out.print(" ");
            }
            if (i != 0) {
                if (nl != 0) {
                    System.out.print(i);
                } else {
                    System.out.print(i);
                }
            } else {
                if (nl != 0) {
                    System.out.print("0");
                } else {
                    System.out.print("0");
                }
            }
        }
        System.out.println();
    }
}
```