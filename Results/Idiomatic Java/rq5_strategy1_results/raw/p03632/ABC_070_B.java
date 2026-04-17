```java
import java.util.Scanner;

public class ABC_070_B {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int mx = 0;
    private int mn = 0;
    private int zs = 0;
    private char dummy = ' ';
    private String ans = "";

    public static void main(String[] args) {
        ABC_070_B program = new ABC_070_B();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        if (parts.length >= 4) {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[1]);
            c = Integer.parseInt(parts[2]);
            d = Integer.parseInt(parts[3]);
        }

        mx = Math.max(a, c);
        mn = Math.min(b, d);

        if (mn < mx) {
            zs = mn - mx;
        } else {
            zs = 0;
        }

        ans = String.valueOf(zs);
        System.out.println("Result: " + ans);
    }
}
```