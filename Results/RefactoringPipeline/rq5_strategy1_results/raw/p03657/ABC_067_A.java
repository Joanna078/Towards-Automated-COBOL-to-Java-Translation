```java
import java.util.Scanner;

public class ABC_067_A {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private int a = 0;
    private int b = 0;
    private int moda = 0;
    private int modb = 0;
    private int modab = 0;

    public static void main(String[] args) {
        ABC_067_A program = new ABC_067_A();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        if (inp.length() != 7) {
            System.out.println("Invalid input length.");
            return;
        }

        a = Integer.parseInt(inp.substring(0, 3).trim());
        b = Integer.parseInt(inp.substring(3, 6).trim());

        moda = a % 3;
        modb = b % 3;
        b += a;
        modab = b % 3;

        if (moda == 1 || modb == 1 || modab == 1) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
}
```