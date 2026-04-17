```java
import java.util.Scanner;

public class ABC_052_B {

    private boolean initialized = false;
    private int returnCode = 0;
    private int n;
    private String s1;
    private int tmp;
    private int mx;
    private String ans;
    private int zs;
    private char dummy;
    private int i;

    public static void main(String[] args) {
        ABC_052_B program = new ABC_052_B();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter N: ");
        n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter S1: ");
        s1 = scanner.nextLine();

        // Initialize variables
        tmp = 0;
        mx = 0;
        ans = "";
        zs = 0;
        dummy = ' ';
        i = 1;

        // Perform loop
        while (i <= n) {
            char currentChar = s1.charAt(i - 1);
            if (currentChar == 'I') {
                tmp += 1;
            } else {
                tmp -= 1;
            }
            mx = Math.max(mx, tmp);
            i++;
        }

        zs = mx;
        unans();
        displayResult();
    }

    private void unans() {
        String[] parts = String.valueOf(zs).split(" ");
        dummy = parts[0].charAt(0);
        ans = parts[1];
    }

    private void displayResult() {
        System.out.println(ans);
    }
}
```