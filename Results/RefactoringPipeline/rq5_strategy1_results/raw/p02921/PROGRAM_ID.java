```java
import java.util.Scanner;

public class PROGRAM_ID {

    private boolean initialized = false;
    private int returnCode = 0;
    private String S = "";
    private String T = "";
    private int i = 0;
    private int ans = 0;

    public static void main(String[] args) {
        new PROGRAM_ID().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        if (!initialized) {
            initialized = true;
        }

        // Accept input
        System.out.print("Enter string S: ");
        S = scanner.nextLine();
        System.out.print("Enter string T: ");
        T = scanner.nextLine();

        // Perform loop
        for (i = 0; i < S.length(); i++) {
            if (S.charAt(i) == T.charAt(i)) {
                ans++;
            }
        }

        // Display result
        System.out.println("Number of matching characters: " + ans);

        // Stop program
        System.exit(returnCode);
    }
}
```