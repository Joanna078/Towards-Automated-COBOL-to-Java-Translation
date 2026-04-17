```java
import java.util.Scanner;

public class Main {

    private int returnCode;
    private String n;

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-character string: ");
        n = scanner.nextLine().trim();

        if (n.length() != 3) {
            System.out.println("No");
            return;
        }

        if (n.contains("5")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```