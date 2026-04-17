```java
import java.util.Scanner;

public class PROGRAM_ID {

    private boolean initialized = false;
    private int returnCode = 0;
    private char a = ' ';

    public static void main(String[] args) {
        new PROGRAM_ID().execute();
    }

    public void execute() {
        if (!initialized) {
            initialized = true;
        }
        mainSection();
    }

    private void mainSection() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        a = scanner.next().charAt(0);

        if (a <= 'Z') {
            System.out.println("A");
        } else {
            System.out.println("a");
        }

        System.exit(returnCode);
    }
}
```