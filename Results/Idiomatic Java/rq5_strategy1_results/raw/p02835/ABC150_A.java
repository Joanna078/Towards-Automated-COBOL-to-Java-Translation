```java
import java.util.Scanner;

public class ABC150_A {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inputLine = "";
    private String a1 = "";
    private String a2 = "";
    private String a3 = "";

    public static void main(String[] args) {
        ABC150_A program = new ABC150_A();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter line: ");
        inputLine = scanner.nextLine();
        scanner.close();

        processInput();
    }

    private void processInput() {
        int p1 = 1;
        int p2 = 1;

        // Extract A1
        while (p2 <= inputLine.length() && inputLine.charAt(p2 - 1) != ' ') {
            p2++;
        }
        a1 = inputLine.substring(p1 - 1, p2 - 1);
        p1 = p2 + 1;
        p2 = 1;

        // Extract A2
        while (p2 <= inputLine.length() && inputLine.charAt(p2 - 1) != ' ') {
            p2++;
        }
        a2 = inputLine.substring(p1 - 1, p2 - 1);
        p1 = p2 + 1;
        p2 = 1;

        // Extract A3
        while (p2 <= inputLine.length() && inputLine.charAt(p2 - 1) != ' ') {
            p2++;
        }
        a3 = inputLine.substring(p1 - 1, p2 - 1);

        checkCondition();
    }

    private void checkCondition() {
        int sumA1A2 = Integer.parseInt(a1) + Integer.parseInt(a2);
        int sumA1A2A3 = sumA1A2 + Integer.parseInt(a3);

        if (sumA1A2A3 <= 21) {
            System.out.println("win");
        } else {
            System.out.println("bust");
        }
    }
}
```