```java
import java.util.Scanner;

public class ABC_058_B {

    private boolean initialized = false;
    private int returnCode = 0;
    private String O = "";
    private String E = "";
    private String ans = "";
    private int len = 0;

    public static void main(String[] args) {
        new ABC_058_B().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // ACCEPT O
        System.out.print("Enter O: ");
        O = scanner.nextLine();

        // ACCEPT E
        System.out.print("Enter E: ");
        E = scanner.nextLine();

        // COMPUTE len
        len = O.length();

        // PERFORM VARYING i FROM 1 BY 1 UNTIL i > len
        for (int i = 0; i < len; i++) {
            // STRING O(i:i) DELIMITED BY SIZE, E(i:i) DELIMITED BY SIZE INTO ans
            ans += O.charAt(i) + E.charAt(i);
        }

        // DISPLAY ans
        System.out.println("Result: " + ans);

        // STOP RUN
        System.exit(returnCode);
    }
}
```