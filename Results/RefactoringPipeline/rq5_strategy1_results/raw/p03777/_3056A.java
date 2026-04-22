```java
import java.util.Scanner;

public class Main {

    private static int RETURN_CODE = 0;
    private static String INP = "   ";
    private static char A = ' ';
    private static char B = ' ';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        INP = scanner.nextLine().trim();

        if (INP.length() > 3) {
            INP = INP.substring(0, 3);
        }

        A = INP.charAt(0);
        B = INP.charAt(1);

        if (A == 'H') {
            if (B == 'H') {
                System.out.println("H");
            } else {
                System.out.println("D");
            }
        } else {
            if (B == 'H') {
                System.out.println("D");
            } else {
                System.out.println("H");
            }
        }

        System.exit(RETURN_CODE);
    }
}
```