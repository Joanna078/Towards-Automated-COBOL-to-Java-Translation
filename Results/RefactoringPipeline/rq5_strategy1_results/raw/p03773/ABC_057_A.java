```java
import java.util.Scanner;

public class ABC_057_A {

    private int returnCode;
    private String inp;
    private int a;
    private int b;
    private String ans;
    private int zs;
    private char dummy;

    public static void main(String[] args) {
        ABC_057_A program = new ABC_057_A();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        String[] parts = inp.split("\\s+");
        a = Integer.parseInt(parts[0]);
        b = Integer.parseInt(parts[1]);

        zs = a + b;
        if (zs > 24) {
            zs -= 24;
        }

        ans = String.valueOf(zs);
        System.out.println("Result: " + ans);

        scanner.close();
    }
}
```