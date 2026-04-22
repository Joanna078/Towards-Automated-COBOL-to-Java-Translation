```java
import java.util.Scanner;

public class ATCODER {

    private int returnCode;
    private int a1;
    private int a2;
    private int r1;
    private int g1;

    public static void main(String[] args) {
        ATCODER atcoder = new ATCODER();
        atcoder.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // ACCEPT a1
        System.out.print("Enter a1: ");
        a1 = scanner.nextInt();

        // ACCEPT a2
        System.out.print("Enter a2: ");
        a2 = scanner.nextInt();

        // DIVIDE a1 BY 500 GIVING g1 REMAINDER r1
        g1 = a1 / 500;
        r1 = a1 % 500;

        // IF r1 <= a2 THEN DISPLAY "Yes" ELSE DISPLAY "No"
        if (r1 <= a2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // STOP RUN
        System.exit(0);
    }
}
```