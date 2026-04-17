```java
import java.nio.charset.StandardCharsets;

public class Main {

    private boolean initialized = false;
    private int returnCode = 0;
    private String s = "   ";

    public static void main(String[] args) {
        Main main = new Main();
        main.execute();
    }

    public void execute() {
        if (!initialized) {
            initialized = true;
        }

        acceptInput();
        processInput();
    }

    private void acceptInput() {
        System.out.print("Enter a string: ");
        s = new java.util.Scanner(System.in).nextLine().substring(0, Math.min(s.length(), 3));
    }

    private void processInput() {
        if ("ABC".equals(s)) {
            System.out.println("ARC");
        } else {
            System.out.println("ABC");
        }
    }
}
```