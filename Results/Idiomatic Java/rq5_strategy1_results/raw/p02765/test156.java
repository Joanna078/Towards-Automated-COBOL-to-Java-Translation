```java
import java.util.Scanner;

public class Test156 {

    private boolean initialized = false;
    private int returnCode = 0;
    private String aaa = "000000000000000";
    private int a = 0;
    private int b = 0;
    private int rate = 0;
    private int x = 0;
    private int y = 0;
    private int naibu = 0;

    public static void main(String[] args) {
        Test156 test = new Test156();
        test.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        if (!initialized) {
            initialized = true;
        }

        // Accept input for AAA
        System.out.print("Enter AAA: ");
        aaa = scanner.nextLine();

        // Accept input for RATE
        System.out.print("Enter RATE: ");
        rate = Integer.parseInt(scanner.nextLine());

        // Extract values from AAA
        a = Integer.parseInt(aaa.substring(0, 2));
        b = Integer.parseInt(aaa.substring(2, 3));

        // Main logic
        if (a >= 10) {
            System.out.println("RATE: " + rate);
        } else {
            b = a;
            x = 10 - b;
            x *= 100;
            naibu = rate + x;
            System.out.println("NAIBU: " + naibu);
        }

        // Stop the program
        System.exit(returnCode);
    }
}
```