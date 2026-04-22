```java
import java.util.Scanner;

public class ABC_104_A {

    private int returnCode;
    private int r;

    public static void main(String[] args) {
        ABC_104_A program = new ABC_104_A();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        r = scanner.nextInt();
        scanner.close();

        if (r < 1200) {
            System.out.println("ABC");
        } else if (r < 2800) {
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }

        returnCode = 0;
        System.exit(returnCode);
    }
}
```