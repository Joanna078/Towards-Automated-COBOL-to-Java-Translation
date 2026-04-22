```java
import java.util.Scanner;

public class Main {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = " ".repeat(100);
    private int q = 0;
    private int pos1 = 0;
    private int pos2 = 0;
    private char[] forma = new char[500000];
    private char t = '0';
    private char f = '0';
    private char c = ' ';
    private char w = ' ';
    private int i = 0;

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // Initialize program
        if (!initialized) {
            initialized = true;
            pos1 = 200000;
            pos2 = 200000;
            forma[pos1] = ' ';
            forma[pos2] = ' ';
        }

        // Accept input
        System.out.print("Enter FORMA: ");
        String input = scanner.nextLine();
        for (int j = 0; j < input.length() && j < forma.length; j++) {
            forma[j] = input.charAt(j);
        }

        // Unstring
        String[] parts = input.split(" ");
        if (parts.length > 1) {
            pos2 = Integer.parseInt(parts[1]);
        }

        // Compute
        pos1 += 200000;
        pos2 += 200000;

        // Accept Q
        System.out.print("Enter Q: ");
        q = scanner.nextInt();

        // Perform loop
        for (i = 1; i <= q; i++) {
            // Accept INP
            System.out.print("Enter INP: ");
            inp = scanner.next();

            // Unstring
            String[] inpParts = inp.split(" ");
            t = inpParts[0].charAt(0);
            f = inpParts[1].charAt(0);
            c = inpParts[2].charAt(0);

            // IF logic
            if (t == '1') {
                w = forma[pos1 - 1];
                forma[pos1 - 1] = forma[pos2 - 1];
                forma[pos2 - 1] = w;
            } else if (f == '1') {
                pos1--;
                forma[pos1 - 1] = c;
            } else {
                pos2++;
                forma[pos2 - 1] = c;
            }
        }

        // Display result
        StringBuilder result = new StringBuilder();
        for (int j = pos1 - 1; j <= pos2 - 1; j++) {
            result.append(forma[j]);
        }
        System.out.println(result.toString());

        // Stop
        System.exit(returnCode);
    }
}
```