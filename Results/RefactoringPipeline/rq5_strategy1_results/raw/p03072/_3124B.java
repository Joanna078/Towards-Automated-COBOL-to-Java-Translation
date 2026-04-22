```java
import java.util.Scanner;

public class Main {

    private int returnCode;
    private String inp;
    private int n;
    private int i;
    private int cnt;
    private int h;
    private int max;
    private int p1;
    private int p2;
    private int out;

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // ACCEPT N
        System.out.print("Enter N: ");
        n = scanner.nextInt();

        // ACCEPT INP
        System.out.print("Enter INP: ");
        scanner.nextLine(); // Consume newline
        inp = scanner.nextLine();

        cnt = 0;
        max = 0;
        p1 = 1;

        for (i = 1; i <= n; i++) {
            for (p2 = p1; p2 <= inp.length(); p2++) {
                String substring = inp.substring(p1 - 1, p2);
                if (substring.trim().isEmpty()) {
                    break;
                }
                h = substring.length();
                if (h >= max) {
                    cnt++;
                }
                if (h > max) {
                    max = h;
                }
                p1 = p2 + 1;
            }
        }

        out = cnt;
        System.out.println("Output: " + out);
    }
}
```