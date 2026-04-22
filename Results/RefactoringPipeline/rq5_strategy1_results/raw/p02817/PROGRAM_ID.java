```java
import java.util.Scanner;

public class PROGRAM_ID {

    private boolean initialized = false;
    private int returnCode = 0;
    private String ln = " ".repeat(300);
    private String S = " ".repeat(100);
    private String T = " ".repeat(100);
    private String ans = " ".repeat(200);

    public static void main(String[] args) {
        new PROGRAM_ID().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        ln = scanner.nextLine();

        unstring(ln);
        stringConcatenate();
        displayResult();
    }

    private void unstring(String input) {
        String[] parts = input.split("\\s+");
        if (parts.length > 0) {
            S = parts[0];
        }
        if (parts.length > 1) {
            T = parts[1];
        }
    }

    private void stringConcatenate() {
        ans = T.trim() + S.trim();
    }

    private void displayResult() {
        System.out.println(ans.trim());
    }
}
```